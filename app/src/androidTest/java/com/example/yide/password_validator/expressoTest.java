package com.example.yide.password_validator;

import android.support.test.espresso.ViewInteraction;

import android.support.test.rule.ActivityTestRule;

import android.support.test.runner.AndroidJUnit4;

import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;

import org.junit.Test;

import org.junit.runner.RunWith;



import static android.support.test.espresso.Espresso.onView;

import static android.support.test.espresso.action.ViewActions.click;

import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;

import static android.support.test.espresso.action.ViewActions.replaceText;

import static android.support.test.espresso.assertion.ViewAssertions.matches;

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;

import static android.support.test.espresso.matcher.ViewMatchers.withId;

import static android.support.test.espresso.matcher.ViewMatchers.withText;

import static org.hamcrest.Matchers.allOf;



@LargeTest

@RunWith(AndroidJUnit4.class)

public class expressoTest {



    @Rule

    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);



    @Test

    public void passwordStrengthValidatorUITest() {


        ViewInteraction appCompatEditText = onView(

                allOf(withId(R.id.infield), isDisplayed()));

        appCompatEditText.perform(replaceText("Gys2315123SS"), closeSoftKeyboard());



        ViewInteraction appCompatButton = onView(

                allOf(withId(R.id.butt), withText("Validate"), isDisplayed()));

        appCompatButton.perform(click());



        ViewInteraction textView = onView(

                allOf(withId(R.id.textfield), isDisplayed()));

        textView.check(matches(withText("Password is Strong!")));



    }




}
