package com.example.button_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button NextBtn = (Button) findViewById(R.id.Btn_NextMenu);
        Button RegisterBtn = (Button) findViewById(R.id.Btn_Register);

        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_NextPage = new Intent(getApplicationContext(),NextMenu.class);
                startActivity(intent_NextPage);
            }
        });

        RegisterBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent_RegisterPage = new Intent(getApplicationContext(),RegisterMenu.class);
                startActivity(intent_RegisterPage);
            }
        });
    }


}
