package com.example.asus.tommysyamranata_1202153368_modul2;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

public class splashActivity extends AppCompatActivity {
    private static int splashInterval = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {
                Intent i = new Intent(splashActivity.this, MainActivity.class);
                startActivity(i);
                Toast.makeText(splashActivity.this,"TOMMYSYAMRANATA_1202153368", Toast.LENGTH_LONG).show();
                this.finish();
            }
            private void finish(){

            }
        }, splashInterval);
    }

}
