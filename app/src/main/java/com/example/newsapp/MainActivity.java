package com.example.newsapp;

import android.app.LoaderManager;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.Loader;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderCallbacks<List<News>> {

    private static final int NEWS_LOADER_ID = 1;

    private NewsAdapter mAdapter;

    private TextView mEmptyStateTextView;

    private static final String GUARDIAN_REQUEST_URL = "https://content.guardianapis.com/search?api-key=test";

    @Override
    public Loader<List<News>> onCreateLoader(int id, Bundle args) {
        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        // Retrieves a String value from the preferences, and default value
        String value = sharedPrefs.getString(
                getString(R.string.results_key),
                getString(R.string.results_default));

        // parse breaks apart the URI string that's passed into its parameter
        Uri baseUri = Uri.parse(GUARDIAN_REQUEST_URL);

        // buildUpon prepares the baseUri
        Uri.Builder uriBuilder = baseUri.buildUpon();

        // Append query parameter and its value
        uriBuilder.appendQueryParameter("page-size", value);
        uriBuilder.appendQueryParameter("section", "technology");
        uriBuilder.appendQueryParameter("show-fields", "trailText,byline");

        // Return the completed uri
        return new NewsLoader(this, uriBuilder.toString());

    }

    @Override
    public void onLoadFinished(Loader<List<News>> loader, List<News> news) {

        View loadingIndicator = findViewById(R.id.loading_indicator);
        loadingIndicator.setVisibility(View.GONE);

        mEmptyStateTextView.setText(R.string.sorry_no_news);

        // Clear the adapter of previous news data
        mAdapter.clear();

        // add list of data set and update listView
        if (news != null && !news.isEmpty()) {
            mAdapter.addAll(news);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<News>> loader) {
        // Loader reset
        mAdapter.clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapter = new NewsAdapter(this, new ArrayList<News>());

        ListView newsListView = (ListView) findViewById(R.id.list_view);

        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        newsListView.setEmptyView(mEmptyStateTextView);

        newsListView.setAdapter(mAdapter);

        // Get a reference to the ConnectivityManager to check state of network connectivity
        ConnectivityManager connMgr = (ConnectivityManager)
                getSystemService(Context.CONNECTIVITY_SERVICE);

        // Get details on the currently active default data network
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();

        // If there is a network connection, fetch data
        if (networkInfo != null && networkInfo.isConnected()) {

            // Get a reference to the LoaderManager
            LoaderManager loaderManager = getLoaderManager();

            // Initialize the loader.
            loaderManager.initLoader(NEWS_LOADER_ID, null, this);
        } else {
            // Otherwise, display error
            // First, hide loading indicator so error message will be visible
            View loadingIndicator = findViewById(R.id.loading_indicator);
            loadingIndicator.setVisibility(View.GONE);
            mEmptyStateTextView.setText(R.string.no_internet);
        }

        // Start the AsyncTask to fetch the news data
        newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                News currentNews = mAdapter.getItem(position);

                Uri newsUri = Uri.parse(currentNews.getWebUrl());

                // Create a new intent to view the news URI
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, newsUri);

                // Send the intent to launch a new activity
                startActivity(websiteIntent);
            }
        });
    }

    @Override
    // This method initialize the contents of the Activity's options menu.
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the Options Menu we specified in XML
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            Intent settingsIntent = new Intent(this, SettingsActivity.class);
            startActivity(settingsIntent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}