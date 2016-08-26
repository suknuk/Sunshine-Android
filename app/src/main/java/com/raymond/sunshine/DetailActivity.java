package com.raymond.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_detail);

        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            String message = intent.getStringExtra(Intent.EXTRA_TEXT);
            TextView textView = (TextView) findViewById(R.id.detail_TextView);
            textView.setText(message);
        }
    }
}
