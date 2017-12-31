package com.miner.videominer;



public class VideoEntity {
    int thumbnail;
    String title;
    String time;
    String views;

    public VideoEntity(int thumbnail, String title, String time, String views) {
        this.thumbnail = thumbnail;
        this.title = title;
        this.time = time;
        this.views = views;
    }
}
