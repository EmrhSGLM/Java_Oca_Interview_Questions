package questions;

import java.util.Scanner;

public class Q021 {

	public static void main(String[] args) {
		
		/*
        Ask user to enter the number of lines of a inverted  .
        Type a program to create the inverted  pyramid.
        For example; if the number of lines is 5, the pyramid will be like;

        * * * *  * * * *
          * * * * * *
            * * * *
              * *
               *

        Kullanıcının  girdigi satır sayısı kadar * ile  
        ters  piramid sekli yazdıran bir program create ediniz.

        */
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		
		for(int i=1 ; i <= 2*num-2; i+=2) {
			for(int k=2; k <= i; k++) {
				System.out.print(" ");
			}
			for(int j=i; j <= 2*num-2;j++) {
				System.out.print("* ");				
			}
			if(i==2*num-3) {
				System.out.println();
				for(int l=1;l <= i; l++) {
					System.out.print(" ");
				}
				System.out.print("*");
					
			}
			
			System.out.println();
		}
		scan.close();		

	}

}
