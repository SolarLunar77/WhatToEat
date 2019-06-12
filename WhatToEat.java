package project.info;
import java.util.Scanner;

public class WhatToEat {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//1.) Get user input for event type.
		System.out.println("Please state if your event type is casual, semi-formal, or formal:");
	        String eventType = scan.nextLine();
	        String mealSuggestion = null; 
		eventType = eventType.toLowerCase();		
	    
	    
		//2.) Get user input for party size.
		System.out.println("Please enter your party size:");
		int partySize = scan.nextInt();
		String prepSuggestion = null;
	
		
		if (partySize < 1) {
			System.out.println("Error: Looking for a number greater than 0.");
			
		}
		
		else {
			if(eventType.equals("casual")) {
				mealSuggestion = "sandwiches";
			}
			
			else if(eventType.equals("semi-formal")) {
				mealSuggestion = "fried chicken";
			}
			else if(eventType.equals("formal")) {
				mealSuggestion = "chicken parmesan";
			}
			
			if(partySize == 1) {
				prepSuggestion = "in the microwave";
			}
			else if(partySize >= 2 && partySize <= 12) {
				prepSuggestion = "in your kitchen";
			}
			else if(partySize >= 13) {
				prepSuggestion = "by a caterer";
			}
			
			String result = "Since you’re hosting a " + eventType + " event for " +  partySize + " participant(s)," + 
	                " you should serve " + mealSuggestion + " prepared " + prepSuggestion + ".";
			
			System.out.println(result);
			
			
		}
		scan.close();	
	}
	
}





