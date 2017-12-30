package com.miner.videominer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setVideoList();
    }

    private void setVideoList() {
        RecyclerView videoListRecyclerView = findViewById(R.id.videoListRecyclerView);
        videoListRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        ArrayList<VideoEntity> list = new ArrayList<>();
        list.add(new VideoEntity(R.drawable.insteler, "Interstellar", "2:40", "1.5m"));
        list.add(new VideoEntity(R.drawable.jurasic, "Jurassic Park", "3:17", "1.5m"));
        list.add(new VideoEntity(R.drawable.gadot, "Wonder Woman", "2:25", "1.5m"));
        VideoListAdapter videoListAdapter = new VideoListAdapter(list);
        videoListRecyclerView.setAdapter(videoListAdapter);
    }
}