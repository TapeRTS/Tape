package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.java.audio.p044a.C0866c;
import com.corrodinggames.rts.java.audio.p044a.C0882s;
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
            throw new C0866c(e);
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

    @Override // java.io.InputStream
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
            if (this.syncState.pageout(this.page) == 1) {
                this.streamState.init(this.page.serialno());
                this.oggInfo.init();
                this.comment.init();
                if (this.streamState.pagein(this.page) < 0) {
                    throw new C0866c("Error reading first page of Ogg bitstream.");
                } else if (this.streamState.packetout(this.packet) != 1) {
                    throw new C0866c("Error reading initial header packet.");
                } else if (this.oggInfo.synthesis_headerin(this.comment, this.packet) < 0) {
                    throw new C0866c("Ogg bitstream does not contain Vorbis audio data.");
                } else {
                    int i = 0;
                    while (i < 2) {
                        while (i < 2 && (pageout = this.syncState.pageout(this.page)) != 0) {
                            if (pageout == 1) {
                                this.streamState.pagein(this.page);
                                while (i < 2 && (packetout = this.streamState.packetout(this.packet)) != 0) {
                                    if (packetout == -1) {
                                        throw new C0866c("Corrupt secondary header.");
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
                            if (this.bytes != 0 || i >= 2) {
                                this.syncState.wrote(this.bytes);
                            } else {
                                throw new C0866c("End of file before finding all Vorbis headers.");
                            }
                        } catch (Exception e) {
                            throw new C0866c("Failed to read Vorbis.", e);
                        }
                    }
                    this.convsize = BUFFER_SIZE / this.oggInfo.channels;
                    this.dspState.synthesis_init(this.oggInfo);
                    this.vorbisBlock.init(this.dspState);
                    return true;
                }
            } else if (this.bytes < BUFFER_SIZE) {
                return false;
            } else {
                throw new C0866c("Input does not appear to be an Ogg bitstream.");
            }
        } catch (Exception e2) {
            throw new C0866c("Failure reading Vorbis.", e2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0073, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [float[][], float[][][]] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void readPCM() {
        int pageout;
        boolean z = false;
        while (true) {
            if (this.endOfBitStream) {
                if (!getPageAndPacket()) {
                    this.syncState.clear();
                    this.endOfStream = true;
                    return;
                }
                this.endOfBitStream = false;
            }
            if (!this.inited) {
                this.inited = true;
                return;
            }
            ?? r0 = new float[1];
            int[] iArr = new int[this.oggInfo.channels];
            while (!this.endOfBitStream) {
                while (!this.endOfBitStream && (pageout = this.syncState.pageout(this.page)) != 0) {
                    if (pageout == -1) {
                        AbstractC0789l.m681b("gdx-audio", "Error reading OGG: Corrupt or missing data in bitstream.");
                    } else {
                        this.streamState.pagein(this.page);
                        while (true) {
                            int packetout = this.streamState.packetout(this.packet);
                            if (packetout == 0) {
                                if (this.page.eos() != 0) {
                                    this.endOfBitStream = true;
                                }
                                if (!this.endOfBitStream && z) {
                                    return;
                                }
                            } else if (packetout != -1) {
                                if (this.vorbisBlock.synthesis(this.packet) == 0) {
                                    this.dspState.synthesis_blockin(this.vorbisBlock);
                                }
                                while (true) {
                                    int synthesis_pcmout = this.dspState.synthesis_pcmout((float[][][]) r0, iArr);
                                    if (synthesis_pcmout > 0) {
                                        Object[] objArr = r0[0];
                                        int i = synthesis_pcmout < this.convsize ? synthesis_pcmout : this.convsize;
                                        for (int i2 = 0; i2 < this.oggInfo.channels; i2++) {
                                            int i3 = i2 * 2;
                                            int i4 = iArr[i2];
                                            for (int i5 = 0; i5 < i; i5++) {
                                                int i6 = (int) (objArr[i2][i4 + i5] * 32767.0d);
                                                if (i6 > 32767) {
                                                    i6 = 32767;
                                                }
                                                if (i6 < -32768) {
                                                    i6 = -32768;
                                                }
                                                if (i6 < 0) {
                                                    i6 |= 32768;
                                                }
                                                if (this.bigEndian) {
                                                    this.convbuffer[i3] = (byte) (i6 >>> 8);
                                                    this.convbuffer[i3 + 1] = (byte) i6;
                                                } else {
                                                    this.convbuffer[i3] = (byte) i6;
                                                    this.convbuffer[i3 + 1] = (byte) (i6 >>> 8);
                                                }
                                                i3 += 2 * this.oggInfo.channels;
                                            }
                                        }
                                        int i7 = 2 * this.oggInfo.channels * i;
                                        if (this.outIndex + i7 > this.outBuffer.length) {
                                            throw new C0866c("Ogg block too big to be buffered: " + i7 + ", " + (this.outBuffer.length - this.outIndex));
                                        }
                                        System.arraycopy(this.convbuffer, 0, this.outBuffer, this.outIndex, i7);
                                        this.outIndex += i7;
                                        z = true;
                                        this.dspState.synthesis_read(i);
                                    }
                                }
                            }
                        }
                    }
                }
                if (!this.endOfBitStream) {
                    this.bytes = 0;
                    int buffer = this.syncState.buffer((int) BUFFER_SIZE);
                    if (buffer >= 0) {
                        this.buffer = this.syncState.data;
                        try {
                            this.bytes = this.input.read(this.buffer, buffer, BUFFER_SIZE);
                        } catch (Exception e) {
                            throw new C0866c("Error during Vorbis decoding.", e);
                        }
                    } else {
                        this.bytes = 0;
                    }
                    this.syncState.wrote(this.bytes);
                    if (this.bytes == 0) {
                        this.endOfBitStream = true;
                    }
                }
            }
            this.streamState.clear();
            this.vorbisBlock.clear();
            this.dspState.clear();
            this.oggInfo.clear();
        }
    }

    @Override // java.io.InputStream
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
        int i = b;
        if (b < 0) {
            i = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU + b;
        }
        this.readIndex++;
        return i == 1 ? 1 : 0;
    }

    public boolean atEnd() {
        return this.endOfStream && this.readIndex >= this.outIndex;
    }

    @Override // java.io.InputStream
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

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C0882s.m268a(this.input);
    }
}
