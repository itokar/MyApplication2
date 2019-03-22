package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class StartActivity extends AppCompatActivity {

    private ImageView logo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo  = (ImageView) findViewById(R.id.logo);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.animation);
        logo.startAnimation(animation);
        final Intent intent = new Intent(this,HomeActivity.class);
        Thread thread = new Thread(){
            @Override
            public void run() {

                try{

                    sleep(5000);
                }catch (InterruptedException e){

                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }

            }
        };
        thread.start();

    }
}
