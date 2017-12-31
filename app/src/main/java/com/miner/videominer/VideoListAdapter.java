package com.miner.videominer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;



public class VideoListAdapter extends RecyclerView.Adapter<VideoListViewHolder> {

    ArrayList<VideoEntity> list;

    public VideoListAdapter(ArrayList<VideoEntity> list) {
        this.list = list;
    }

    @Override
    public VideoListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view_holder, parent, false);
        VideoListViewHolder vh = new VideoListViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(VideoListViewHolder holder, int position) {
        holder.setVideo(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
