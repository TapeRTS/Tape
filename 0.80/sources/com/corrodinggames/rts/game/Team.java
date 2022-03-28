package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.SyncedObject;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/game/Team.class */
public abstract class Team extends SyncedObject {
    public static final int MAX_TEAMS = 8;
    public static Team[] teamList = new Team[8];
    public int allyGroup;
    public int credits;
    public int id;
    public Paint mapPaint;
    public String playerName;
    public boolean survivalAttacker;

    public Team() {
        this.id = -1;
        this.credits = 4000;
        this.mapPaint = new Paint();
    }

    public Team(int i) {
        this();
        setTeam(i);
    }

    public static Bitmap createBitmapForTeam(Bitmap bitmap, int i) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
        for (int i2 = 0; i2 < createScaledBitmap.getWidth(); i2++) {
            for (int i3 = 0; i3 < createScaledBitmap.getHeight(); i3++) {
                int pixel = createScaledBitmap.getPixel(i2, i3);
                if (Color.green(pixel) > 0 && Color.red(pixel) == 0 && Color.blue(pixel) == 0) {
                    float green = Color.green(pixel) / 255.0f;
                    int teamColor = getTeamColor(i);
                    createScaledBitmap.setPixel(i2, i3, Color.rgb((int) (Color.red(teamColor) * green), (int) (Color.green(teamColor) * green), (int) (Color.blue(teamColor) * green)));
                } else if (Color.green(pixel) > 0 && Color.green(pixel) != Color.red(pixel) && Color.red(pixel) == Color.blue(pixel)) {
                    float red = Color.red(pixel) / 255.0f;
                    float green2 = (Color.green(pixel) / 255.0f) - red;
                    int teamColor2 = getTeamColor(i);
                    createScaledBitmap.setPixel(i2, i3, Color.rgb(CommonUtils.limitInt((int) ((255.0f * red) + (Color.red(teamColor2) * green2)), 0, 255), CommonUtils.limitInt((int) ((255.0f * red) + (Color.green(teamColor2) * green2)), 0, 255), CommonUtils.limitInt((int) ((Color.blue(teamColor2) * green2) + (red * 255.0f)), 0, 255)));
                }
            }
        }
        return createScaledBitmap;
    }

    public static Team getTeam(int i) {
        return teamList[i];
    }

    public static int getTeamColor(int i) {
        return i == 0 ? -16711936 : i == 1 ? -65536 : i == 2 ? -16776961 : i == 3 ? -256 : i == 4 ? -16711681 : i == 5 ? -1 : i == 6 ? -16777216 : i == 7 ? -65281 : -7829368;
    }

    public static int nextFreeSlot() {
        int i = 0;
        while (true) {
            if (i >= teamList.length) {
                i = -1;
                break;
            } else if (teamList[i] == null) {
                break;
            } else {
                i++;
            }
        }
        return i;
    }

    public static void removeAll() {
        for (int i = 0; i < teamList.length; i++) {
            teamList[i] = null;
        }
    }

    public boolean canBuy(int i) {
        return this.credits >= i;
    }

    public int getColor() {
        return getTeamColor(this.id);
    }

    public boolean isEnemy(Team team) {
        return this.allyGroup != team.allyGroup;
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void readIn(InputNetStream inputNetStream) throws IOException {
        setTeam(inputNetStream.readByte());
        this.credits = inputNetStream.readInt();
        this.allyGroup = inputNetStream.readInt();
        this.playerName = inputNetStream.readString();
    }

    public void removeSelfFromList() {
        for (int i = 0; i < teamList.length; i++) {
            if (teamList[i] == this) {
                teamList[i] = null;
            }
        }
    }

    public void setTeam(int i) {
        if (this.id != i) {
            removeSelfFromList();
            this.id = i;
            this.allyGroup = i;
            teamList[i] = this;
            this.mapPaint.setColor(getColor());
        }
    }

    public boolean tryToBuy(int i) {
        boolean z;
        if (canBuy(i)) {
            this.credits -= i;
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public abstract void update(float f);

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void writeOut(OutputNetStream outputNetStream) throws IOException {
        outputNetStream.writeByte(this.id);
        outputNetStream.writeInt(this.credits);
        outputNetStream.writeInt(this.allyGroup);
        outputNetStream.writeString(this.playerName);
    }
}
