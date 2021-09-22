package com.example.myviewmodel.viewModel;

import com.example.myviewmodel.model.MovieEntity;

public class MovieViewModel extends Viewmodel{
    public List<MovieEntity> getMovie() {
        return DataDummy.generateDummyMovie();
    }
}

