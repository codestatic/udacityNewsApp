package com.example.newsapp;

public class News {

    private String mSectionName;

    private String mWebTitle;

    private String mWebPublicationDate;

    private String mByline;

    private String mTrailText;

    private String mWebUrl;

    public News(String sectionName, String webTitle, String webPublicationDate, String byline, String trailText, String webUrl) {
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mByline = byline;
        mTrailText = trailText;
        mWebUrl = webUrl;
    }

    public String getSectionName() {
        return mSectionName;
    }

    public String getWebTitle() {
        return mWebTitle;
    }

    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    public String getByline() {
        return mByline;
    }

    public String getTrailText() { return mTrailText; }

    public String getWebUrl() { return mWebUrl; }
}
