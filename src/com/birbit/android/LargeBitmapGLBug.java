package com.birbit.android;

import android.app.Activity;
import android.graphics.Paint;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class LargeBitmapGLBug extends Activity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.large_bitmap_gl_bug);
        (new Handler()).postDelayed(new Runnable() {
            @Override
            public void run() {
                ImageView imageView = (ImageView) findViewById(R.id.defaultImageView);
                imageView.setLayerType(View.LAYER_TYPE_SOFTWARE, new Paint());
                imageView.invalidate();
            }
        }, 2000);
    }
}
