package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q007 {
	static List<Integer> list=new ArrayList<>();

	public static void main(String[] args) {

		/*
		 * Fibonacci dizisi create ediniz.
		*/
		
		fibonacci();
		
	}
	public static void fibonacci() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Yazdirmak istediginiz sinir sayisini giriniz : ");
		int sayi=scan.nextInt();
		list.add(1);
		list.add(1);
		int toplam=0;
		for (int i = 0 ; i < sayi; i++) {
			toplam = list.get(list.size()-2)+list.get(list.size()-1);
			list.add(toplam);
			i=toplam;			
		}
		System.out.println(list);
		scan.close();
	}

}
