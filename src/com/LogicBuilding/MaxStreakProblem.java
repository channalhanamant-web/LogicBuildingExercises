package com.LogicBuilding;

import java.util.Arrays;
import java.util.List;

public class MaxStreakProblem {

	public static void main(String[] args) {
		List<String> weekLogs = Arrays.asList("YYY", "YNY", "YYY", "YYY", "YYY");
		calculateStreak(weekLogs);

	}

	private static void calculateStreak(List<String> weekLogs) {
		int currentStreak = 0;
		int maxStreak = 0;

		for (String data : weekLogs) {
			if (!data.contains("N")) {
				currentStreak++;
				maxStreak = Math.max(currentStreak, maxStreak);
			} else {
				currentStreak = 0;

			}
		}
		System.out.println(" Max streak is " + maxStreak);
	}

}
