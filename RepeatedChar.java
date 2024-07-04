package com.wipro.java.maps;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap; 


public class RepeatedChar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		HashMap<Character, Integer> finalHash = new HashMap<>();
		
		char choice;
		
		do {
			
			System.out.print("Please Enter a String: ");
			String strInp = sc.next(); 
			
			for(int i = 0; i < strInp.length(); i++) {
				
				char ch = strInp.charAt(i);
				finalHash.put(ch, finalHash.get(ch) + 1);
				
			}
			
			System.out.println("Characters and Its Count are: ");
			
			for(char key : finalHash.keySet()) {
				
				System.out.println(key+ " = " +finalHash.get(key));
			}
			
			finalHash.clear();
			
			System.out.println("Do you want to add another String? (y/n): ");
			choice = sc.next().charAt(0);
		}
		
		while(choice == 'Y' || choice == 'y');
			
			System.out.println("Thank You...");
			sc.close();
		
	}
	
}
