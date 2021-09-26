package com.example.myviewmodel.view;

import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.myviewmodel.R;
import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.utils.Constant;
import com.example.myviewmodel.viewModel.DetailViewModel;
import com.squareup.picasso.Picasso;

public class TvDetailActivity extends AppCompatActivity {
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
            String tvId = extras.getString(Constant.EXTRA_TV);
            if (tvId != null) {
                detailViewModel.setTvId(tvId);
            }
            if (detailViewModel.getTv() != null){
                populateView(detailViewModel.getTv());
            }
        }

    }

    private void populateView(TvEntity tv) {
        tvDesc.setText(tv.getDesc());
        tvTitle.setText(tv.getTitle());
        Picasso.with(context)
                .load(tv.getTvImage())
                .fit()
                .into(imgPoster);
    }
}
