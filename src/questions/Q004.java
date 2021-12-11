package questions;
import java.util.ArrayList;
import java.util.List;

public class Q004 {

	public static void main(String[] args) {

		/*
		 * From a given array find all pairs whose sum is a given number 
		 * Verilen bir arraydeki, toplamı belirli bir sayı olan tüm çiftleri bulun
		 * 
		 *  For example;
		 * 
		 * input : {4, 6, 5, -10, 8, 5, 20} ==> 10 
		 * Output : 4 + 6 = 10, 5 + 5 = 10, -10+ 20 = 10
		 * 
		 */
		
		int arr[] = {4, 6, 5, -10, 8, 5, 20};
		List<Integer> list = new ArrayList<>();
		List<Integer> list2=new ArrayList<>();
		List <String> list3=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = i+1 ; j < arr.length; j++) {
				int toplam=0;
				toplam += arr[i]+arr[j];
				list.add(toplam);
			}
			
		}
		
		
		int sayac=0;
		int sayac1=0;
		for (int i = 0; i < list.size()-1; i++) {
			sayac=0;
			for (int j = i+1; j < list.size()-1; j++) {
				if (list.get(i).equals(list.get(j))) {
					sayac++;					
				}				
			}
		
			if (sayac > sayac1 && !list2.equals(list.get(i))) {
				sayac1=sayac;
				list.clear();
				list2.add(list.get(i));					
			}
			
			
		}
		
		
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				int toplam=0;
				toplam = (arr[i]+arr[j]);
				
				if (list2.get(0).equals(toplam)) {
					list3.add(arr[i]+" + "+arr[j]+" = "+list2.get(0));
					
				}
			}
		}
		
		
		
		for (int i = 0; i < list3.size()-1; i++) {
			
			System.out.print(list3.get(i) + ", ");
						
		}
		System.out.println(list3.get(list3.size()-1));

	}

}
