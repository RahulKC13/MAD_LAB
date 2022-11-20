package com.example.life_cycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("App Lifecycle","onCreate has been invoked");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("App Lifecycle","onStart has been invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("App Lifecycle","onResume has been invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("App Lifecycle","onPause has been invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("App Lifecycle","onStop has been invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("App Lifecycle","onRestart has been invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("App Lifecycle","onDestroy has been invoked");
    }
}