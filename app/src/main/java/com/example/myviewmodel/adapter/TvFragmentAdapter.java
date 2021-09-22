package com.example.myviewmodel.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myviewmodel.model.TvEntity;

import java.util.ArrayList;

public class TvFragmentAdapter extends RecyclerView.Adapter<TvFragmentAdapter.ViewHolder> {
    public ArrayList<TvEntity> getListTv() {
        return listTv;
    }

    public void setListTv(ArrayList<TvEntity> listTv) {
        this.listTv = listTv;
    }

    private ArrayList<TvEntity> listTv;
    @NonNull
    @Override
    public TvFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull TvFragmentAdapter.ViewHolder holder, int position) {

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
