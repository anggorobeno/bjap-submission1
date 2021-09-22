package com.example.myviewmodel.viewModel;

import androidx.lifecycle.ViewModel;

import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.utils.DummyData;

import java.util.List;

public class MovieViewModel extends ViewModel {
    public List<MovieEntity> getMovie() {
        return DummyData.generateDummyMovie();
    }
}

