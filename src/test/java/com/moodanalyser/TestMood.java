package com.moodanalyser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class TestMood {
    MoodAnalyser newMood = new MoodAnalyser();

    @Test
    public void checkTheMood1() {
        String mood = newMood.analyseMood("I am sad");
        Assert.assertEquals("SAD",mood);
	}

	@Test
	public void checkTheMood2() {
		String mood = newMood.analyseMood("I am sad");
		Assert.assertEquals("HAPPY",mood);
    }
}
