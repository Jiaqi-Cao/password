package com.example.assignment2;



import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void test1() {
        onView(withId(R.id.text)).perform(typeText("hello"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.view)).check(matches(withText("Not Strong")));
        onView(withId(R.id.text)).perform(clearText());
    }
    @Test
    public void test2() {
        onView(withId(R.id.text)).perform(typeText("adklfjsiefhsliefjsel"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.view)).check(matches(withText("Not Strong")));
        onView(withId(R.id.text)).perform(clearText());
    }
    @Test
    public void test3() {
        onView(withId(R.id.text)).perform(typeText("hello world"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.view)).check(matches(withText("Not Strong")));
        onView(withId(R.id.text)).perform(clearText());
    }
    @Test
    public void test4() {
        onView(withId(R.id.text)).perform(typeText("password"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.view)).check(matches(withText("Not Strong")));
        onView(withId(R.id.text)).perform(clearText());
    }
    @Test
    public void test5() {
        onView(withId(R.id.text)).perform(typeText(""));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.view)).check(matches(withText("Not Strong")));
        onView(withId(R.id.text)).perform(clearText());
    }
    @Test
    public void test6() {
        onView(withId(R.id.text)).perform(typeText("helloworld"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.view)).check(matches(withText("Strong")));
        onView(withId(R.id.text)).perform(clearText());
    }
}
