package com.example.newsapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class NewsUtils {

    private static final String SAMPLE_JSON_RESPONSE = "{\"response\":{\"status\":\"ok\",\"userTier\":\"developer\",\"total\":54075,\"startIndex\":1,\"pageSize\":10,\"currentPage\":1,\"pages\":5408,\"orderBy\":\"relevance\",\"results\":[{\"id\":\"technology/2004/may/13/comment.comment\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2004-05-13T02:05:52Z\",\"webTitle\":\"Second sight:  Azeem Azhar\",\"webUrl\":\"https://www.theguardian.com/technology/2004/may/13/comment.comment\",\"apiUrl\":\"https://content.guardianapis.com/technology/2004/may/13/comment.comment\",\"fields\":{\"headline\":\"Second sight\",\"trailText\":\"<p>The most exciting thing\\n    happening in telephony is Voice over Internet Protocol, says <strong> Azeem Azhar</strong>.</p>\",\"byline\":\"Azeem Azhar\",\"shortUrl\":\"https://www.theguardian.com/p/27x6\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2004/may/13/interviews.onlinesupplement\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2004-05-13T02:05:12Z\",\"webTitle\":\"Talk time: Steven Johnson\",\"webUrl\":\"https://www.theguardian.com/technology/2004/may/13/interviews.onlinesupplement\",\"apiUrl\":\"https://content.guardianapis.com/technology/2004/may/13/interviews.onlinesupplement\",\"fields\":{\"headline\":\"Talk time: Steven Johnson\",\"trailText\":\"<p><strong>Steven Johnson</strong>'s new book Mind Wide Open is out now.</p>\",\"byline\":\"Interviewed by Hamish Mackintosh\",\"shortUrl\":\"https://www.theguardian.com/p/27vq\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2011/aug/23/hp-pc-division-webos-developers\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2011-08-23T06:20:24Z\",\"webTitle\":\"HP PC review 'to be finished in eight to 12 weeks'\",\"webUrl\":\"https://www.theguardian.com/technology/2011/aug/23/hp-pc-division-webos-developers\",\"apiUrl\":\"https://content.guardianapis.com/technology/2011/aug/23/hp-pc-division-webos-developers\",\"fields\":{\"headline\":\"HP PC review 'to be finished in eight to 12 weeks'\",\"trailText\":\"<p>Former Palm chief executive Todd Bradley says HP will decide what to do with its PC division before year-end – while Microsoft woos WebOS developers to Windows Phone. By <strong>Charles Arthur</strong></p>\",\"byline\":\"Charles Arthur and agencies\",\"shortUrl\":\"https://www.theguardian.com/p/3xcz3\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2008/oct/23/tom-steinberg-fixmystreet-mysociety\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2008-10-22T23:01:00Z\",\"webTitle\":\"Interview: Tom Steinberg of MySociety\",\"webUrl\":\"https://www.theguardian.com/technology/2008/oct/23/tom-steinberg-fixmystreet-mysociety\",\"apiUrl\":\"https://content.guardianapis.com/technology/2008/oct/23/tom-steinberg-fixmystreet-mysociety\",\"fields\":{\"headline\":\"The former insider who became an internet guerrilla\",\"trailText\":\"<p>Tom Steinberg has shown the government what a joined-up web presence is through his work for the MySociety charity</p>\",\"byline\":\"Michael Cross\",\"shortUrl\":\"https://www.theguardian.com/p/223yd\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2009/apr/02/filefront-cloud-computing-online-data\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2009-04-01T23:15:48Z\",\"webTitle\":\"Newly asked questions: Can I assume my online data is safe for ever?\",\"webUrl\":\"https://www.theguardian.com/technology/2009/apr/02/filefront-cloud-computing-online-data\",\"apiUrl\":\"https://content.guardianapis.com/technology/2009/apr/02/filefront-cloud-computing-online-data\",\"fields\":{\"headline\":\"Can I assume that my online data is safe for ever?\",\"trailText\":\"<p>Filefront has folded, and gamers were only just able to get out in time</p>\",\"byline\":\"Bobbie Johnson\",\"shortUrl\":\"https://www.theguardian.com/p/26gty\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2012/may/24/facebook-ipo-mark-zuckerberg-nasdaq\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2012-05-24T16:45:00Z\",\"webTitle\":\"Facebook IPO: five things that went wrong with the social network's debut\",\"webUrl\":\"https://www.theguardian.com/technology/2012/may/24/facebook-ipo-mark-zuckerberg-nasdaq\",\"apiUrl\":\"https://content.guardianapis.com/technology/2012/may/24/facebook-ipo-mark-zuckerberg-nasdaq\",\"fields\":{\"headline\":\"Facebook IPO: five things that went wrong with the social network's debut\",\"trailText\":\"<p>Facebook's IPO was the most-hyped tech offering since Google went public, but the sale is proving a disaster for the firm</p>\",\"byline\":\"Dominic Rushe\",\"shortUrl\":\"https://www.theguardian.com/p/37zcz\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2012/jun/24/scientists-research-software-data-naughton\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2012-06-23T23:05:47Z\",\"webTitle\":\"We love your work… now show us your workings\",\"webUrl\":\"https://www.theguardian.com/technology/2012/jun/24/scientists-research-software-data-naughton\",\"apiUrl\":\"https://content.guardianapis.com/technology/2012/jun/24/scientists-research-software-data-naughton\",\"fields\":{\"headline\":\"We love your work… now show us your workings\",\"trailText\":\"The validity of scientific research depends upon practitioners publishing their software, writes <strong>John Naughton</strong>\",\"byline\":\"John Naughton\",\"shortUrl\":\"https://www.theguardian.com/p/38fz2\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2012/apr/29/shed-light-on-blacklisting-conspiracy\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2012-04-29T20:00:12Z\",\"webTitle\":\"Letters: Shed some light on blacklisting conspiracy\",\"webUrl\":\"https://www.theguardian.com/technology/2012/apr/29/shed-light-on-blacklisting-conspiracy\",\"apiUrl\":\"https://content.guardianapis.com/technology/2012/apr/29/shed-light-on-blacklisting-conspiracy\",\"fields\":{\"headline\":\"Shed some light on blacklisting conspiracy\",\"trailText\":\"<strong>Letters:</strong> It was documents disclosed at my employment tribunal that brought to light the probable collusion by police and/or security services\",\"shortUrl\":\"https://www.theguardian.com/p/3786c\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2016/jan/18/whatsapp-drops-subscription-fee-free\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2016-01-18T11:34:41Z\",\"webTitle\":\"WhatsApp drops subscription fee to become fully free\",\"webUrl\":\"https://www.theguardian.com/technology/2016/jan/18/whatsapp-drops-subscription-fee-free\",\"apiUrl\":\"https://content.guardianapis.com/technology/2016/jan/18/whatsapp-drops-subscription-fee-free\",\"fields\":{\"headline\":\"WhatsApp drops subscription fee to become fully free\",\"trailText\":\"Users will never again have to pay to use WhatsApp, Facebook’s messaging service\",\"byline\":\"Alex Hern\",\"shortUrl\":\"https://www.theguardian.com/p/4fqkt\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"},{\"id\":\"technology/2006/dec/07/innovations.guardianweeklytechnologysection2\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2006-12-07T23:53:33Z\",\"webTitle\":\"Samsung Z560\",\"webUrl\":\"https://www.theguardian.com/technology/2006/dec/07/innovations.guardianweeklytechnologysection2\",\"apiUrl\":\"https://content.guardianapis.com/technology/2006/dec/07/innovations.guardianweeklytechnologysection2\",\"fields\":{\"headline\":\"Samsung Z560\",\"trailText\":\"<p>In many ways the Samsung Z560 - which is the first standard handset, as opposed to a smartphone, to sport HSDPA functionality - is a real breakthrough.</p>\",\"byline\":\"Ashley Norris\",\"shortUrl\":\"https://www.theguardian.com/p/xg8a\"},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"}]}}";

    private NewsUtils() {
    }

    public static ArrayList<News> extractNews() {

        ArrayList<News> news = new ArrayList<>();

        try {

            JSONObject root = new JSONObject(SAMPLE_JSON_RESPONSE);

            JSONObject response = root.getJSONObject("response");
            JSONArray results = response.getJSONArray("results");

            for (int i = 0; i < results.length(); i++) {

                JSONObject currentNews = results.getJSONObject(i);

                String sectionName = currentNews.getString("sectionName");
                String webTitle = currentNews.getString("webTitle");
                String webPublicationDate = currentNews.getString("webPublicationDate");
                String webUrl = currentNews.getString("webUrl");

                JSONObject fields = currentNews.getJSONObject("fields");
                String byline = fields.optString("byline");
                String trailText = fields.optString("trailText");

                    News newsItems = new News(sectionName, webTitle, webPublicationDate, byline, trailText, webUrl);
                    news.add(newsItems);
                }

        } catch (JSONException e) {
            Log.e("QueryUtils", "Problem parsing the news JSON results", e);
            e.printStackTrace();
        }
        return news;

    }

}
