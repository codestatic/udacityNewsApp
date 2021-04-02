package com.example.newsapp;

public class News {

    private String mSectionName;

    private String mWebTitle;

    private int mWebPublicationDate;

    private String mByline;

    private String mTrailText;

    public News(String sectionName, String webTitle, int webPublicationDate, String byline, String trailText) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mByline = byline;
        mTrailText = trailText;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public int getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getByline() {
        return mByline;
    }

    public String getTrailText() { return mTrailText; }
}
