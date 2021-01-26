package com.example.wingwing.api;

public class LocationInfo {
    public String lastBuildDate;
    public int total;
    public int start;
    public int display;
    public Item[] items;

    class Item {
        public String title;
        public String link;
        public String category;
        public String description;
        public String telephone;
        public String address;
        public String roadAddress;
        public String mapx;
        public String mapy;
    }
}
