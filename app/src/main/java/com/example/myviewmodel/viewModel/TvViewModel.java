package com.example.myviewmodel.viewModel;

import androidx.lifecycle.ViewModel;

import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.utils.DummyData;

import java.util.List;

public class TvViewModel extends ViewModel {
    public List<TvEntity> getTv() {
        return DummyData.generateDummyTv();
    }

}
