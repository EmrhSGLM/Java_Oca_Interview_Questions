package questions;

import java.util.Scanner;

public class Q_016A {

	public static void main(String[] args) {
		
		/*
		  
				         1
		                1 1 
		              1 2 2 1 
		            1 2 3 3 2 1 
		          1 2 3 4 4 3 2 1 
		        1 2 3 4 5 5 4 3 2 1 
		      1 2 3 4 5 6 6 5 4 3 2 1 
		    1 2 3 4 5 6 7 7 6 5 4 3 2 1 
		  1 2 3 4 5 6 7 8 8 7 6 5 4 3 2 1 
		1 2 3 4 5 6 7 8 9 9 8 7 6 5 4 3 2 1 



*/
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a numeral(rakam)");
		int num=scan.nextInt();
		
		
		for (int i = 1; i <=num ; i++) {
			
			if (i==1) {
				for (int j = 1; j < 2*num; j++) {
					System.out.print(" ");
				}
				System.out.print("1");
				System.out.println("");
			}
			for (int j = i; j <num; j++) {
				System.out.print("  ");
			}
			for (int j = 1 ; j <=i; j++) {
				System.out.print(j+" ");
			}
			for (int j = i; j >=1 ; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		scan.close();
		
		
	}

}
