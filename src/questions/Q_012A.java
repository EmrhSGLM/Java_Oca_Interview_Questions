package questions;

import java.util.Scanner;

public class Q_012A {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Cumle gir");
		String str = scan.nextLine();
		System.out.println(str.substring(1));
		System.out.println(cevir(str));
		System.out.println(str.equalsIgnoreCase(cevir(str)) ? "palindrome" : "palindrome degil");
		scan.close();
		
	}
	private static String cevir(String str) {
		if (str.isEmpty()) {			
			return str;}
		return cevir(str.substring(1)) + str.charAt(0);
	}
	

}
