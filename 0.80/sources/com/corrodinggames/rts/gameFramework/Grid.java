package com.corrodinggames.rts.gameFramework;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL10;
import javax.microedition.khronos.opengles.GL11;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/Grid.class */
class Grid {
    static final /* synthetic */ boolean $assertionsDisabled;
    private Buffer mColorBuffer;
    private int mColorBufferIndex;
    private int mCoordinateSize;
    private int mCoordinateType;
    private IntBuffer mFixedColorBuffer;
    private IntBuffer mFixedTexCoordBuffer;
    private IntBuffer mFixedVertexBuffer;
    private FloatBuffer mFloatColorBuffer;
    private FloatBuffer mFloatTexCoordBuffer;
    private FloatBuffer mFloatVertexBuffer;
    private int mH;
    private CharBuffer mIndexBuffer;
    private int mIndexBufferIndex;
    private int mIndexCount;
    private Buffer mTexCoordBuffer;
    private int mTextureCoordBufferIndex;
    private boolean mUseHardwareBuffers;
    private int mVertBufferIndex;
    private Buffer mVertexBuffer;
    private int mW;

    static {
        $assertionsDisabled = !Grid.class.desiredAssertionStatus();
    }

    public Grid(int i, int i2, boolean z) {
        if (i < 0 || i >= 65536) {
            throw new IllegalArgumentException("vertsAcross");
        } else if (i2 < 0 || i2 >= 65536) {
            throw new IllegalArgumentException("vertsDown");
        } else if (i * i2 >= 65536) {
            throw new IllegalArgumentException("vertsAcross * vertsDown >= 65536");
        } else {
            this.mUseHardwareBuffers = false;
            this.mW = i;
            this.mH = i2;
            int i3 = i * i2;
            if (z) {
                this.mFixedVertexBuffer = ByteBuffer.allocateDirect(i3 * 4 * 3).order(ByteOrder.nativeOrder()).asIntBuffer();
                this.mFixedTexCoordBuffer = ByteBuffer.allocateDirect(i3 * 4 * 2).order(ByteOrder.nativeOrder()).asIntBuffer();
                this.mFixedColorBuffer = ByteBuffer.allocateDirect(i3 * 4 * 4).order(ByteOrder.nativeOrder()).asIntBuffer();
                this.mVertexBuffer = this.mFixedVertexBuffer;
                this.mTexCoordBuffer = this.mFixedTexCoordBuffer;
                this.mColorBuffer = this.mFixedColorBuffer;
                this.mCoordinateSize = 4;
                this.mCoordinateType = 5132;
            } else {
                this.mFloatVertexBuffer = ByteBuffer.allocateDirect(i3 * 4 * 3).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.mFloatTexCoordBuffer = ByteBuffer.allocateDirect(i3 * 4 * 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.mFloatColorBuffer = ByteBuffer.allocateDirect(i3 * 4 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
                this.mVertexBuffer = this.mFloatVertexBuffer;
                this.mTexCoordBuffer = this.mFloatTexCoordBuffer;
                this.mColorBuffer = this.mFloatColorBuffer;
                this.mCoordinateSize = 4;
                this.mCoordinateType = 5126;
            }
            int i4 = this.mW - 1;
            int i5 = this.mH - 1;
            int i6 = i4 * i5 * 6;
            this.mIndexCount = i6;
            this.mIndexBuffer = ByteBuffer.allocateDirect(i6 * 2).order(ByteOrder.nativeOrder()).asCharBuffer();
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                for (int i9 = 0; i9 < i4; i9++) {
                    char c = (char) ((this.mW * i8) + i9);
                    char c2 = (char) ((this.mW * i8) + i9 + 1);
                    char c3 = (char) (((i8 + 1) * this.mW) + i9);
                    char c4 = (char) (((i8 + 1) * this.mW) + i9 + 1);
                    int i10 = i7 + 1;
                    this.mIndexBuffer.put(i7, c);
                    int i11 = i10 + 1;
                    this.mIndexBuffer.put(i10, c2);
                    int i12 = i11 + 1;
                    this.mIndexBuffer.put(i11, c3);
                    int i13 = i12 + 1;
                    this.mIndexBuffer.put(i12, c2);
                    int i14 = i13 + 1;
                    this.mIndexBuffer.put(i13, c3);
                    i7 = i14 + 1;
                    this.mIndexBuffer.put(i14, c4);
                }
            }
            this.mVertBufferIndex = 0;
        }
    }

    public static void beginDrawing(GL10 gl10, boolean z, boolean z2) {
        gl10.glEnableClientState(32884);
        if (z) {
            gl10.glEnableClientState(32888);
            gl10.glEnable(3553);
        } else {
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
        }
        if (z2) {
            gl10.glEnableClientState(32886);
        } else {
            gl10.glDisableClientState(32886);
        }
    }

    public static void endDrawing(GL10 gl10) {
        gl10.glDisableClientState(32884);
    }

    public void draw(GL10 gl10, boolean z, boolean z2) {
        if (!this.mUseHardwareBuffers) {
            gl10.glVertexPointer(3, this.mCoordinateType, 0, this.mVertexBuffer);
            if (z) {
                gl10.glTexCoordPointer(2, this.mCoordinateType, 0, this.mTexCoordBuffer);
            }
            if (z2) {
                gl10.glColorPointer(4, this.mCoordinateType, 0, this.mColorBuffer);
            }
            gl10.glDrawElements(4, this.mIndexCount, 5123, this.mIndexBuffer);
            return;
        }
        GL11 gl11 = (GL11) gl10;
        gl11.glBindBuffer(34962, this.mVertBufferIndex);
        gl11.glVertexPointer(3, this.mCoordinateType, 0, 0);
        if (z) {
            gl11.glBindBuffer(34962, this.mTextureCoordBufferIndex);
            gl11.glTexCoordPointer(2, this.mCoordinateType, 0, 0);
        }
        if (z2) {
            gl11.glBindBuffer(34962, this.mColorBufferIndex);
            gl11.glColorPointer(4, this.mCoordinateType, 0, 0);
        }
        gl11.glBindBuffer(34963, this.mIndexBufferIndex);
        gl11.glDrawElements(4, this.mIndexCount, 5123, 0);
        gl11.glBindBuffer(34962, 0);
        gl11.glBindBuffer(34963, 0);
    }

    public void generateHardwareBuffers(GL10 gl10) {
        if (!this.mUseHardwareBuffers && (gl10 instanceof GL11)) {
            GL11 gl11 = (GL11) gl10;
            int[] iArr = new int[1];
            gl11.glGenBuffers(1, iArr, 0);
            this.mVertBufferIndex = iArr[0];
            gl11.glBindBuffer(34962, this.mVertBufferIndex);
            gl11.glBufferData(34962, this.mVertexBuffer.capacity() * this.mCoordinateSize, this.mVertexBuffer, 35044);
            gl11.glGenBuffers(1, iArr, 0);
            this.mTextureCoordBufferIndex = iArr[0];
            gl11.glBindBuffer(34962, this.mTextureCoordBufferIndex);
            gl11.glBufferData(34962, this.mTexCoordBuffer.capacity() * this.mCoordinateSize, this.mTexCoordBuffer, 35044);
            gl11.glGenBuffers(1, iArr, 0);
            this.mColorBufferIndex = iArr[0];
            gl11.glBindBuffer(34962, this.mColorBufferIndex);
            gl11.glBufferData(34962, this.mColorBuffer.capacity() * this.mCoordinateSize, this.mColorBuffer, 35044);
            gl11.glBindBuffer(34962, 0);
            gl11.glGenBuffers(1, iArr, 0);
            this.mIndexBufferIndex = iArr[0];
            gl11.glBindBuffer(34963, this.mIndexBufferIndex);
            gl11.glBufferData(34963, this.mIndexBuffer.capacity() * 2, this.mIndexBuffer, 35044);
            gl11.glBindBuffer(34963, 0);
            this.mUseHardwareBuffers = true;
            if (!$assertionsDisabled && this.mVertBufferIndex == 0) {
                throw new AssertionError();
            } else if (!$assertionsDisabled && this.mTextureCoordBufferIndex == 0) {
                throw new AssertionError();
            } else if (!$assertionsDisabled && this.mIndexBufferIndex == 0) {
                throw new AssertionError();
            } else if (!$assertionsDisabled && gl11.glGetError() != 0) {
                throw new AssertionError();
            }
        }
    }

    public final int getColorBuffer() {
        return this.mColorBufferIndex;
    }

    public boolean getFixedPoint() {
        return this.mCoordinateType == 5132;
    }

    public final int getIndexBuffer() {
        return this.mIndexBufferIndex;
    }

    public final int getIndexCount() {
        return this.mIndexCount;
    }

    public final int getTextureBuffer() {
        return this.mTextureCoordBufferIndex;
    }

    public final int getVertexBuffer() {
        return this.mVertBufferIndex;
    }

    public void invalidateHardwareBuffers() {
        this.mVertBufferIndex = 0;
        this.mIndexBufferIndex = 0;
        this.mTextureCoordBufferIndex = 0;
        this.mColorBufferIndex = 0;
        this.mUseHardwareBuffers = false;
    }

    public void releaseHardwareBuffers(GL10 gl10) {
        if (this.mUseHardwareBuffers) {
            if (gl10 instanceof GL11) {
                GL11 gl11 = (GL11) gl10;
                int[] iArr = {this.mVertBufferIndex};
                gl11.glDeleteBuffers(1, iArr, 0);
                iArr[0] = this.mTextureCoordBufferIndex;
                gl11.glDeleteBuffers(1, iArr, 0);
                iArr[0] = this.mColorBufferIndex;
                gl11.glDeleteBuffers(1, iArr, 0);
                iArr[0] = this.mIndexBufferIndex;
                gl11.glDeleteBuffers(1, iArr, 0);
            }
            invalidateHardwareBuffers();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void set(int i, int i2, float f, float f2, float f3, float f4, float f5, float[] fArr) {
        if (i < 0 || i >= this.mW) {
            throw new IllegalArgumentException("i");
        } else if (i2 < 0 || i2 >= this.mH) {
            throw new IllegalArgumentException("j");
        } else {
            int i3 = (this.mW * i2) + i;
            int i4 = i3 * 3;
            int i5 = i3 * 2;
            int i6 = i3 * 4;
            if (this.mCoordinateType == 5126) {
                this.mFloatVertexBuffer.put(i4, f);
                this.mFloatVertexBuffer.put(i4 + 1, f2);
                this.mFloatVertexBuffer.put(i4 + 2, f3);
                this.mFloatTexCoordBuffer.put(i5, f4);
                this.mFloatTexCoordBuffer.put(i5 + 1, f5);
                if (fArr != null) {
                    this.mFloatColorBuffer.put(i6, fArr[0]);
                    this.mFloatColorBuffer.put(i6 + 1, fArr[1]);
                    this.mFloatColorBuffer.put(i6 + 2, fArr[2]);
                    this.mFloatColorBuffer.put(i6 + 3, fArr[3]);
                    return;
                }
                return;
            }
            this.mFixedVertexBuffer.put(i4, (int) (65536.0f * f));
            this.mFixedVertexBuffer.put(i4 + 1, (int) (65536.0f * f2));
            this.mFixedVertexBuffer.put(i4 + 2, (int) (65536.0f * f3));
            this.mFixedTexCoordBuffer.put(i5, (int) (65536.0f * f4));
            this.mFixedTexCoordBuffer.put(i5 + 1, (int) (65536.0f * f5));
            if (fArr != null) {
                this.mFixedColorBuffer.put(i6, (int) (fArr[0] * 65536.0f));
                this.mFixedColorBuffer.put(i6 + 1, (int) (fArr[1] * 65536.0f));
                this.mFixedColorBuffer.put(i6 + 2, (int) (fArr[2] * 65536.0f));
                this.mFixedColorBuffer.put(i6 + 3, (int) (fArr[3] * 65536.0f));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setUV(int i, int i2, float f, float f2) {
        if (i < 0 || i >= this.mW) {
            throw new IllegalArgumentException("i");
        } else if (i2 < 0 || i2 >= this.mH) {
            throw new IllegalArgumentException("j");
        } else {
            int i3 = ((this.mW * i2) + i) * 2;
            if (this.mCoordinateType == 5126) {
                this.mFloatTexCoordBuffer.put(i3, f);
                this.mFloatTexCoordBuffer.put(i3 + 1, f2);
                return;
            }
            this.mFixedTexCoordBuffer.put(i3, (int) (f * 65536.0f));
            this.mFixedTexCoordBuffer.put(i3 + 1, (int) (65536.0f * f2));
        }
    }

    public boolean usingHardwareBuffers() {
        return this.mUseHardwareBuffers;
    }
}
