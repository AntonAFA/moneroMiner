package com.miner.videominer;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by kalma on 29/12/2017.
 */

public class VideoListViewHolder extends RecyclerView.ViewHolder {

    private RelativeLayout thumbnail;
    private TextView title, length;
    private RelativeLayout container;

    public VideoListViewHolder(final View itemView) {
        super(itemView);
        thumbnail = itemView.findViewById(R.id.thumbnail_background);
        title = itemView.findViewById(R.id.video_title);
        length = itemView.findViewById(R.id.video_time);
        container = itemView.findViewById(R.id.view_holder_container);
        container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemView.getContext().startActivity(new Intent(itemView.getContext(), VideoActivity.class));
            }
        });

    }

    public void setVideo(VideoEntity video) {
        thumbnail.setBackground(ContextCompat.getDrawable(itemView.getContext(), video.thumbnail));
        title.setText(video.title);
        length.setText(video.time);
    }
}
