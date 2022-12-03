package com.moodanalyser;

import java.util.Scanner;

public class MoodAnalyser {
    

    public static void main(String[] args) {
        System.out.println("Mood Analyser");
        String myMood = null;
		try {
			if (myMood.toLowerCase().contains("happy"))
				System.out.println("HAPPY MOOD");
			else
				System.out.println("SAD MOOD");
		} catch (NullPointerException e) {
			System.out.println("YOU HAVE NOT ENTERED THE DATA! ENTER THE VALID DATA");
		}
    
    }
}
