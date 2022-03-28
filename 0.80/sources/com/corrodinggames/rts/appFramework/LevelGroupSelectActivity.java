package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.corrodinggames.rts.R;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/LevelGroupSelectActivity.class */
public class LevelGroupSelectActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("Mode");
        CommonGUI.globalSetup(this);
        overridePendingTransition(0, 0);
        setContentView(R.layout.level_select);
        setup();
    }

    public void onCreateMode(LinearLayout linearLayout, String str, String str2) {
        Button button = new Button(getBaseContext());
        button.setTag(str2);
        button.setBackgroundResource(R.drawable.btn_dropdown);
        button.setText(str);
        button.setTypeface(Typeface.DEFAULT_BOLD);
        button.setPadding(0, 16, 0, 16);
        button.getBackground().setColorFilter(new LightingColorFilter(-1, 8704));
        button.setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.LevelGroupSelectActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String str3 = (String) view.getTag();
                Intent intent = new Intent(view.getContext(), LevelSelectActivity.class);
                intent.putExtra("mode", str3);
                LevelGroupSelectActivity.this.startActivityForResult(intent, 0);
            }
        });
        linearLayout.addView(button);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(button.getLayoutParams());
        layoutParams.setMargins(2, 2, 2, 2);
        button.setLayoutParams(layoutParams);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        setup();
    }

    public void setup() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.levelHolder);
        linearLayout.removeAllViews();
        onCreateMode(linearLayout, "Campaign", "maps/normal");
        onCreateMode(linearLayout, "Survival", "maps/survival");
        onCreateMode(linearLayout, "Skirmish Maps", "maps/skirmish");
        onCreateMode(linearLayout, "Challenge Missions", "maps/challenge");
        onCreateMode(linearLayout, "Custom (from SD card)", "/SD/rusted_warfare_maps");
        ((TextView) findViewById(R.id.LevelTextTop)).setText("Select Mode");
    }
}
