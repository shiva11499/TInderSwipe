package com.gshivansh37.wallpaperswipe.models;

public class User {
    private String name;
    private String info;
    private String imageUrl;

    public User(String name, String info, String imageUrl) {
        this.name = name;
        this.info = info;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
