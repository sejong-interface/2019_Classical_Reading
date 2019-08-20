package com.example.testapplicationjkim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void onButtonToast(View v)
    {
        Toast.makeText(getApplicationContext(), "Toast!", Toast.LENGTH_LONG).show();
    }
}
