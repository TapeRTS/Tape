package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
/* loaded from: classes.jar:com/corrodinggames/rts/appFramework/QuickHelpActivity.class */
public class QuickHelpActivity extends Activity {
    private Bitmap[] bitmaps;
    private Gallery gallery;
    private ImageView imageView;
    private long lockTouchTill;
    private LinearLayout outerlayout;
    private int currentImage = -1;
    private Integer[] Imgid = {Integer.valueOf((int) R.drawable.help1), Integer.valueOf((int) R.drawable.help2), Integer.valueOf((int) R.drawable.help3), Integer.valueOf((int) R.drawable.help4)};

    /* loaded from: classes.jar:com/corrodinggames/rts/appFramework/QuickHelpActivity$AddImgAdp.class */
    public class AddImgAdp extends BaseAdapter {
        int GalItemBg;
        private Context cont;

        public AddImgAdp(Context context) {
            this.cont = context;
            TypedArray obtainStyledAttributes = QuickHelpActivity.this.obtainStyledAttributes(R.styleable.GalleryTheme);
            this.GalItemBg = obtainStyledAttributes.getResourceId(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return QuickHelpActivity.this.Imgid.length;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return Integer.valueOf(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imageView = new ImageView(this.cont);
            imageView.setImageBitmap(QuickHelpActivity.this.bitmaps[i]);
            imageView.setLayoutParams(new Gallery.LayoutParams(80, 70));
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            imageView.setBackgroundResource(this.GalItemBg);
            return imageView;
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CommonGUI.globalSetup(this);
        setContentView(R.layout.quick_help);
        System.gc();
        this.bitmaps = new Bitmap[this.Imgid.length];
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        for (int i = 0; i < this.bitmaps.length; i++) {
            this.bitmaps[i] = BitmapFactory.decodeResource(getResources(), this.Imgid[i].intValue(), options);
        }
        SettingsEngine instance = SettingsEngine.getInstance(getBaseContext());
        instance.hasPlayedGameOrSeenHelp = true;
        instance.save();
        setup();
        this.gallery = (Gallery) findViewById(R.id.quickhelp_gallery);
        this.gallery.setAdapter((SpinnerAdapter) new AddImgAdp(this));
        this.imageView = (ImageView) findViewById(R.id.quickhelp_image);
        this.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        this.outerlayout = (LinearLayout) findViewById(R.id.quickhelp_outerlayout);
        this.lockTouchTill = System.currentTimeMillis() + 500;
        this.imageView.setOnClickListener(new View.OnClickListener() { // from class: com.corrodinggames.rts.appFramework.QuickHelpActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (System.currentTimeMillis() >= QuickHelpActivity.this.lockTouchTill) {
                    int selectedItemPosition = QuickHelpActivity.this.gallery.getSelectedItemPosition() + 1;
                    if (selectedItemPosition >= QuickHelpActivity.this.gallery.getChildCount()) {
                        QuickHelpActivity.this.finish();
                        return;
                    }
                    QuickHelpActivity.this.gallery.setSelection(selectedItemPosition, true);
                    QuickHelpActivity.this.setImage(selectedItemPosition);
                }
            }
        });
        this.gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.corrodinggames.rts.appFramework.QuickHelpActivity.2
            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                QuickHelpActivity.this.setImage(i2);
            }
        });
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        setup();
    }

    @Override // android.app.Activity
    protected void onStop() {
        finish();
        super.onStop();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        if (this.currentImage == -1) {
            this.gallery.setSelection(0);
            setImage(0);
        }
        super.onWindowFocusChanged(z);
    }

    void setImage(int i) {
        this.currentImage = i;
        Bitmap bitmap = this.bitmaps[i];
        this.imageView.setImageBitmap(bitmap);
        int width = this.outerlayout.getWidth();
        int height = this.outerlayout.getHeight();
        int i2 = width;
        int i3 = height;
        if (((int) (bitmap.getHeight() * (width / bitmap.getWidth()))) < height) {
            i3 = (int) (width * (bitmap.getHeight() / bitmap.getWidth()));
        } else {
            i2 = (int) (height * (bitmap.getWidth() / bitmap.getHeight()));
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.imageView.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.imageView.setLayoutParams(layoutParams);
    }

    public void setup() {
    }
}
