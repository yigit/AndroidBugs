package com.birbit.android;

import android.app.Activity;

public class LargeBitmapGLBug extends Activity {
    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.large_bitmap_gl_bug);
    }
}
