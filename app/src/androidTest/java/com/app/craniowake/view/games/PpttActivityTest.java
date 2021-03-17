package com.app.craniowake.view.games;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner;

import com.app.craniowake.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4ClassRunner.class)
public class PpttActivityTest {
    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(PpttActivity.class);

    @Test
    public void onCreate() {
        onView(withId(R.id.ppt_act_id)).check(matches(isDisplayed()));
    }

    @Test
    public void checkIfUIKomponentsDisplayed() {
        onView(withId(R.id.ppttFalseButton))
                .check(matches(isDisplayed()));
        onView(withId(R.id.pptt_test_view))
                .check(matches(isDisplayed()));
        onView(withId(R.id.pptt_test_view))
                .check(matches(isDisplayed()));
        onView(withId(R.id.textView3))
                .check(matches(isDisplayed()));
        onView(withId(R.id.finish_pptt_game))
                .check(matches(isDisplayed()));
    }

}