package com.example.button_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class NextMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_menu);
        final Button ToastBtn = (Button) findViewById(R.id.Btn_Toast);
        Button InternetBtn = (Button)findViewById((R.id.Btn_Internet));
        ToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "버튼 클릭", Toast.LENGTH_SHORT).show();
            }
        });

        InternetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_Internet = new Intent(Intent.ACTION_VIEW,Uri.parse("https://naver.com"));
                startActivity(intent_Internet);
            }
        });
    }
}
