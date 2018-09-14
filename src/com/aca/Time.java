package com.aca;

public class Time {

	public static void main(String[] args) {
		
		int hour = 18;
		int minute = 5;
		int second = 2;
		
		// number of seconds since midnight
		
		//convert hours to seconds
		int totalSecondsHour = hour * 60 * 60;
		
		//convert minutes to seconds
		int totalSecondsMinutes = minute * 60;
		
		//convert seconds to minutes
		
		int total = totalSecondsHour + totalSecondsMinutes + second;
		System.out.println("totals seconds since midnight: " + total);

	}

}
