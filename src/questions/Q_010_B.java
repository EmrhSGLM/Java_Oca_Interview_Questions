package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_010_B {

	public static void main(String[] args) {
		
		/*
        Create  a list by getting the list elements from user
        if there is duplicated elements remove them from the list.
​
        Kullanıcıdan aldıgınız elemanlardan oluşan bir listede tekrarlanan elemanları silen bir program create ediniz.
        */
		
		System.out.println("***** H.Fidan Bey'in Cozumu *****\n");
		Scanner scan = new Scanner(System.in);
        System.out.println("Tekrarsiz liste olusturmak icin eleman girin:");
        List<String> list = new ArrayList<>();
        String ekle="";
        
            
        while (!ekle.equalsIgnoreCase("Q")) {
        
        System.out.println("Bitirmek icin Q'ya basiniz");
        ekle=scan.next();
        
        if (!list.contains(ekle)&&!ekle.equalsIgnoreCase("Q")) {
            list.add(ekle);
        }
        
         }
        
        System.out.println(list);
        scan.close();

	}

}
