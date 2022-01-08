package questions;

import java.util.Scanner;

public class Q_024 {

	public static void main(String[] args) {
		
		 /*
        1
        2 3 2
        3 4 5 4 3
        4 5 6 7 6 5 4

		Kullanıcının  girdigi satır sayısı kadar yukarıdaki yarım 
		piramid sekli yazdıran bir program create ediniz.
         */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		int control1=0;
		int control2=0;
		
		for(int i=1; i <= num;i++) {
			
			for(int j=1;j <=i;j++) {
				System.out.print(j+control1+" ");
				control2=j+control1;
			}
			
			for(int k=control2; k > i;k--) {
				System.out.print(k-1+" ");				
			}
			System.out.println();
			control1=i;	
			
		}
		scan.close();

	}

}
