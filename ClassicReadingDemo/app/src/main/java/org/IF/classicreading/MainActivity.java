package org.IF.classicreading;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    Button bookListButton = (Button)findViewById(R.id.BookListBtn);

    bookListButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Intent bookListIntent = new Intent(getApplicationContext(), BookListActivity.class);
        startActivity(bookListIntent);

      }
    });

  }
}
