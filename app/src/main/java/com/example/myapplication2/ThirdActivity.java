package com.example.myapplication2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    public static String TAG = "ActivityLifeCycle";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.d(TAG, "onCreate: ThirdActivity is created!");

        Button openWebBtn = (Button) findViewById(R.id.openWebBtn);

        openWebBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.freecodecamp.org/"));
                startActivity(intent);
            }
        });
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ThirdActivity is destroyed!");
    }
}
