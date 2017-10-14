package com.example.jokepresenter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokePresenterActivity extends AppCompatActivity {

    TextView jokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presenter_main);
        jokeView = findViewById(R.id.joke_view_textView);
        String joke = getIntent().getStringExtra("JOKE");
        if (joke != null && !joke.trim().isEmpty()) {
            jokeView.setText(joke);
        }
    }
}
