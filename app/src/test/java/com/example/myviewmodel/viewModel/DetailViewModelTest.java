package com.example.myviewmodel.viewModel;

import static org.junit.Assert.*;

import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.utils.DummyData;

import org.junit.Before;
import org.junit.Test;

public class DetailViewModelTest {
    private DetailViewModel detailViewModel;
    private final MovieEntity dummyMovie = DummyData.generateDummyMovie().get(0);
    private final TvEntity dummyTv = DummyData.generateDummyTv().get(0);
    private final String movieId = dummyMovie.getId();
    private final String tvId = dummyTv.getId();

    @Before
    public void setUp(){
        detailViewModel = new DetailViewModel();
        detailViewModel.setMovieId(movieId);
        detailViewModel.setTvId(tvId);
    }

    @Test
    public void getMovie() {
        detailViewModel.setMovieId(movieId);
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
        detailViewModel.setTvId(tvId);
        TvEntity tvEntity = detailViewModel.getTv();
        assertNotNull(tvEntity);
        assertEquals(dummyTv.getId(),tvEntity.getId());
        assertEquals(dummyTv.getTitle(),tvEntity.getTitle());
        assertEquals(dummyTv.getDesc(),tvEntity.getDesc());
        assertEquals(dummyTv.getTvImage(),tvEntity.getTvImage());
        assertEquals(dummyTv.getTvYear(),tvEntity.getTvYear());
    }
}