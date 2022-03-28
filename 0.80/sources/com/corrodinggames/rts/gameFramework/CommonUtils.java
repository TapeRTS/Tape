package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/CommonUtils.class */
public final class CommonUtils {
    public static final int OUT_BOTTOM = 8;
    public static final int OUT_LEFT = 1;
    public static final int OUT_RIGHT = 4;
    public static final int OUT_TOP = 2;
    static final Random realRandom = new Random();
    static PointF lowerLeft = new PointF();
    static PointF upperRight = new PointF();
    static PointF upperLeft = new PointF();
    static PointF lowerRight = new PointF();
    static PointF _convert3Dto2D_return = new PointF();

    public static final float abs(float f) {
        if (f < 0.0f) {
            f = -f;
        }
        return f;
    }

    public static final int abs(int i) {
        if (i < 0) {
            i = -i;
        }
        return i;
    }

    public static final boolean close(float f, float f2) {
        return abs(f - f2) < 0.05f;
    }

    public static final PointF convert3Dto2D(float f, float f2, float f3) {
        _convert3Dto2D_return.set(f, f2 - f3);
        return _convert3Dto2D_return;
    }

    public static final float cos(float f) {
        return (float) StrictMath.cos(StrictMath.toRadians(f));
    }

    public static final float distance(float f, float f2, float f3, float f4) {
        return (float) Math.sqrt(((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4)));
    }

    public static final float distanceSq(float f, float f2, float f3, float f4) {
        return ((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4));
    }

    public static final float fixDir(float f, boolean z) {
        float f2 = f;
        if (z) {
            while (true) {
                if (f <= 360.0f && f >= 0.0f) {
                    break;
                }
                float f3 = f;
                if (f > 360.0f) {
                    f3 = f - 360.0f;
                }
                f = f3;
                if (f3 < 0.0f) {
                    f = f3 + 360.0f;
                }
            }
        } else {
            while (true) {
                if (f2 <= 180.0f && f2 >= -180.0f) {
                    break;
                }
                float f4 = f2;
                if (f2 > 180.0f) {
                    f4 = f2 - 360.0f;
                }
                f2 = f4;
                if (f4 < -180.0f) {
                    f2 = f4 + 360.0f;
                }
            }
            f = f2;
        }
        return f;
    }

    public static final void fixRect(Rect rect) {
        if (rect.right < rect.left) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        if (rect.bottom < rect.top) {
            int i2 = rect.bottom;
            rect.bottom = rect.top;
            rect.top = i2;
        }
    }

    public static final float getDirection(float f, float f2, float f3, float f4) {
        return (float) Math.toDegrees(Math.atan2(f4 - f2, f3 - f));
    }

    public static final float getRotationDir(float f, float f2, float f3) {
        float fixDir = fixDir(fixDir(f2, true) - fixDir(f, true), false);
        if (fixDir > f3) {
            fixDir = f3;
        } else if (fixDir < (-f3)) {
            fixDir = -f3;
        }
        return fixDir;
    }

    public static final String inputStreamToString(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
            }
        }
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [double] */
    /* JADX WARN: Type inference failed for: r0v25, types: [double] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [double] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [double] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4, types: [double] */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r23v7 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [double] */
    /* JADX WARN: Unknown variable types count: 4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean intersectsLine(double r9, double r11, double r13, double r15, android.graphics.Rect r17) {
        /*
            r0 = r13
            r1 = r15
            r2 = r17
            int r0 = outcode(r0, r1, r2)
            r18 = r0
            r0 = r18
            if (r0 != 0) goto L_0x005d
            r0 = 1
            r19 = r0
        L_0x0013:
            r0 = r19
            return r0
        L_0x0016:
            r0 = r20
            r1 = r18
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0024
            r0 = 0
            r19 = r0
            goto L_0x0013
        L_0x0024:
            r0 = r20
            r1 = 5
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0071
            r0 = r17
            int r0 = r0.left
            double r0 = (double) r0
            r21 = r0
            r0 = r21
            r23 = r0
            r0 = r20
            r1 = 4
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0049
            r0 = r21
            r1 = r17
            int r1 = r1.width()
            double r1 = (double) r1
            double r0 = r0 + r1
            r23 = r0
        L_0x0049:
            r0 = r11
            r1 = r23
            r2 = r9
            double r1 = r1 - r2
            r2 = r15
            r3 = r11
            double r2 = r2 - r3
            double r1 = r1 * r2
            r2 = r13
            r3 = r9
            double r2 = r2 - r3
            double r1 = r1 / r2
            double r0 = r0 + r1
            r11 = r0
            r0 = r23
            r9 = r0
        L_0x005d:
            r0 = r9
            r1 = r11
            r2 = r17
            int r0 = outcode(r0, r1, r2)
            r20 = r0
            r0 = r20
            if (r0 != 0) goto L_0x0016
            r0 = 1
            r19 = r0
            goto L_0x0013
        L_0x0071:
            r0 = r17
            int r0 = r0.top
            double r0 = (double) r0
            r21 = r0
            r0 = r21
            r23 = r0
            r0 = r20
            r1 = 8
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0090
            r0 = r21
            r1 = r17
            int r1 = r1.height()
            double r1 = (double) r1
            double r0 = r0 + r1
            r23 = r0
        L_0x0090:
            r0 = r9
            r1 = r23
            r2 = r11
            double r1 = r1 - r2
            r2 = r13
            r3 = r9
            double r2 = r2 - r3
            double r1 = r1 * r2
            r2 = r15
            r3 = r11
            double r2 = r2 - r3
            double r1 = r1 / r2
            double r0 = r0 + r1
            r9 = r0
            r0 = r23
            r11 = r0
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.CommonUtils.intersectsLine(double, double, double, double, android.graphics.Rect):boolean");
    }

    public static final float limit(float f, float f2) {
        if (f > f2) {
            f = f2;
        } else if (f < (-f2)) {
            f = -f2;
        }
        return f;
    }

    public static final float limit(float f, float f2, float f3) {
        if (f > f3) {
            f = f3;
        } else if (f < f2) {
            f = f2;
        }
        return f;
    }

    public static final int limitInt(int i, int i2, int i3) {
        if (i > i3) {
            i = i3;
        } else if (i < i2) {
            i = i2;
        }
        return i;
    }

    public static final boolean lineIntersectLine(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        boolean z;
        float f = ((pointF4.y - pointF3.y) * (pointF2.x - pointF.x)) - ((pointF4.x - pointF3.x) * (pointF2.y - pointF.y));
        float f2 = ((pointF4.x - pointF3.x) * (pointF.y - pointF3.y)) - ((pointF4.y - pointF3.y) * (pointF.x - pointF3.x));
        float f3 = ((pointF2.x - pointF.x) * (pointF.y - pointF3.y)) - ((pointF2.y - pointF.y) * (pointF.x - pointF3.x));
        if (f == 0.0f) {
            z = (f2 == 0.0f && f3 == 0.0f) ? false : false;
        } else {
            float f4 = f2 / f;
            float f5 = f3 / f;
            z = f4 >= 0.0f && f4 <= 1.0f && f5 >= 0.0f && f5 <= 1.0f;
        }
        return z;
    }

    public static final boolean lineIntersectsRect(PointF pointF, PointF pointF2, Rect rect) {
        lowerLeft.set(rect.left, rect.bottom);
        upperRight.set(rect.right, rect.top);
        upperLeft.set(rect.left, rect.top);
        lowerRight.set(rect.right, rect.bottom);
        return (pointF.x <= lowerLeft.x || pointF.x >= upperRight.x || pointF.y >= lowerLeft.y || pointF.y <= upperRight.y || pointF2.x <= lowerLeft.x || pointF2.x >= upperRight.x || pointF2.y >= lowerLeft.y || pointF2.y <= upperRight.y) ? lineIntersectLine(pointF, pointF2, upperLeft, lowerLeft) ? true : lineIntersectLine(pointF, pointF2, lowerLeft, lowerRight) ? true : lineIntersectLine(pointF, pointF2, upperLeft, upperRight) ? true : lineIntersectLine(pointF, pointF2, upperRight, lowerRight) : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int lineIntersectsRectReturningHow(android.graphics.PointF r5, android.graphics.PointF r6, android.graphics.Rect r7) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.CommonUtils.lineIntersectsRectReturningHow(android.graphics.PointF, android.graphics.PointF, android.graphics.Rect):int");
    }

    public static final int outcode(double d, double d2, Rect rect) {
        int i;
        int i2 = 0;
        if (rect.width() <= 0) {
            i2 = 0 | 5;
        } else if (d < rect.left) {
            i2 = 0 | 1;
        } else if (d > rect.left + rect.width()) {
            i2 = 0 | 4;
        }
        if (rect.height() <= 0) {
            i = i2 | 10;
        } else if (d2 < rect.top) {
            i = i2 | 2;
        } else {
            i = i2;
            if (d2 > rect.top + rect.height()) {
                i = i2 | 8;
            }
        }
        return i;
    }

    public static final int realRand(int i) {
        return realRandom.nextInt(i);
    }

    public static final float realRnd(float f, float f2) {
        return (realRandom.nextFloat() * (f2 - f)) + f;
    }

    public static final float rnd(float f, float f2) {
        return (float) ((Math.random() * (f2 - f)) + f);
    }

    public static final int roundDown(float f) {
        return f > 0.0f ? (int) f : f < 0.0f ? ((int) f) - 1 : 0;
    }

    public static final float sameRnd(float f, float f2) {
        return (float) ((Math.random() * (f2 - f)) + f);
    }

    public static final float sin(float f) {
        return (float) StrictMath.sin(StrictMath.toRadians(f));
    }

    public static final float square(float f) {
        return (float) Math.sqrt(f);
    }

    public static final float toValue(float f, float f2, float f3) {
        return f > f2 + f3 ? f - f3 : f < f2 - f3 ? f + f3 : f2;
    }

    public static final float toZero(float f, float f2) {
        return f > f2 ? f - f2 : f < (-f2) ? f + f2 : 0.0f;
    }
}
