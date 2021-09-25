package com.example.myviewmodel.viewModel;

import androidx.lifecycle.ViewModel;

import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.utils.DummyData;

import java.util.ArrayList;

public class DetailViewModel extends ViewModel {
    private String movieId;
    private String tvId;

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getTvId() {
        return tvId;
    }

    public void setTvId(String tvId) {
        this.tvId = tvId;
    }
    public MovieEntity getMovie(){
        MovieEntity movie = null;
        new DummyData();
        ArrayList<MovieEntity> movieEntities = DummyData.generateDummyMovie();
        for (MovieEntity movieEntity : movieEntities){
            if (movieEntity.getId().equals(movieId)){
                movie = movieEntity;
            }
        }
        return movie;
    }
    public TvEntity getTv(){
        TvEntity tv = null;
        new DummyData();
        ArrayList<TvEntity> tvEntities = DummyData.generateDummyTv();
        for (TvEntity tvEntity : tvEntities){
            if (tvEntity.getId().equals(tvId)){
                tv = tvEntity;
            }
        }
        return tv;
    }
}
