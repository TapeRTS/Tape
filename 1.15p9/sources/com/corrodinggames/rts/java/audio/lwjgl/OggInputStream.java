package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.java.audio.p050a.C1132c;
import com.corrodinggames.rts.java.audio.p050a.C1148s;
import com.jcraft.jogg.Packet;
import com.jcraft.jogg.Page;
import com.jcraft.jogg.StreamState;
import com.jcraft.jogg.SyncState;
import com.jcraft.jorbis.Block;
import com.jcraft.jorbis.Comment;
import com.jcraft.jorbis.DspState;
import com.jcraft.jorbis.Info;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/lwjgl/OggInputStream.class */
public class OggInputStream extends InputStream {
    private static final int BUFFER_SIZE = 512;
    private int convsize;
    private byte[] convbuffer;
    private InputStream input;
    private Info oggInfo;
    private boolean endOfStream;
    private SyncState syncState;
    private StreamState streamState;
    private Page page;
    private Packet packet;
    private Comment comment;
    private DspState dspState;
    private Block vorbisBlock;
    byte[] buffer;
    int bytes;
    boolean bigEndian;
    boolean endOfBitStream;
    boolean inited;
    private int readIndex;
    private byte[] outBuffer;
    private int outIndex;
    private int total;

    public OggInputStream(InputStream inputStream) {
        this(inputStream, null);
    }

    public OggInputStream(InputStream inputStream, OggInputStream oggInputStream) {
        this.convsize = 2048;
        this.oggInfo = new Info();
        this.syncState = new SyncState();
        this.streamState = new StreamState();
        this.page = new Page();
        this.packet = new Packet();
        this.comment = new Comment();
        this.dspState = new DspState();
        this.vorbisBlock = new Block(this.dspState);
        this.bytes = 0;
        this.bigEndian = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
        this.endOfBitStream = true;
        this.inited = false;
        if (oggInputStream == null) {
            this.convbuffer = new byte[this.convsize];
            this.outBuffer = new byte[2048000];
        } else {
            this.convbuffer = oggInputStream.convbuffer;
            this.outBuffer = oggInputStream.outBuffer;
        }
        this.input = inputStream;
        try {
            this.total = inputStream.available();
            init();
        } catch (IOException e) {
            throw new C1132c(e);
        }
    }

    public int getLength() {
        return this.total;
    }

    public int getChannels() {
        return this.oggInfo.channels;
    }

    public int getSampleRate() {
        return this.oggInfo.rate;
    }

    private void init() {
        initVorbis();
        readPCM();
    }

    public int available() {
        return this.endOfStream ? 0 : 1;
    }

    private void initVorbis() {
        this.syncState.init();
    }

    private boolean getPageAndPacket() {
        int pageout;
        int packetout;
        int buffer = this.syncState.buffer((int) BUFFER_SIZE);
        if (buffer == -1) {
            return false;
        }
        this.buffer = this.syncState.data;
        if (this.buffer == null) {
            this.endOfStream = true;
            return false;
        }
        try {
            this.bytes = this.input.read(this.buffer, buffer, BUFFER_SIZE);
            this.syncState.wrote(this.bytes);
            if (this.syncState.pageout(this.page) != 1) {
                if (this.bytes >= BUFFER_SIZE) {
                    throw new C1132c("Input does not appear to be an Ogg bitstream.");
                }
                return false;
            }
            this.streamState.init(this.page.serialno());
            this.oggInfo.init();
            this.comment.init();
            if (this.streamState.pagein(this.page) < 0) {
                throw new C1132c("Error reading first page of Ogg bitstream.");
            }
            if (this.streamState.packetout(this.packet) != 1) {
                throw new C1132c("Error reading initial header packet.");
            }
            if (this.oggInfo.synthesis_headerin(this.comment, this.packet) < 0) {
                throw new C1132c("Ogg bitstream does not contain Vorbis audio data.");
            }
            int i = 0;
            while (i < 2) {
                while (i < 2 && (pageout = this.syncState.pageout(this.page)) != 0) {
                    if (pageout == 1) {
                        this.streamState.pagein(this.page);
                        while (i < 2 && (packetout = this.streamState.packetout(this.packet)) != 0) {
                            if (packetout == -1) {
                                throw new C1132c("Corrupt secondary header.");
                            }
                            this.oggInfo.synthesis_headerin(this.comment, this.packet);
                            i++;
                        }
                    }
                }
                int buffer2 = this.syncState.buffer((int) BUFFER_SIZE);
                if (buffer2 == -1) {
                    return false;
                }
                this.buffer = this.syncState.data;
                try {
                    this.bytes = this.input.read(this.buffer, buffer2, BUFFER_SIZE);
                    if (this.bytes == 0 && i < 2) {
                        throw new C1132c("End of file before finding all Vorbis headers.");
                    }
                    this.syncState.wrote(this.bytes);
                } catch (Exception e) {
                    throw new C1132c("Failed to read Vorbis.", e);
                }
            }
            this.convsize = BUFFER_SIZE / this.oggInfo.channels;
            this.dspState.synthesis_init(this.oggInfo);
            this.vorbisBlock.init(this.dspState);
            return true;
        } catch (Exception e2) {
            throw new C1132c("Failure reading Vorbis.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0073, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [float[][], float[][][]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void readPCM() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.java.audio.lwjgl.OggInputStream.readPCM():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    public int read() {
        if (this.readIndex >= this.outIndex) {
            this.outIndex = 0;
            readPCM();
            this.readIndex = 0;
            if (this.outIndex == 0) {
                return -1;
            }
        }
        byte b = this.outBuffer[this.readIndex];
        if (b < 0) {
            b = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU + b;
        }
        this.readIndex++;
        return b;
    }

    public boolean atEnd() {
        return this.endOfStream && this.readIndex >= this.outIndex;
    }

    public int read(byte[] bArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            int read = read();
            if (read >= 0) {
                bArr[i3] = (byte) read;
            } else if (i3 == 0) {
                return -1;
            } else {
                return i3;
            }
        }
        return i2;
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public void close() {
        C1148s.m305a(this.input);
    }
}
