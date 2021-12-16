package questions;

import java.util.Scanner;

public class Q_012 {

	public static void main(String[] args) {
		
		
		/*
		Crteate a program checks if a String is PALINDROME or not.
		If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
		For Example : "madam" or "nurses run" .


		Kuulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz
		polindrome :Palindrom, tersten okunuşu da aynı olan cümle
		ornek : Ey edip Adana`da pide ye,  Traş niçin şart
		 */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		
		palindrome(str);

	}

	private static void palindrome(String str) {
		
		StringBuilder sb = new StringBuilder(str);
		String str1 = sb.reverse().toString();
		if (str.equalsIgnoreCase(str1)) {
			System.out.println("Entered sentence is a palindrome");
		} else {
			System.out.println("Entered sentence is not a palindrome");
		}
		
			
	}

}
