package com.app.craniowake.view.patient;

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

/**
 * Testing display and elements of given Activity.
 */
@RunWith(AndroidJUnit4ClassRunner.class)
public class PatientListActivityTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(PatientListActivity.class);

    @Test
    public void onCreate() {
        onView(withId(R.id.user_patient_overview)).check(matches(isDisplayed()));
    }

    @Test
    public void checkIfUIKomponentsDisplayed() {
        onView(withId(R.id.listViewTitle))
                .check(matches(isDisplayed()));
        onView(withId(R.id.patient_items_recyclerView))
                .check(matches(isDisplayed()));
    }
}