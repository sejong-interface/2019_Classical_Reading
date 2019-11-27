package com.example.g;

import android.os.AsyncTask;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    private String htmlPageUrl = "http://classic.sejong.ac.kr/info/MAIN_02_03.do"; //파싱할 홈페이지의 URL주소
    private TextView textviewHtmlDocument;
    private String htmlContentInStringFormat="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textviewHtmlDocument = (TextView)findViewById(R.id.textView);

        textviewHtmlDocument.setMovementMethod(new ScrollingMovementMethod()); //스크롤 가능한 텍스트뷰로 만들기

        Button htmlTitleButton1 = (Button)findViewById(R.id.button1);
        Button htmlTitleButton2 = (Button)findViewById(R.id.button2);
        Button htmlTitleButton3 = (Button)findViewById(R.id.button3);
        Button htmlTitleButton4 = (Button)findViewById(R.id.button4);

        //눌리자마자 실행
        htmlTitleButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //안의 값 초기화
                htmlContentInStringFormat = "";
                JsoupAsyncTask1 jsoupAsyncTask1 = new JsoupAsyncTask1();
                jsoupAsyncTask1.execute();
            }
        });

        htmlTitleButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                htmlContentInStringFormat = "";
                JsoupAsyncTask2 jsoupAsyncTask2 = new JsoupAsyncTask2();
                jsoupAsyncTask2.execute();
            }
        });

        htmlTitleButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                htmlContentInStringFormat = "";
                JsoupAsyncTask3 jsoupAsyncTask3 = new JsoupAsyncTask3();
                jsoupAsyncTask3.execute();
            }
        });

        htmlTitleButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                htmlContentInStringFormat = "";
                JsoupAsyncTask4 jsoupAsyncTask4 = new JsoupAsyncTask4();
                jsoupAsyncTask4.execute();
            }
        });
    }

    private class JsoupAsyncTask1 extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {

                Document doc = Jsoup.connect(htmlPageUrl).get();

                //

                Elements titles = doc.select("div#tab1 > div.bookArea > ul.book_list > li > a[href] > span.book_tit" );


               // Elements titles= doc.select("span.book_tit"); // 여기수정

                for(Element e: titles){
                    System.out.println("title: " + e.text());
                    htmlContentInStringFormat += e.text().trim() + "\n";
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            textviewHtmlDocument.setText(htmlContentInStringFormat);
        }
    }


    private class JsoupAsyncTask2 extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {

                Document doc = Jsoup.connect(htmlPageUrl).get();

                //

                Elements titles = doc.select("div#tab2 > div.bookArea > ul.book_list > li > a[href] > span.book_tit" );


                // Elements titles= doc.select("span.book_tit"); // 여기수정

                for(Element e: titles){
                    System.out.println("title: " + e.text());
                    htmlContentInStringFormat += e.text().trim() + "\n";
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            textviewHtmlDocument.setText(htmlContentInStringFormat);
        }
    }

    private class JsoupAsyncTask3 extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {

                Document doc = Jsoup.connect(htmlPageUrl).get();

                //

                Elements titles = doc.select("div#tab3 > div.bookArea > ul.book_list > li > a[href] > span.book_tit" );


                // Elements titles= doc.select("span.book_tit"); // 여기수정

                for(Element e: titles){
                    System.out.println("title: " + e.text());
                    htmlContentInStringFormat += e.text().trim() + "\n";
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            textviewHtmlDocument.setText(htmlContentInStringFormat);
        }
    }

    private class JsoupAsyncTask4 extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... params) {
            try {

                Document doc = Jsoup.connect(htmlPageUrl).get();

                //

                Elements titles = doc.select("div#tab4 > div.bookArea > ul.book_list > li > a[href] > span.book_tit" );


                // Elements titles= doc.select("span.book_tit"); // 여기수정

                for(Element e: titles){
                    System.out.println("title: " + e.text());
                    htmlContentInStringFormat += e.text().trim() + "\n";
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            textviewHtmlDocument.setText(htmlContentInStringFormat);
        }
    }

}
