package com.example.classic_test;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {

    String myJSON;

    private static final String TAG_RESPONSE = "response";
    private static final String TAG_QUESTION = "question";
    private static final String TAG_ANS1 = "ans1";
    private static final String TAG_ANS2 = "ans2";
    private static final String TAG_ANS3 = "ans3";
    private static final String TAG_ANS4 = "ans4";
    private static final String TAG_ANS5 = "ans5";
    private static final String TAG_ANSWER = "answer";

    JSONArray problems = null;

    ArrayList<HashMap<String,String>>problemList = new ArrayList<>();

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView)findViewById(R.id.listView);

        problemList =  new ArrayList<HashMap<String, String>>();
        getData("http://jkey20.cafe24.com/GUN.php"); //php 이름만 바꾸면 데이터 불러오기 가능

    }

    protected void showList(){
        try {
            JSONObject jsonObj = new JSONObject(myJSON);
            problems = jsonObj.getJSONArray(TAG_RESPONSE);

            for(int i=0;i<problems.length();i++){
                JSONObject c = problems.getJSONObject(i);

                String question = c.getString(TAG_QUESTION);
                String ans1 = c.getString(TAG_ANS1);
                String ans2 = c.getString(TAG_ANS2);
                String ans3 = c.getString(TAG_ANS3);
                String ans4 = c.getString(TAG_ANS4);
                String ans5 = c.getString(TAG_ANS5);
                String answer = c.getString(TAG_ANSWER);

                HashMap<String,String> problem = new HashMap<String,String>();

                problem.put(TAG_QUESTION,question);
                problem.put(TAG_ANS1,ans1);
                problem.put(TAG_ANS2,ans2);
                problem.put(TAG_ANS3,ans3);
                problem.put(TAG_ANS4,ans4);
                problem.put(TAG_ANS5,ans5);
                problem.put(TAG_ANSWER,answer);


                problemList.add(problem);
            }

            ListAdapter adapter = new SimpleAdapter(
                    MainActivity.this, problemList, R.layout.list_item,
                    new String[]{TAG_QUESTION,TAG_ANS1,TAG_ANS2,TAG_ANS3,TAG_ANS4,TAG_ANS5,TAG_ANSWER},
                    new int[]{R.id.question, R.id.ans1, R.id.ans2,R.id.ans3,R.id.ans4,R.id.ans5,R.id.answer}
            );

            list.setAdapter(adapter);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void getData(String url){
        class GetDataJSON extends AsyncTask<String, Void, String>{

            @Override
            protected String doInBackground(String... params) {

                String uri = params[0];

                BufferedReader bufferedReader = null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();

                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while((json = bufferedReader.readLine())!= null){
                        sb.append(json+"\n");
                    }

                    return sb.toString().trim();

                }catch(Exception e){
                    return null;
                }



            }

            @Override
            protected void onPostExecute(String result){
                myJSON=result;
                showList();
            }
        }
        GetDataJSON g = new GetDataJSON();
        g.execute(url);
    }
}


