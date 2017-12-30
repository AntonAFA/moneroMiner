package com.miner.videominer;

/**
 * Created by kalma on 29/12/2017.
 */

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
