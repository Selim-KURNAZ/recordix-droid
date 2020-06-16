package io.recordx.droid;

import android.util.Log;

import androidx.annotation.NonNull;

public class LogDebug {

    private static final String TAG = "";

    public static void g(String message){
        Log.d(TAG,message);
    }
}
