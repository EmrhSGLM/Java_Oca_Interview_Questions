package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_010 {

	public static void main(String[] args) {
		
		/*
        Create  a list by getting the list elements from user
        if there is duplicated elements remove them from the list.
​
        Kullanıcıdan aldıgınız elemanlardan oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
        */
		
		Scanner scan = new Scanner (System.in);
		List<String> list=new ArrayList<>();
		int islem=0;
		
		while(!(islem == 2)) {
			
			System.out.println("eklemek istediginiz elmani giriniz : ");
			String eleman=scan.nextLine();
			list.add(eleman);
			System.out.println("Devam etmek icin 1'e , ciki icin 2'ye basiniz");
			islem=scan.nextInt();
			
		}
		System.out.println("\nListin ilk hali : "+list);
		
		for (int i = 0; i < list.size(); i++) {
			
			for (int j = i+1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					j--;
					
				}
			}
			
		}
		System.out.println("\nTekrarli elemanlar silindi : "+list);
		
		
	}

}
