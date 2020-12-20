package com.example.zadanie4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.launch_screen);
    }
    public void Next(View v)
    {
        Intent intent = new Intent(this, MainScreenActivity.class);
        startActivity(intent);
    }
}