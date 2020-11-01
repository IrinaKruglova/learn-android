package com.simbirsoft.learnandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView phraseView = findViewById(R.id.phrase);
        phraseView.setText(R.string.phrase);
        findViewById(R.id.cakeImage).setOnClickListener(v -> {
            //TODO: complete the task
        });
    }
}