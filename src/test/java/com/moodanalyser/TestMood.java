package com.moodanalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestMood {

    @Test
    public void checkTheMood1() {
        MoodAnalyser newMood = new MoodAnalyser();
		String actualResult = MoodAnalyser.checkmood("I am in sad Mood");
		Assert.assertEquals("SAD",actualResult);
    }
}
