package com.te.challenge;

import java.util.Scanner;

public class MinAndSec {
	public static String getDurationString(int min, int sec) {
		String result = "";
		if ((min <= 0) || (sec < 0) || (sec > 59)) {

			result = "Invalid value";
		} else if (min < 60) {

			System.out.println(0 + "h " + min + "m" + " " + sec + "s");
			result = "";
		} else {
			int hour = min / 60;
			int minute = min % 60;
			System.out.println(hour + "h " + minute + "m " + sec + "s ");
			result = "";
		}
		{
		}
		return result;
	}

	public static String getDurationString(int sec) {
		String result = "";
		if (sec > 0 && sec < 60) {
			System.out.println(sec + "s");
			result = "";
		} else
			result = "Invalid value";
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the minutes");
		int minute = scanner.nextInt();
		System.out.println("Enter the seconds");
		int seconds = scanner.nextInt();

		MinAndSec minAndSec = new MinAndSec();
		System.out.println(minAndSec.getDurationString(minute, seconds));
		System.out.println(minAndSec.getDurationString(seconds));
	}

}
