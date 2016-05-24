package com.example.aishwarya.amazing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;

/**
 * Created by aishwarya on 1/29/16.
 */
public class Clue4 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clue4);
        SystemClock.sleep(3000);
        Intent i=new Intent("com.example.aishwarya.amazing.Clue5");
        startActivity(i);
    }
}
