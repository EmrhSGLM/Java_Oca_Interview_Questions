package questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q_006 {

	public static void main(String[] args) {
		
	 /*
	     Create method that finds repeated characters in a String
	     Bir String'de tekrarlanan karakterleri bulan method create ediniz
	 
	 */
		Scanner scan =new Scanner (System.in);
		System.out.println("Please enter a sentence");
		String str=scan.nextLine();
		str=str.replaceAll(" ", ""); // String Manupaltion kullandim girilen cumle deki bosluklari da
									//    tekrar eden karakter olarak algilamasin diye bosluklari kaldirdim
		List<String> list=new ArrayList <>();
		int sayac=0;
		for (int i = 0; i < str.length()-1; i++) {
			
			sayac=0;
			
			for (int j = i+1 ; j < str.length(); j++) {
				if (str.substring(i).charAt(0) == str.substring(j).charAt(0)) {// char olarak karakterleri kiyasladim ifadeler esit olsada
																	// referans ve degerler esit olmayacagindan reel sonuc alamazdim
					sayac++;
				}
				
			}
			if (sayac > 0 && !list.contains(str.substring(i,i+1))) {
				// sayac'in o dan buyuk ve bir deger sartimizda list icinde tekrar eden karakterin olup olmadigina bakmamiz gerekiyor
				// eger sayac 0'da buyuk ve list icinde karakter yoksa body icine girip list'e karakteri ekliyoruz
				list.add(str.substring(i,i+1));
				
			}
			
		}
		System.out.println("Tekrar eden karakterler : "+list);
		scan.close();

	}

}
