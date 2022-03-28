package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.Basic2DGLRenderer;
import java.io.InputStream;
import java.util.concurrent.ConcurrentLinkedQueue;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/GraphicsEngine.class */
public class GraphicsEngine {
    private Canvas canvas;
    private Context context;
    GameEngine game;
    private Basic2DGLRenderer renderer;
    public boolean use3d = false;
    public ConcurrentLinkedQueue<BitmapOrTexture> images = new ConcurrentLinkedQueue<>();
    Rect _rectSrc = new Rect();
    Rect _rectDst = new Rect();
    RectF _dst = new RectF();
    RectF _converted = new RectF();

    public void drawColor(int i) {
        if (!this.use3d) {
            this.canvas.drawColor(i);
        }
    }

    public void drawImage(BitmapOrTexture bitmapOrTexture, float f, float f2) {
        drawImage(bitmapOrTexture, f, f2, (Paint) null);
    }

    public void drawImage(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint) {
        if (this.use3d) {
            if (this.renderer.ready) {
                this.renderer.loadImageIfNeeded(bitmapOrTexture);
                if (bitmapOrTexture.textureHandle != null) {
                    Basic2DGLRenderer.DelayedDraw delayedDraw = this.renderer.getDelayedDraw();
                    delayedDraw.drawType = Basic2DGLRenderer.DrawType.Normal;
                    delayedDraw.image = bitmapOrTexture;
                    delayedDraw.x = f;
                    delayedDraw.y = f2;
                    return;
                }
            } else {
                return;
            }
        } else if (bitmapOrTexture.bitmap != null) {
            this.canvas.drawBitmap(bitmapOrTexture.bitmap, f, f2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    public void drawImage(BitmapOrTexture bitmapOrTexture, Rect rect, Rect rect2, Paint paint) {
        this._converted.set(rect2);
        drawImage(bitmapOrTexture, rect, this._converted, paint);
    }

    public void drawImage(BitmapOrTexture bitmapOrTexture, Rect rect, RectF rectF, Paint paint) {
        if (this.use3d) {
            if (this.renderer.ready) {
                if (bitmapOrTexture.textureHandle == null) {
                    this.renderer.loadImageIfNeeded(bitmapOrTexture);
                }
                if (bitmapOrTexture.textureHandle != null) {
                    Basic2DGLRenderer.DelayedDraw delayedDraw = this.renderer.getDelayedDraw();
                    delayedDraw.drawType = Basic2DGLRenderer.DrawType.Rect;
                    delayedDraw.image = bitmapOrTexture;
                    delayedDraw.src.set(rect);
                    delayedDraw.dst.set(rectF);
                    return;
                }
            } else {
                return;
            }
        } else if (bitmapOrTexture.bitmap != null) {
            this.canvas.drawBitmap(bitmapOrTexture.bitmap, rect, rectF, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    public void drawImageCentered(BitmapOrTexture bitmapOrTexture, Rect rect, float f, float f2, float f3, Paint paint) {
        this.canvas.save();
        this._dst.set(f - (rect.width() / 2), f2 - (rect.height() / 2), (rect.width() / 2) + f, (rect.height() / 2) + f2);
        this.canvas.rotate(90.0f + f3, this._dst.centerX(), this._dst.centerY());
        drawImage(bitmapOrTexture, rect, this._dst, paint);
        this.canvas.restore();
    }

    public void drawRect(Rect rect, Paint paint) {
        if (!this.use3d) {
            this.canvas.drawRect(rect, paint);
        }
    }

    public void drawText(String str, float f, float f2, Paint paint) {
        if (!this.use3d) {
            this.canvas.drawText(str, f, f2, paint);
        }
    }

    public void drawText(String str, int i, int i2, float f, float f2, Paint paint) {
        if (!this.use3d) {
            this.canvas.drawText(str, i, i2, f, f2, paint);
        }
    }

    public void endFrame() {
        if (this.use3d) {
            this.renderer.endFrame();
        }
    }

    public Canvas getCanvas() {
        return this.canvas;
    }

    public void init(Context context) {
        this.context = context;
        this.game = GameEngine.getInstance();
    }

    public BitmapOrTexture loadImage(int i) {
        return loadImage(i, true);
    }

    public BitmapOrTexture loadImage(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        return loadImage(BitmapFactory.decodeResource(this.context.getResources(), i, options));
    }

    public BitmapOrTexture loadImage(Bitmap bitmap) {
        BitmapOrTexture bitmapOrTexture = new BitmapOrTexture();
        bitmapOrTexture.bitmap = bitmap;
        if (this.use3d) {
            bitmapOrTexture.setupGrid();
        }
        this.images.add(bitmapOrTexture);
        return bitmapOrTexture;
    }

    public BitmapOrTexture loadImage(InputStream inputStream, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
        Log.e(GameEngine.TAG, "load a:" + z + " as " + decodeStream.getConfig());
        return loadImage(decodeStream);
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public void setRenderer(Basic2DGLRenderer basic2DGLRenderer) {
        this.renderer = basic2DGLRenderer;
    }

    public void tileImage(BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint) {
        int i = rect.left;
        int i2 = rect.top;
        int width = bitmapOrTexture.getWidth();
        int height = bitmapOrTexture.getHeight();
        while (i < rect.right) {
            while (i2 < rect.bottom) {
                int i3 = rect.right - i;
                int i4 = i3;
                if (i3 > width) {
                    i4 = width;
                }
                int i5 = rect.bottom - i2;
                int i6 = i5;
                if (i5 > height) {
                    i6 = height;
                }
                this._rectSrc.set(0, 0, i4, i6);
                this._rectDst.set(i, i2, i + i4, i2 + i6);
                drawImage(bitmapOrTexture, this._rectSrc, this._rectDst, paint);
                i2 += height;
            }
            i += width;
            i2 = 0;
        }
    }
}
