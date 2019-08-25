package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class NextMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_menu);
    }

    public void onClickToast(View view){
        Toast.makeText(getApplicationContext(), "Button Click!", Toast.LENGTH_SHORT).show();
    }

    public void onClickInternet(View view){
        Intent intent = new Intent (Intent.ACTION_VIEW,Uri.parse("https://m.naver.com"));
        startActivity(intent);
    }
}
