package com.example.myviewmodel.viewModel;

import static org.junit.Assert.*;

import com.example.myviewmodel.model.MovieEntity;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class MovieViewModelTest {
    private MovieViewModel movieViewModel;
    @Before
    public void setUp(){
        movieViewModel = new MovieViewModel();
    }

    @Test
    public void getMovie() {
        List<MovieEntity> movieEntities = movieViewModel.getMovie();
        assertNotNull(movieEntities);
        assertEquals(10,movieEntities.size());
   }
}

