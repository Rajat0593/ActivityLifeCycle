package com.example.rajat.activitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";
    private Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "Activity has been Created, onCreate Method call");

        mbutton = findViewById(R.id.sendToFirst);


        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity has been started, onStart Method call");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity has been Restarted, onRestart Method call");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity has been Resumed, onResume Method call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity has been Paused, onPasue method call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity has been Stopped, onStop() method call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity has been Destroyed, onDestroy() Method call");
    }
}