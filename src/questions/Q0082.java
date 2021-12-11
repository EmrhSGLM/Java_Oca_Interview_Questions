package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q0082 {

	public static void main(String[] args) {
		
		/*
		Ask user to enter  2 Srtrings.
		If the characters and the numbers of characters of the Strings are same then print "Anagram"
		otherwise, print "Not Anagram" on the console.
		Ignore cases
		For example : "Mary" and "army" and "RAMY" are Anagrams

		Kullanıcıdan 2 String girmesini isteyin. String'lerin buyuk-kucuk harf duyarliligi olmadan
		karakterleri ve karakter sayıları aynıysa "Anagram" yazdırın,  
		 aksi takdirde konsolda "Anagram Değil" yazdırın.
		Ornek : "Pide" ve"EDİP" anagram ifadelerdir..

		 */
		
		System.out.println("***** QA *****");
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value of two String");
		String str1=scan.next();
		String str2=scan.next();
		
		String arr1[]=str1.toLowerCase().split(""); 	Arrays.sort(arr1);
		String arr2[]=str2.toLowerCase().split(""); 	Arrays.sort(arr2);
		

		if (Arrays.equals(arr1, arr2)) {
			System.out.println("It is Anagram");	
		} else {
			System.out.println("It is not Anagram ");
		}
		scan.close();
	
	}

}
