package com.example.myviewmodel.view;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.rule.ActivityTestRule;

import com.example.myviewmodel.R;
import com.example.myviewmodel.model.MovieEntity;
import com.example.myviewmodel.model.TvEntity;
import com.example.myviewmodel.utils.DummyData;

import org.junit.Rule;
import org.junit.Test;

import java.util.ArrayList;

public class MainActivityTest {
    private final ArrayList<MovieEntity> dummyMovie = DummyData.generateDummyMovie();
    private final ArrayList<TvEntity> dummyTv = DummyData.generateDummyTv();

    @Rule
    public ActivityTestRule activityTestRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void loadMovie(){
        onView(withId(R.id.rvMovie)).check(matches(isDisplayed()));
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.scrollToPosition(dummyMovie.size()));
    }
    @Test
    public void loadDetailMovie(){
        onView(withId(R.id.rvMovie)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()));
        onView(withId(R.id.tvTitle)).check(matches(withText(dummyMovie.get(0).getTitle())));
        onView(withId(R.id.detailDesc)).check(matches(isDisplayed()));
        onView(withId(R.id.detailDesc)).check(matches(withText(dummyMovie.get(0).getDesc())));
        onView(withId(R.id.detailPoster)).check(matches(isDisplayed()));
    }

    @Test
    public void loadTv(){
        onView(withText("TV Show")).perform(click());
        onView(withId(R.id.rvTv)).check(matches(isDisplayed()));
        onView(withId(R.id.rvTv)).perform(RecyclerViewActions.scrollToPosition(dummyTv.size()));
    }

    @Test
    public void loadDetailTv(){
        onView(withText("TV Show")).perform(click());
        onView(withId(R.id.rvTv)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.tvTitle)).check(matches(isDisplayed()));
        onView(withId(R.id.tvTitle)).check(matches(withText(dummyTv.get(0).getTitle())));
        onView(withId(R.id.detailDesc)).check(matches(isDisplayed()));
        onView(withId(R.id.detailDesc)).check(matches(withText(dummyTv.get(0).getDesc())));
        onView(withId(R.id.detailPoster)).check(matches(isDisplayed()));
    }

}