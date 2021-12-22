package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_014A {

	public static void main(String[] args) {
		
		 /*
		If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
		type a program to create a new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 }

		Verilen bir arayın elemanlarının ardışık artan toplamını hesaplayıp 
		yeni bir array'a atayan bir program create ediniz..

		input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }

		output : { 3, 5+1, 2+7+9, 2+3+5+7 }

		   */
		List<Integer> list1=new ArrayList<>();
		
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Gireceginiz eleman sayisini giriniz");
		int elemanSayisi=scan.nextInt();		
		ardisikBoyOlcum(elemanSayisi);
		for (int i = 1; i < elemanSayisi+1; i++) {
			System.out.print(i+". elemani giriniz : ");
			int eleman=scan.nextInt();
			list1.add(eleman);
		}
		ardisikToplam(list1);

	}
	
private static void ardisikToplam(List<Integer> list1) {
	List<Integer> list2=new ArrayList<>();
	
	int sayac=0;
	int indexBul=1;
	
	do {
		int toplam=0;
		for (int i = 0 ; i <= sayac; i++) {
			toplam += list1.get(indexBul-1+i);
		}
		sayac++;
		indexBul += sayac;
		list2.add(toplam);	
	} while (sayac < list1.size()/2-1);
	
	System.out.println(list2);
		
	}

private static void ardisikBoyOlcum(int elemanSayisi) {
		
		for (int n = 0; n < elemanSayisi; n++) {
			if(n*(n+1)/2 == elemanSayisi) {
				break;
			}
			if (n == elemanSayisi-1) {
				System.out.println("Eleman sayisi yanlis girildi");
			}
		}
		
	}

}
