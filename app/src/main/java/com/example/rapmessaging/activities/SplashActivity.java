package com.example.rapmessaging.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.rapmessaging.R;
import com.example.rapmessaging.databinding.ActivityMainBinding;

public class SplashActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(binding.getRoot());
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            public void run(){
                try{
                    sleep(2000);
                }catch (Exception e){
                    e.printStackTrace();

                }finally {
                    Intent intent = new Intent(SplashActivity.this, SignInActivity.class);
                    startActivity(intent);
                }
            }
        };thread.start();
    }
}