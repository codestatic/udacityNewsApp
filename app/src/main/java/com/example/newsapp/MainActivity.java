package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<News> news = NewsUtils.extractNews();

        NewsAdapter newsAdapter = new NewsAdapter(this, news);

        ListView newsListView = (ListView) findViewById(R.id.list_view);

        newsListView.setAdapter(newsAdapter);
    }

}