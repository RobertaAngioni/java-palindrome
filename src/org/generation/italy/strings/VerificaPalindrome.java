package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Inserici una parola: ");
		String palindromeWord = scan.nextLine();
		String reversePalindrome = "";
		int count = 0;
		
		for(int i = palindromeWord.length()-1; i >= 0; i--) {
			
			reversePalindrome += palindromeWord.charAt(i);
			
			
			
		}
		if(palindromeWord.equals(reversePalindrome)) {
			System.out.println("This word is a palindrome and it counts " + palindromeWord.length() + " letters");
		}else {
			System.out.println("This word is not a palindrome and it counts " + palindromeWord.length() + " letters");
		}
		
		
		
		
//	    for(int j = 0; j < palindromeWord.length(); j++) {
//	    	if(palindromeWord.charAt(j) != " ")
//	    }
//		
//		
		
		
		
		
		scan.close();
		
		
		
		

	}

}
