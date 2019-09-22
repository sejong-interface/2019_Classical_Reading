package com.example.testapplicationjkim2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button NextButton = (Button)findViewById(R.id.nextButton); // 버튼객체 정의

        //error: cannot find symbol method setOnclickListener(<anonymous OnClickListener>)

        NextButton.setOnclickListener( new View.OnClickListener(){ // 버튼이 눌렸을 때 이벤트 처리
            @Override
            public void onClick(View v) { // 버튼이 눌렸을 시
                onNextButtonClicked(); // onButtonNaver 메소드 실행
            }
        });
    }

    public void onNextButtonClicked() {

        Intent intent = new Intent(getApplicationContext(), NextActivity.class);
        startActivity(intent);

    }
}
