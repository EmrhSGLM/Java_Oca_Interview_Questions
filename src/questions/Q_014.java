package questions;

import java.util.ArrayList;
import java.util.List;

public class Q_014 {

	public static void main(String[] args) {
		
		 /*
		If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
		type a program to create a new array whose elements are like { 3, 5+1, 2+7+9, 2+3+5+7 }

		Verilen bir arayın elemanlarının ardışık artan toplamını hesaplayıp 
		yeni bir array'a atayan bir program create ediniz..

		input : { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }

		output : { 3, 5+1, 2+7+9, 2+3+5+7 }

		   */
		
		  
		        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7,};
		        //3, 5+1, 2+7+9, 2+3+5+7
		        ardisikToplam(arr);
		        
	}   
	
	private static void ardisikToplam(int[] arr) {
		List<Integer> list=new ArrayList<>();
		
		int sayac=0;
		int indexBul=1;
		
		do {
			int toplam=0;
			for (int i = 0 ; i <= sayac; i++) {
				toplam += arr[indexBul-1+i];
			}
			sayac++;
			indexBul += sayac;
			list.add(toplam);	
		} while (sayac < arr.length/2-1);
		
		System.out.println(list);
		
}
}
