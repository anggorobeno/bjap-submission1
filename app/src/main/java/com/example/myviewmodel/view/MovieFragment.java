package com.example.myviewmodel.view;

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
import com.example.myviewmodel.adapter.MovieFragmentAdapter;
import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.viewModel.MovieViewModel;

import java.util.ArrayList;


public class MovieFragment extends Fragment {
    RecyclerView recyclerView;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity()!= null){
            MovieViewModel movieViewModel = new ViewModelProvider(this,new ViewModelProvider.NewInstanceFactory()).get(MovieViewModel.class);
            ArrayList<MovieEntity> movie = movieViewModel.getMovie();

            MovieFragmentAdapter movieFragmentAdapter = new MovieFragmentAdapter(getActivity());
            movieFragmentAdapter.setListMovie(movie);

            recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, GridLayoutManager.VERTICAL, false));
            recyclerView.setHasFixedSize(true);
            recyclerView.smoothScrollToPosition(0);
            recyclerView.setAdapter(movieFragmentAdapter);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rvMovie);
    }

}