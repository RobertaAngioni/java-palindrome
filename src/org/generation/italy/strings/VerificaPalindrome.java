package org.generation.italy.strings;

import java.util.Scanner;

public class VerificaPalindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserici una parola: ");
		String palindromeWord = scan.nextLine();
		String reversePalindrome = "";
		
		
		for(int i = palindromeWord.length()-1; i >= 0; i--) {
			
			reversePalindrome += palindromeWord.charAt(i);
			
			
			
		}
		if(palindromeWord.equals(reversePalindrome)) {
			System.out.println("This word is a palindrome");
		}else {
			System.out.println("This word is not a palindrome");
		}
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		
		

	}

}
