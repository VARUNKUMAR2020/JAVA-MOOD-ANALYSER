package com.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser {
    
    // CONSTRUCTOR WITHOUT PARAMETER
    public MoodAnalyser() {
        Scanner analyse = new Scanner(System.in);
        System.out.println("ENTER THE MOOD YOUR:  ");
        String checkmood = analyse.nextLine();
        if (checkmood.toLowerCase().contains("happy")) {
            System.out.println("HAPPY MOOD");
        } else {
            System.out.println("SAD MOOD");
        }

    }

    // CONSTRUCTOR WITH PARAMETER
    public MoodAnalyser(String checkmood) {
        if (checkmood.toLowerCase().contains("happy")) {
            System.out.println("HAPPY MOOD");
        } else {
            System.out.println("SAD MOOD");
        }
    }

    public static void main(String[] args) {
        System.out.println("Mood Analyser");
        System.out.println("EXCEPTION HANDLING");
        Scanner analyse = new Scanner(System.in);
        System.out.println("ENTER THE MOOD YOUR:  ");
        String Mood = analyse.nextLine();
        // CALLING CONSTRUCTOR WITH PARAMETER
		MoodAnalyser checkmood = new MoodAnalyser(Mood);
		// CALLING CONSTRUCTOR WITHOUT PARAMETER
		MoodAnalyser checkMood = new MoodAnalyser();
    }
}
