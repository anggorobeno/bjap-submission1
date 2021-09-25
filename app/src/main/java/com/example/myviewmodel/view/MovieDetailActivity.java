package com.example.myviewmodel.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myviewmodel.R;
import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.utils.Constant;
import com.example.myviewmodel.viewModel.DetailViewModel;
import com.squareup.picasso.Picasso;

public class MovieDetailActivity extends AppCompatActivity {
    TextView tvDesc;
    ImageView imgPoster;
    TextView tvTitle;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvDesc = findViewById(R.id.detailDesc);
        imgPoster = findViewById(R.id.detailPoster);
        tvTitle = findViewById(R.id.tvTitle);

        DetailViewModel detailViewModel = new ViewModelProvider(this, new ViewModelProvider.NewInstanceFactory()).get(DetailViewModel.class);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String movieId = extras.getString(Constant.EXTRA_MOVIE);
            if (movieId != null) {
                detailViewModel.setMovieId(movieId);
            }
            if (detailViewModel.getMovie() != null){
                populateView(detailViewModel.getMovie());
            }
        }

}

    private void populateView(MovieEntity movie) {
        tvDesc.setText(movie.getDesc());
        tvTitle.setText(movie.getTitle());
        Picasso.with(context)
                .load(movie.getMovieImage())
                .fit()
                .into(imgPoster);
    }
}