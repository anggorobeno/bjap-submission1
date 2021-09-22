package com.example.myviewmodel.viewModel;

import com.example.myviewmodel.model.TvEntity;

public class TvViewModel extends Viewmodel {
    public List<TvEntity> getTv() {
        return DataDummy.generateDummyTv();
    }

}
