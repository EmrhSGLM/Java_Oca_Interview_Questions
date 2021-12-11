package questions;

import java.util.ArrayList;
import java.util.List;

public class C0041 {

	public static void main(String[] args) {

		/*
		 * From a given array find all pairs whose sum is a given number Verilen bir
		 * arraydeki, toplamı belirli bir sayı olan tüm çiftleri bulun
		 * 
		 * For example;
		 * 
		 * input : {4, 6, 5, -10, 8, 5, 20} ==> 10 
		 * Output : 4 + 6 = 10, 5 + 5 = 10, -10+ 20 = 10
		 * 
		 */

		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };
		int istenenDeger=10;
		List<String> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length-1; i++) {
			
			for (int j = 1; j < arr.length; j++) {
				if (arr[i]+arr[j] == istenenDeger && !list.contains(arr[i]+"+"+arr[j]+"="+istenenDeger)) {
					list.add(arr[i]+"+"+arr[j]+"="+istenenDeger);
				}
				
			}			
		}
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (!(list.size()-1 == i)) {
				System.out.print(", ");
			}
			
		}
		
		
	}

}
