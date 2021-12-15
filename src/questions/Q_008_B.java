package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q_008_B {

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
		System.out.println("***** Array ile Cozum *****");
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter value of two String");
		String str1=scan.next();
		String str2=scan.next();
		
		String arr1[]=str1.toLowerCase().split("");// str lerdeki tum karakterleri kucuk yapip hiclikten ayirarak array'e assign ederiz
		String arr2[]=str2.toLowerCase().split("");
		
		Arrays.sort(arr1);// array'leri siralayarak tum karakterleri dongu ile tek tek karsilastiririz
		Arrays.sort(arr2);
		
		
		int sayac=0;
		for (int i = 0; i < arr1.length; i++) {
			
			if (arr1.length != arr2.length) {// Bu if'de girilen str'lerin eleman sayisi esit degilse 
											//  Anagram degil diyecek ve donguden cikacak
				System.out.println("It is not Anagram");
				break;
			}
			if (arr1[i].equals(arr2[i])) {// Burada array elemanlarinin tek tek kontrol edecek esit ise sayac'i increment yapacak
										  // en son eleman kontrol edildiginde sayac imiz i degeri ile esit olacak 
				sayac++;
			}else { // Burada eger elemanlardan biri bile esit olmazsa else body'sine girecek ifadeyi 
				    // yazdiracak ve break ile donguyu kirip cikacak
				System.out.println("It is not Anagram");
				break;
			}
			if (sayac == arr1.length-1) {// Tum elemanlar esit ise sayac'imiz da i'nin donguden cıkmmadan onceki degeri ile esit olacak
										 // bu if sartini sagladigi icin body icine girip ifadeyi yazdiracak buraya break de diyebiliriz,
										//  yazmayada biliriz cunku dongu yukari ciktiginda i degeri array'in uzunluguna esit olacak ve dongu kirilip 
										// tamamlanacak
				System.out.println("It is Anagram");
			}
			
		}
		scan.close();
	
	}

}
