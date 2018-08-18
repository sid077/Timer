package com.siddhant.timer;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(12000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                Log.i("tick", String.valueOf(millisUntilFinished/1000));

            }

            @Override
            public void onFinish() {
                Log.i("timer","finished");

            }
        }.start();
       final Handler handler = new Handler();
        Runnable run = new Runnable() {
            @Override
            public void run() {
             handler.postDelayed(this,1000)  ;
                Log.i("Run","running");
            }
        };
        handler.post(run);
    }
}
