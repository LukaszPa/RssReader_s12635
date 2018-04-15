package com.example.lukas.rssreader_s12635;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickReadRss( View view) {
        Intent intent = new Intent(this, ReadingActivity.class);
        startActivity(intent);

    }
}
