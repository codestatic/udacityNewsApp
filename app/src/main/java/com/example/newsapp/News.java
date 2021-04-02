package com.example.newsapp;

public class News {

    private String mWebUrl;

    private String mSectionName;

    private String mWebTitle;

    private String mWebPublicationDate;

    private String mContributor;

    public News(String webUrl, String sectionName, String webTitle, String webPublicationDate, String contributor) {
        mWebUrl = webUrl;
        mSectionName = sectionName;
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mContributor = contributor;
    }

    public String getWebUrl() {
        return mWebUrl;
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

    public String getContributor() {
        return mContributor;
    }
}
