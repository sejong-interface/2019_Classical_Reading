package com.example.testapplicationjkim;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButtonNaver(View v)
    {
        Intent intentNaver = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intentNaver);
    }

    public void onButtonNext(View v)
    {
        Intent intentNext = new Intent(getApplicationContext(), Main2Activity.class);
        startActivity(intentNext);
    }



}
