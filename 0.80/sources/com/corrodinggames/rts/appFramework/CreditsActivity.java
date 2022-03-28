package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.corrodinggames.rts.R;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/CreditsActivity.class */
public class CreditsActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Credits");
        setVolumeControlStream(3);
        requestWindowFeature(1);
        setContentView(R.layout.credits);
        TextView textView = (TextView) findViewById(R.id.creditsText);
        ((Button) findViewById(R.id.creditsClose)).setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.CreditsActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                CreditsActivity.this.finish();
            }
        });
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
    }
}
