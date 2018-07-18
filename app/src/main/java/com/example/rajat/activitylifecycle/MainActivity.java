package com.example.rajat.activitylifecycle;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "FirstActivity";
    private Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "Activity has been Created, onCreate() Method call");

        mbutton = (Button) findViewById(R.id.sendToSecond);

        mbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "Activity has been Started, onStart() Method call");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "Activity has been Restarted, onRestart() Method call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "Activity has been Stopped, onStop() Method call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Activity has been Destroyed, onDestroy() Method Call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "Activity has been Paused, onPause() Method Call");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Activity has been Resumed, onResume() Method Call");
    }
}