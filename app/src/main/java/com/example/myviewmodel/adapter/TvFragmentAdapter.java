package com.example.myviewmodel.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myviewmodel.R;
import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.utils.Constant;
import com.example.myviewmodel.view.TvDetailActivity;
import com.google.android.material.card.MaterialCardView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class TvFragmentAdapter extends RecyclerView.Adapter<TvFragmentAdapter.ViewHolder> {
    public TvFragmentAdapter(Activity activity) {
        this.activity = activity;
    }

    Activity activity;


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
            Intent intent = new Intent(activity, TvDetailActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(Constant.EXTRA_TV,listTv.get(position).getId());
            activity.startActivity(intent);


        });

    }

    @Override
    public int getItemCount() {
        return listTv.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        MaterialCardView cardView;
        TextView tvYear;
        ImageView imgPoster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            cardView = itemView.findViewById(R.id.carView);
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
