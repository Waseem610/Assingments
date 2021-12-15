package com.te.challenge;

public class Challenge4 {
	public static boolean catPlaying(int temperature, boolean summer) {
		boolean result = true;
		if (summer == true) {
			if (temperature >= 25 && temperature <= 45) {
				result = true;
			} else
				result = false;
		} else if (temperature >= 25 && temperature <= 35) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean result = Challenge4.catPlaying(45, false);
		System.out.println(result);
	}

}
