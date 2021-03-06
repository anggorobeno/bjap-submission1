package com.example.myviewmodel.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myviewmodel.R;
import com.example.myviewmodel.adapter.TvFragmentAdapter;
import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.viewModel.TvViewModel;

import java.util.ArrayList;


public class TvFragment extends Fragment {
    RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_tv, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rvTv);
        if (getActivity()!= null){
            TvViewModel tvViewModel = new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(TvViewModel.class);
            ArrayList<TvEntity> tv = tvViewModel.getTv();

            TvFragmentAdapter tvFragmentAdapter = new TvFragmentAdapter(getActivity());
            tvFragmentAdapter.setListTv(tv);

            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(tvFragmentAdapter);
        }
    }

}