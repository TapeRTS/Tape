package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/SyncedObject.class */
public abstract class SyncedObject {
    public abstract void readIn(InputNetStream inputNetStream) throws IOException;

    public abstract void writeOut(OutputNetStream outputNetStream) throws IOException;
}
