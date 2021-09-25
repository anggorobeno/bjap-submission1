package com.example.myviewmodel.viewModel;

import static org.junit.Assert.*;

import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.utils.DummyData;

import org.junit.Before;
import org.junit.Test;

public class DetailViewModelTest {
    private DetailViewModel detailViewModel;
    private MovieEntity dummyMovie = DummyData.generateDummyMovie().get(0);
    private TvEntity dummyTv = DummyData.generateDummyTv().get(0);
    private String movieId = dummyMovie.getId();
    private String tvId = dummyTv.getId();

    @Before
    public void setUp(){
        detailViewModel = new DetailViewModel();
        detailViewModel.setMovieId(movieId);
        detailViewModel.setTvId(movieId);
    }

    @Test
    public void getMovie() {
        detailViewModel.setMovieId(dummyMovie.getId());
        MovieEntity movieEntity = detailViewModel.getMovie();
        assertNotNull(movieEntity);
        assertEquals(dummyMovie.getId(),movieEntity.getId());
        assertEquals(dummyMovie.getTitle(),movieEntity.getTitle());
        assertEquals(dummyMovie.getMovieImage(),movieEntity.getMovieImage());
        assertEquals(dummyMovie.getDesc(),movieEntity.getDesc());
        assertEquals(dummyMovie.getMovieYear(),movieEntity.getMovieYear());

    }

    @Test
    public void getTv() {
        detailViewModel.setTvId(dummyTv.getId());
        TvEntity tvEntity = detailViewModel.getTv();
        assertNotNull(tvEntity);
        assertEquals(dummyTv.getId(),tvEntity.getId());
        assertEquals(dummyTv.getTitle(),tvEntity.getTitle());
        assertEquals(dummyTv.getDesc(),tvEntity.getDesc());
        assertEquals(dummyTv.getTvImage(),tvEntity.getTvImage());
        assertEquals(dummyTv.getTvYear(),tvEntity.getTvYear());
    }
}