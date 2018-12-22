package com.yuvalasidon.movieapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder{
public final ImageView ivImage;
public final TextView tvTitle;
public final TextView tvOverview;

public ViewHolder(View view) {
        super(view);
        ivImage = view.findViewById(R.id.item_movie_iv);
        tvTitle = view.findViewById(R.id.item_movie_tv_title);
        tvOverview = view.findViewById(R.id.item_movie_tv_overview);
        }
public void onBindViewHolder(MovieModel movieModel) {
        ivImage.setImageResource(movieModel.getImageRes());
        tvTitle.setText(movieModel.getName());
        tvOverview.setText(movieModel.getOverview());
        }
}
