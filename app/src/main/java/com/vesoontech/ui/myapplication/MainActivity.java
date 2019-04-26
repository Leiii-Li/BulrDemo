package com.vesoontech.ui.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.vesoontech.ui.blur_rs.BlurKit;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        so();
        render();
    }

    private void so() {
        ImageView image1 = findViewById(R.id.src1);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.peppers);
        long startTime = System.currentTimeMillis();
        NativeBlurProcess.functionToBlur(bitmap, 50, 1, 1, 2);
        image1.setImageBitmap(bitmap);
        long endTime = System.currentTimeMillis();
        Log.i(TAG, "[nelson] -- onCreate : " + (endTime - startTime));
    }

    private void render() {
        long startTime = System.currentTimeMillis();
        BlurKit.init(this);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.peppers);
        BlurKit.getInstance().blur(bitmap, 24);
        ImageView image2 = findViewById(R.id.src2);
        image2.setImageBitmap(bitmap);
        long endTime = System.currentTimeMillis();
        Log.i(TAG, "[nelson] -- onCreate : " + (endTime - startTime));
    }
}
