package com.example.newsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(@NonNull Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_items, parent, false);
        }

        News currentNews = getItem(position);

        // gets original trail text form JSON parsing for summary text view
        String originalTrail = currentNews.getTrailText();

        // removes web formatting tags
        String trailFix = originalTrail.replaceAll("<p>|</p>|<strong>|</strong>|\n|<br>", "");

        // finding text view for content summary
        TextView trailTextView = (TextView) listItemView.findViewById(R.id.content_view);
        trailTextView.setText(trailFix);

        // finding text view for section name
        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section_name_view);
        sectionTextView.setText(currentNews.getSectionName());

        // finding text view for news title
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.web_title_view);
        titleTextView.setText(currentNews.getWebTitle());

        // finding text view for contributor name
        TextView contributorTextView = (TextView) listItemView.findViewById(R.id.contributor_name_view);
        contributorTextView.setText(currentNews.getByline());

        // create the sub string for correct date
        String originalDate = currentNews.getWebPublicationDate();

        String dateSubstring = originalDate.substring(0, 10);

        // finding text view for publication date
        TextView dateLocationView = (TextView) listItemView.findViewById(R.id.publication_date_view);
        dateLocationView.setText(dateSubstring);

        return listItemView;
    }
}