package com.example.myviewmodel.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myviewmodel.R;
import com.example.myviewmodel.model.MovieEntity;

import java.util.ArrayList;

public class MovieFragmentAdapter extends RecyclerView.Adapter<MovieFragmentAdapter.ViewHolder>{

    public ArrayList<MovieEntity> getListMovie() {
        return listMovie;
    }

    public void setListMovie(ArrayList<MovieEntity> listMovie) {
        this.listMovie = listMovie;
    }

    private ArrayList<MovieEntity> listMovie;
    @NonNull
    @Override
    public MovieFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieFragmentAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
