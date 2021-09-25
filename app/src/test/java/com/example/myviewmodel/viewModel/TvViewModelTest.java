package com.example.myviewmodel.viewModel;

import static org.junit.Assert.*;

import com.example.myviewmodel.model.TvEntity;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TvViewModelTest {
    private TvViewModel tvViewModel;

    @Before
    public void setUp(){
        tvViewModel = new TvViewModel();
    }

    @Test
    public void getTv() {
        List<TvEntity> tvEntities = tvViewModel.getTv();
        assertNotNull(tvEntities);
        assertEquals(10,tvEntities.size());
    }
}