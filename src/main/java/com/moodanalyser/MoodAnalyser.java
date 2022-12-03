package com.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser {
    
    // CONSTRUCTOR WITHOUT PARAMETER
    public MoodAnalyser() {
        checkmood("i am in sad mood");
    }

    // CONSTRUCTOR WITH PARAMETER
    public static String checkmood(String mood) {
		if (mood.toLowerCase().contains("happy")) {
            System.out.println("HAPPY MOOD");
            return "HAPPY";
        } else {
            System.out.println("SAD MOOD");
        }
        return "SAD";
    }

    public static void main(String[] args) {
        System.out.println("Mood Analyser");
        System.out.println("EXCEPTION HANDLING");
		// CALLING CONSTRUCTOR WITHOUT PARAMETER
		MoodAnalyser checkMood = new MoodAnalyser();
    }
}
