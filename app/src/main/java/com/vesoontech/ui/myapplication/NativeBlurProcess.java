package com.vesoontech.ui.myapplication;

import android.graphics.Bitmap;

/**
 * <pre>
 *     @author : Nelson
 *     GitHub  : https://github.com/Nelson-KK
 *     @since  : 2019/4/26
 *     Des     :
 * </pre>
 */
public class NativeBlurProcess {
    static{
        System.loadLibrary("native-lib");
    }

    public static native void functionToBlur(Bitmap bitmapOut, int radius, int threadCount, int threadIndex, int round);
}
