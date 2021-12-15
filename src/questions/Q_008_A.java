package questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q_008_A {

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
		System.out.println("***** List ile Cozum *****");
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value of two String");
		String str1=scan.next();
		String str2=scan.next();
		List<String> list1=new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		for (int i = 0; i < str1.length(); i++) {			
				list1.add(str1.toLowerCase().substring(i, i+1));			
		}
		
		for (int i = 0; i < str2.length(); i++) {			
				list2.add(str2.toLowerCase().substring(i, i+1));			
		}
		
		Collections.sort(list1);
		Collections.sort(list2);	
		
		
		if (list1.equals(list2) ) {
			System.out.println("It is Anagram");
		} else {
			System.out.println("It is not Anagram");
		}
		scan.close();		

	}

}
