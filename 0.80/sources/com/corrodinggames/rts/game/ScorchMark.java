package com.corrodinggames.rts.game;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/game/ScorchMark.class */
public class ScorchMark extends GameObject {
    public static final int type_blood = 1;
    public static final int type_scorch = 0;
    int frameIndex;
    int type;
    float x;
    float y;
    static RectF _dst = new RectF();
    static Rect _src = new Rect();
    static Paint _paint = new Paint();
    static BitmapOrTexture IMAGE_SCORCH = null;
    static BitmapOrTexture IMAGE_BLOOD = null;
    int tileWidth = 50;
    int tileHeight = 40;

    public ScorchMark() {
        setDrawLayer(0);
    }

    private void bakeToMap() {
        GameEngine.getInstance().map.addScorchMark(this);
    }

    public static void create(float f, float f2) {
        ScorchMark scorchMark = new ScorchMark();
        scorchMark.type = 0;
        scorchMark.x = f;
        scorchMark.y = f2;
        scorchMark.frameIndex = CommonUtils.realRand(4);
        scorchMark.bakeToMap();
    }

    public static void create(OrderableUnit orderableUnit, int i) {
        if (!orderableUnit.isOverWater()) {
            ScorchMark scorchMark = new ScorchMark();
            scorchMark.type = i;
            scorchMark.x = orderableUnit.x;
            scorchMark.y = orderableUnit.y;
            scorchMark.frameIndex = CommonUtils.realRand(4);
            scorchMark.bakeToMap();
        }
    }

    public static void load() {
        GameEngine instance = GameEngine.getInstance();
        IMAGE_SCORCH = instance.graphics.loadImage(R.drawable.scorch_mark, true);
        IMAGE_BLOOD = instance.graphics.loadImage(R.drawable.blood_mark, true);
    }

    public void bake(Canvas canvas, float f, float f2) {
        GameEngine.getInstance();
        int i = this.frameIndex * this.tileWidth;
        _src.set(i, 0, this.tileWidth + i, this.tileHeight + 0);
        _dst.set(this.x, this.y, this.x + this.tileWidth, this.y + this.tileHeight);
        _dst.offset((-_dst.width()) / 2.0f, (-_dst.height()) / 2.0f);
        _dst.offset(-f, -f2);
        BitmapOrTexture bitmapOrTexture = null;
        if (this.type == 0) {
            bitmapOrTexture = IMAGE_SCORCH;
        } else if (this.type == 1) {
            bitmapOrTexture = IMAGE_BLOOD;
        }
        canvas.drawBitmap(bitmapOrTexture.bitmap, _src, _dst, _paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public boolean drawIcon(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawInterface(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawOver(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawUnder(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void readIn(InputNetStream inputNetStream) throws IOException {
        throw new RuntimeException("not completed");
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void writeOut(OutputNetStream outputNetStream) throws IOException {
        throw new RuntimeException("not completed");
    }
}
