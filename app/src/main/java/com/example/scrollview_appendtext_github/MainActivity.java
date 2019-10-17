package com.example.scrollview_appendtext_github;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ScrollView scrollView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollView = findViewById(R.id.scroll_view);
        textView = findViewById(R.id.text_view);

    }

    public void print(View view) {
        display("Hello");
    }

    public void clear(View view) {
        textView.setText("");
        scrollView.scrollTo(0,scrollView.getTop());
    }

    private String display(String message){
        textView.append(message + "\n");
        scrollView.scrollTo(0,scrollView.getBottom());
        return message;
    }
}
