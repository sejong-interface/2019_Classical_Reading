package com.example.testapplicationjkim2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Button NaverButton = (Button)findViewById(R.id.naverButton); // 버튼객체 정의

        NaverButton.setOnclickListener( new View.OnClickListener(){ // 버튼이 눌렸을 때 이벤트 처리
            @Override
            public void onClick(View v) { // 버튼이 눌렸을 시
                onNaverButtonClicked(); // onButtonNaver 메소드 실행
            }
        });

        Button ToastButton = (Button)findViewById(R.id.toastButton); // 버튼객체 정의

        ToastButton.setOnclickListener( new View.OnClickListener(){ // 버튼이 눌렸을 때 이벤트 처리
            @Override
            public void onClick(View v) { // 버튼이 눌렸을 시
                onToastButtonClicked(); // onToastButtonClicked 메소드 실행
            }
        });
    }

    public void onNaverButtonClicked() {

        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(myIntent);

    }

    public void onToastButtonClicked() {

        Toast.makeText(getApplicationContext(), "토스트!",Toast.LENGTH_LONG).show();

    }

}
