package org.IF.classicreading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BookListActivity extends AppCompatActivity {

  @Override
  public void onProvideAssistData(Bundle data) {
    super.onProvideAssistData(data);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_book_list);
  }
}
