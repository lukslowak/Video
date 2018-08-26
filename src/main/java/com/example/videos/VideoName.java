package com.example.videos;

import java.util.ArrayList;
import java.util.List;

public class VideoName {

    private String name;

    public VideoName(){
//        videoList.add(this);
    }

    public VideoName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    private static List<VideoName> videoList = new ArrayList<>();

    public static List<VideoName> getVideoList() {
        return videoList;
    }

    public VideoName (String name, String url){
        this.name = name;
        this.url = url;
        videoList.add(this);
    }

    @Override
    public String toString() {
        return "VideoName{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}