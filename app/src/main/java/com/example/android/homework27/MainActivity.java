package com.example.android.homework27;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "Lifecycle";
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
        textView.append("\n" + "onCreate");

        if (savedInstanceState != null) {
            String text = savedInstanceState.getString("TextView text");
            textView.append(text);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG_TAG, "onStart");
        textView.append("\n" + "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
        textView.append("\n" + "onDestroy");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG_TAG, "onStop");
        textView.append("\n" + "onStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG_TAG, "onPause");
        textView.append("\n" + "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG_TAG, "onResume");
        textView.append("\n" + "onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
        textView.append("\n" + "onRestart");
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.d(LOG_TAG, "onPostCreate");
        textView.append("\n" + "onPostCreate");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d(LOG_TAG, "onPostResume");
        textView.append("\n" + "onPostResume");
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        super.onKeyDown(keyCode, event);
        Log.d(LOG_TAG, "onKeyDown");
        textView.append("\n" + "onKeyDown");
        return false;
    }

    @Override
    public boolean onKeyLongPress (int keyCode, KeyEvent event){
        super.onKeyLongPress(keyCode, event);
        Log.d(LOG_TAG, "onKeyLongPress");
        textView.append("\n" + "onKeyLongPress");
        return false;
    }

    @Override
    public void onBackPressed (){
        super.onBackPressed();
        Log.d(LOG_TAG, "onBackPressed");
        textView.append("\n" + "onBackPressed");
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putString("TextView text", textView.getText().toString());
        textView.append("\n" + "onSaveInstanceState");
        Log.d(LOG_TAG, "onSaveInstanceState");
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String s = savedInstanceState.getString("TextView text");
        textView.append("\n" + "onRestoreInstanceState" + s);
        Log.d(LOG_TAG, "onRestoreInstanceState");
    }


}