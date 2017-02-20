package com.funcore.vkappl.services;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserRetrieval {

    public void retrieveUser(String uid) {
        String url = "https://vk.com/dev/users.get?user_ids=" + uid;
//        HttpClient client = new DefaultHttpClient();
//        HttpGet request = new HttpGet(url);
//
//        // add request header
//        request.addHeader("User-Agent", USER_AGENT);
//
//        HttpResponse response = client.execute(request);
//
//        System.out.println("\nSending 'GET' request to URL : " + url);
//        System.out.println("Response Code : " +
//                response.getStatusLine().getStatusCode());
//
//        BufferedReader rd = new BufferedReader(
//                new InputStreamReader(response.getEntity().getContent()));
//
//        StringBuffer result = new StringBuffer();
//        String line = "";
//        while ((line = rd.readLine()) != null) {
//            result.append(line);
//        }

//        System.out.println(result.toString());
    }
}
