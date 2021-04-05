package com.example.newsapp;

import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class NewsUtils {

    private static final String SAMPLE_JSON_RESPONSE = "{\"response\":{\"status\":\"ok\",\"userTier\":\"developer\",\"total\":54075,\"startIndex\":1,\"pageSize\":10,\"currentPage\":1,\"pages\":5408,\"orderBy\":\"relevance\",\"results\":[{\"id\":\"technology/2004/may/13/comment.comment\",\"type\":\"article\",\"sectionId\":\"technology\",\"sectionName\":\"Technology\",\"webPublicationDate\":\"2004-05-13T02:05:52Z\",\"webTitle\":\"Second sight:  Azeem Azhar\",\"webUrl\":\"https://www.theguardian.com/technology/2004/may/13/comment.comment\",\"apiUrl\":\"https://content.guardianapis.com/technology/2004/may/13/comment.comment\",\"fields\":{\"headline\":\"Second sight\",\"byline\":\"Azeem Azhar\",\"shortUrl\":\"https://www.theguardian.com/p/27x6\"},\"blocks\":{\"body\":[{\"id\":\"234ec808-6110-4e66-9a79-6c17b40cd362\",\"bodyHtml\":\"<p>If you haven't already, forget about third generation mobile phones. The most exciting thing happening in telephony is Voice over Internet Protocol, or VoIP. This is where voice calls are transmitted over a data network far more cheaply than they would be over the normal phone network.</p> <p> In the US, the main VoIP players, such as Vonage and Packet8, are new entrants stealing a march on dozy incumbents. With a wide variety of features and calling plans that included unlimited national and international calls from as little as $50 a month, their services are attractive. </p> <p> While VoIP services have been available in the UK, mostly through American firms, for years, they have been targeted at \"early adopters\", people like me, who are happy to have a new gadget but are less bothered about whether it works. My experiments with VoIP services had been embarrassing. My callers always thought I was calling from a wind-tunnel or from the bottom of a well. </p> <p> But in the UK, the first firm to launch a consumer-friendly VoIP is BT. As any student of economics will tell you, this doesn't make sense. A firm with a large market share and concomitant market power doesn't have the same incentive to innovate as companies in a genuinely competitive market. Why try risky new products when you can milk boring old ones? </p> <p> And VoIP isn't just a slight improvement. It is a classic disruptive innovation like the advent of the PC, and the sort of thing that heralds extinction among firms tied to doing things \"the old way\". To meet that challenge, VoIP will need widespread adoption. So is it ready for the mainstream? And what on earth is BT doing first out of the gate? </p> <p> The answer to the first question is no: VoIP is still a geeks' toy. In spite of immaculate presentation and packaging and a free, 24-hour helpline, my BT Broadband Voice connection still doesn't work. </p> <p> Even if I could get it to work, BT has hamstrung it. Calls are expensive: certainly more so than the telephony offerings from companies such as Carphone Warehouse or Toucan. And you can only call 21 countries internationally. VoIP does offer benefits for businesses, such as integrating phone calls with data applications but, for the consumer, the real benefit is around price and convenience. Broadband Voice offers neither. </p> <p> This suggests an answer to the second question. BT has launched a VoIP service as a pre-emptive defence. Its VoIP service is a predatory move, an incremental improvement designed not to shake up its telephone business but to scare off rivals, placate investors and, maybe, build a tiny business. No matter. VoIP will ring in big changes. And it will be new entrants who will be shaking things up.</p> <p> Already, 12% of international telephony traffic is carried over cost-effective VoIP networks, and that number will rise. American firms are poised to bring consumer-friendly VoIP services to the UK. And, without a doubt, a bunch of home-grown players will get in on the act. And perhaps we will get phone calls at a price more appropriate to their cost. Zero, or close to it.</p>\",\"bodyTextSummary\":\"If you haven't already, forget about third generation mobile phones. The most exciting thing happening in telephony is Voice over Internet Protocol, or VoIP. This is where voice calls are transmitted over a data network far more cheaply than they would be over the normal phone network. In the US, the main VoIP players, such as Vonage and Packet8, are new entrants stealing a march on dozy incumbents. With a wide variety of features and calling plans that included unlimited national and international calls from as little as $50 a month, their services are attractive. While VoIP services have been available in the UK, mostly through American firms, for years, they have been targeted at \"early adopters\", people like me, who are happy to have a new gadget but are less bothered about whether it works. My experiments with VoIP services had been embarrassing. My callers always thought I was calling from a wind-tunnel or from the bottom of a well. But in the UK, the first firm to launch a consumer-friendly VoIP is BT. As any student of economics will tell you, this doesn't make sense. A firm with a large market share and concomitant market power doesn't have the same incentive to innovate as companies in a genuinely competitive market. Why try risky new products when you can milk boring old ones? And VoIP isn't just a slight improvement. It is a classic disruptive innovation like the advent of the PC, and the sort of thing that heralds extinction among firms tied to doing things \"the old way\". To meet that challenge, VoIP will need widespread adoption. So is it ready for the mainstream? And what on earth is BT doing first out of the gate? The answer to the first question is no: VoIP is still a geeks' toy. In spite of immaculate presentation and packaging and a free, 24-hour helpline, my BT Broadband Voice connection still doesn't work. Even if I could get it to work, BT has hamstrung it. Calls are expensive: certainly more so than the telephony offerings from companies such as Carphone Warehouse or Toucan. And you can only call 21 countries internationally. VoIP does offer benefits for businesses, such as integrating phone calls with data applications but, for the consumer, the real benefit is around price and convenience. Broadband Voice offers neither. This suggests an answer to the second question. BT has launched a VoIP service as a pre-emptive defence. Its VoIP service is a predatory move, an incremental improvement designed not to shake up its telephone business but to scare off rivals, placate investors and, maybe, build a tiny business. No matter. VoIP will ring in big changes. And it will be new entrants who will be shaking things up. Already, 12% of international telephony traffic is carried over cost-effective VoIP networks, and that number will rise. American firms are poised to bring consumer-friendly VoIP services to the UK. And, without a doubt, a bunch of home-grown players will get in on the act. And perhaps we will get phone calls at a price more appropriate to their cost. Zero, or close to it.\",\"attributes\":{},\"published\":true,\"createdDate\":\"2016-01-18T12:11:20Z\",\"lastModifiedDate\":\"2016-01-18T12:11:20Z\",\"contributors\":[],\"elements\":[{\"type\":\"text\",\"assets\":[],\"textTypeData\":{\"html\":\"<p>If you haven't already, forget about third generation mobile phones. The most exciting thing happening in telephony is Voice over Internet Protocol, or VoIP. This is where voice calls are transmitted over a data network far more cheaply than they would be over the normal phone network.</p> \n<p> In the US, the main VoIP players, such as Vonage and Packet8, are new entrants stealing a march on dozy incumbents. With a wide variety of features and calling plans that included unlimited national and international calls from as little as $50 a month, their services are attractive. </p> \n<p> While VoIP services have been available in the UK, mostly through American firms, for years, they have been targeted at \"early adopters\", people like me, who are happy to have a new gadget but are less bothered about whether it works. My experiments with VoIP services had been embarrassing. My callers always thought I was calling from a wind-tunnel or from the bottom of a well. </p> \n<p> But in the UK, the first firm to launch a consumer-friendly VoIP is BT. As any student of economics will tell you, this doesn't make sense. A firm with a large market share and concomitant market power doesn't have the same incentive to innovate as companies in a genuinely competitive market. Why try risky new products when you can milk boring old ones? </p> \n<p> And VoIP isn't just a slight improvement. It is a classic disruptive innovation like the advent of the PC, and the sort of thing that heralds extinction among firms tied to doing things \"the old way\". To meet that challenge, VoIP will need widespread adoption. So is it ready for the mainstream? And what on earth is BT doing first out of the gate? </p> \n<p> The answer to the first question is no: VoIP is still a geeks' toy. In spite of immaculate presentation and packaging and a free, 24-hour helpline, my BT Broadband Voice connection still doesn't work. </p> \n<p> Even if I could get it to work, BT has hamstrung it. Calls are expensive: certainly more so than the telephony offerings from companies such as Carphone Warehouse or Toucan. And you can only call 21 countries internationally. VoIP does offer benefits for businesses, such as integrating phone calls with data applications but, for the consumer, the real benefit is around price and convenience. Broadband Voice offers neither. </p> \n<p> This suggests an answer to the second question. BT has launched a VoIP service as a pre-emptive defence. Its VoIP service is a predatory move, an incremental improvement designed not to shake up its telephone business but to scare off rivals, placate investors and, maybe, build a tiny business. No matter. VoIP will ring in big changes. And it will be new entrants who will be shaking things up.</p> \n<p> Already, 12% of international telephony traffic is carried over cost-effective VoIP networks, and that number will rise. American firms are poised to bring consumer-friendly VoIP services to the UK. And, without a doubt, a bunch of home-grown players will get in on the act. And perhaps we will get phone calls at a price more appropriate to their cost. Zero, or close to it.</p>\"}}]}],\"totalBodyBlocks\":1},\"isHosted\":false,\"pillarId\":\"pillar/news\",\"pillarName\":\"News\"}";

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

                JSONObject fields = currentNews.getJSONObject("fields");
                String byline = fields.optString("byline");

                JSONObject blocks = currentNews.getJSONObject("blocks");
                JSONArray body = blocks.getJSONArray("body");

                for (int j = 0; j < body.length(); j++) {
                    JSONObject summary = body.getJSONObject(j);

                    String bodyTextSummary = summary.getString("bodyTextSummary");

                    News newsItems = new News(sectionName, webTitle, webPublicationDate, byline, bodyTextSummary);
                    news.add(newsItems);
                }
            }

        } catch (JSONException e) {
            Log.e("QueryUtils", "Problem parsing the news JSON results", e);
            e.printStackTrace();
        }
        return news;
    }

}
