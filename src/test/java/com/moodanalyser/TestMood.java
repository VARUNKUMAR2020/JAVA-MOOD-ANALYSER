package com.moodanalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestMood {

    @Test
    public void checkTheMood1() {
        MoodAnalyser newMood = new MoodAnalyser();
        String actualResult = "I am in HAPPY Mood";
        Assert.assertEquals("SAD", actualResult);
    }
}
