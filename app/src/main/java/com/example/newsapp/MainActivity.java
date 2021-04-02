package com.example.newsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<News> news = new ArrayList<>();
        news.add(new News("webUrl", "Technology", "New Teeth Make For Better Chewing", "Dec. 2019", "John Smith"));
        news.add(new News("webUrl", "Technology", "New Teeth Make For Better Chewing", "Dec. 2019", "John Smith"));
        news.add(new News("webUrl", "Technology", "New Teeth Make For Better Chewing", "Dec. 2019", "John Smith"));
        news.add(new News("webUrl", "Technology", "New Teeth Make For Better Chewing", "Dec. 2019", "John Smith"));

        NewsAdapter adapter = new NewsAdapter(this, news);

        ListView listView = (ListView) findViewById(R.id.list_view);

        listView.setAdapter(adapter);
    }
}