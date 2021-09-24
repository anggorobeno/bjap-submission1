package com.example.myviewmodel.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myviewmodel.R;
import com.example.myviewmodel.model.TvEntity;
import com.google.android.material.card.MaterialCardView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TvFragmentAdapter extends RecyclerView.Adapter<TvFragmentAdapter.ViewHolder> {
    public TvFragmentAdapter(Activity activity) {
        this.activity = activity;
    }

    Activity activity;

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TvFragmentAdapter.ViewHolder holder, int position) {
        holder.bindData(listTv.get(position));
        holder.cardView.setOnClickListener(v->{
            Toast.makeText(activity.getApplicationContext(), "", Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return listTv.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        MaterialCardView cardView;
        //TextView tvDesc;
        TextView tvYear;
        ImageView imgPoster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            cardView = itemView.findViewById(R.id.carView);
           // tvDesc = itemView.findViewById(R.id.tvDesc);
            tvYear = itemView.findViewById(R.id.tvYear);
            imgPoster = itemView.findViewById(R.id.imgPoster);
        }

        public void bindData(TvEntity tvEntity) {
            tvTitle.setText(tvEntity.getTitle());
            tvYear.setText(String.valueOf(tvEntity.getTvYear()));
            Picasso.with(itemView.getContext())
                    .load(tvEntity.getTvImage())
                    .fit()
                    .into(imgPoster);

        }
    }
}
