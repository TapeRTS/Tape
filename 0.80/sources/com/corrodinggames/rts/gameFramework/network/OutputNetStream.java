package com.corrodinggames.rts.gameFramework.network;

import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.GameObject;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/network/OutputNetStream.class */
public class OutputNetStream {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    DataOutputStream stream = new DataOutputStream(this.buffer);

    public Packet createPacket(int i) {
        try {
            this.stream.flush();
            this.buffer.flush();
            Packet packet = new Packet(i);
            packet.bytes = this.buffer.toByteArray();
            return packet;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeBoolean(boolean z) throws IOException {
        this.stream.writeBoolean(z);
    }

    public void writeByte(int i) throws IOException {
        this.stream.writeByte(i);
    }

    public void writeEnum(Enum r4) throws IOException {
        if (r4 == null) {
            this.stream.writeInt(-1);
        } else {
            this.stream.writeInt(r4.ordinal());
        }
    }

    public void writeFloat(float f) throws IOException {
        this.stream.writeFloat(f);
    }

    public void writeGameObject(GameObject gameObject) throws IOException {
        if (gameObject == null) {
            this.stream.writeLong(-1L);
        } else {
            this.stream.writeLong(gameObject.id);
        }
    }

    public void writeInt(int i) throws IOException {
        this.stream.writeInt(i);
    }

    public void writeLong(long j) throws IOException {
        this.stream.writeLong(j);
    }

    public void writeOrderableUnit(OrderableUnit orderableUnit) throws IOException {
        writeGameObject(orderableUnit);
    }

    public void writeString(String str) throws IOException {
        this.stream.writeUTF(str);
    }

    public void writeUnit(Unit unit) throws IOException {
        writeGameObject(unit);
    }
}
