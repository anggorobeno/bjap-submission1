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
import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.utils.Constant;
import com.example.myviewmodel.view.MovieDetailActivity;
import com.google.android.material.card.MaterialCardView;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MovieFragmentAdapter extends RecyclerView.Adapter<MovieFragmentAdapter.ViewHolder>{
    Activity activity;


    public MovieFragmentAdapter(Activity activity) {
        this.activity = activity;
    }

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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieFragmentAdapter.ViewHolder holder, int position) {
        holder.bindData(listMovie.get(position));
        holder.cardView.setOnClickListener(v->{
            Intent intent = new Intent(activity, MovieDetailActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra(Constant.EXTRA_MOVIE,listMovie.get(position).getId());
            activity.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvTitle;
        //TextView tvDesc;
        ImageView imgPoster;
        TextView tvYear;
        MaterialCardView cardView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tvTitle);
            //tvDesc = itemView.findViewById(R.id.tvDesc);
            imgPoster = itemView.findViewById(R.id.imgPoster);
            cardView = itemView.findViewById(R.id.carView);
            tvYear = itemView.findViewById(R.id.tvYear);
        }

        public void bindData(MovieEntity movieEntity) {
            tvTitle.setText(movieEntity.getTitle());
          //  tvDesc.setText(movieEntity.getDesc());
            tvYear.setText(String.valueOf(movieEntity.getMovieYear()));
            Picasso.with(itemView.getContext())
                    .load(movieEntity.getMovieImage())
                    .fit()
                    .into(imgPoster);
        }
    }
}
