package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q005 {

	public static void main(String[] args) {

		/*
		 * Mauntain Array--> [0, 2, 5, 3, 1] It is constantly increasing to the maximum
		 * value, decreasing constantly after the maximum value Not Mauntain Array-->
		 * [5, 2, 7, 1, 4]
		 * 
		 * Bir array elemanlari en buyuk degerine kadar surekli artan, en buyuk
		 * degerinden sonra surekli azalan deger aliyorsa Mauntain Array'dir
		 */

		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		System.out.println("Gireceginiz sayi adetini giriniz ");
		int adet = scan.nextInt();

		for (int i = 1; i <= adet; i++) {
			System.out.print("sayi " + i + "'i giriniz :");
			int sayi = scan.nextInt();
			list.add(sayi);
		}
		
		int sayac = 0;
		int max = 0;
		int index = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > max) {
				max = list.get(i);
				index = i;
			}
		}

		for (int i = 0; i < index - 1; i++) {
			if (list.get(i) < list.get(i + 1)) {
				continue;
			} else {
				sayac++;
				break;
			}

		}

		for (int i = index; i < list.size() - 2; i++) {
			if (list.get(i) > list.get(i + 1)) {
				continue;
			} else {
				sayac++;
				break;
			}

		}

		if (sayac == 0) {
			System.out.println(list+" Mauntain Array dir");
		} else {
			System.out.println(list+" Mauntain Array degildir");

		}

		scan.close();
	}
	

}
