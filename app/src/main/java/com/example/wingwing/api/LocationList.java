package com.example.wingwing.api;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

public class LocationList {
    public static void main(String[] args){
//        key 채워넣기
        String clientId = "";
        String clientSecret = "";

        String temp_json;
        String json = "";
        String search_word;

        LocationInfo info;
        BufferedReader br;

        Scanner sc = new Scanner(System.in);
        URLConnection urlConn;
        URL url;
        try {
            search_word = URLEncoder.encode(sc.nextLine(), "UTF-8"); // 검색어
            url = new URL("https://openapi.naver.com/v1/search/local.json?query=" + search_word + "&display=" + 100); //API 기본정보의 요청 url을 복사해오고 필수인 query를 적어줍니당!
            urlConn = url.openConnection(); //openConnection 해당 요청에 대해서 쓸 수 있는 connection 객체

            urlConn.setRequestProperty("X-Naver-Client-ID", clientId);
            urlConn.setRequestProperty("X-Naver-Client-Secret", clientSecret); // do not setting,

            br = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

            while ((temp_json = br.readLine()) != null) {
                json += temp_json;
            }
            json = json.trim();


        } catch (Exception e) {
            System.out.println("ERROR");

            e.printStackTrace();
        }
        info = new Gson().fromJson(json, LocationInfo.class);
    }
    }

}
