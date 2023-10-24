package com.example.myapplication2;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    public static String TAG = "ActivityLifeCycle";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.d(TAG, "onCreate: ThirdActivity is created!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ThirdActivity is started!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ThirdActivity is resumed!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ThirdActivity is paused!");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ThirdActivity is stopped!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ThirdActivity is restarted!");
    }
}
