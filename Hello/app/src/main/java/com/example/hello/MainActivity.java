package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNext(View view){
        Intent intent = new Intent (this, NextMenu.class);
        startActivity(intent);
    }

}


