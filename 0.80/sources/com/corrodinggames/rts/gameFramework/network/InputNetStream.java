package com.corrodinggames.rts.gameFramework.network;

import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.GameObject;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/InputNetStream.class */
public class InputNetStream {
    ByteArrayInputStream buffer;
    DataInputStream stream;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputNetStream(Packet packet) {
        this.buffer = new ByteArrayInputStream(packet.bytes);
        this.stream = new DataInputStream(this.buffer);
    }

    public boolean readBoolean() throws IOException {
        return this.stream.readBoolean();
    }

    public int readByte() throws IOException {
        return this.stream.readByte();
    }

    public Enum readEnum(Class cls) throws IOException {
        Enum r5;
        int readInt = this.stream.readInt();
        if (readInt == -1) {
            r5 = null;
        } else {
            Object[] enumConstants = cls.getEnumConstants();
            if (readInt < 0 || readInt >= enumConstants.length) {
                NetworkEngine.reportDesync("readEnum:" + readInt + " is out of range for " + cls.toString());
                r5 = null;
            } else {
                r5 = (Enum) enumConstants[readInt];
            }
        }
        return r5;
    }

    public float readFloat() throws IOException {
        return this.stream.readFloat();
    }

    public GameObject readGameObject() throws IOException {
        return GameObject.getUnitFromId(this.stream.readLong());
    }

    public long readGameObjectId() throws IOException {
        return this.stream.readLong();
    }

    public int readInt() throws IOException {
        return this.stream.readInt();
    }

    public long readLong() throws IOException {
        return this.stream.readLong();
    }

    public OrderableUnit readOrderableUnit() throws IOException {
        return (OrderableUnit) readGameObject();
    }

    public String readString() throws IOException {
        return this.stream.readUTF();
    }

    public Unit readUnit() throws IOException {
        return (Unit) readGameObject();
    }
}
