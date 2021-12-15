package questions;

import java.util.Scanner;

public class Q_001 {

	public static void main(String[] args) {
		/*
		Girilen bir String'i tersten yazdiran bir pr create ediniz
		 */
		
		tersCevirme();
		
		

	}

	private static void tersCevirme() {
		Scanner scan=new Scanner (System.in);
		System.out.println("Please enter a str");
		String str=scan.nextLine();
		
		for (int i = str.length()-1; i >= 0 ; i--) {
			System.out.print(str.substring(i,i+1));			
		}
		scan.close();
		
	}

}
