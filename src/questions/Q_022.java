package questions;

import java.util.Scanner;

public class Q_022 {

	public static void main(String[] args) {
		
		/*
        Print prime numbers which are less than or equal to the given number.

        Verilen sayıdan küçük veya ona eşit olan asal sayıları yazdırınız.
         */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int count=0;
		for(int i=num;i > 1;i--) {
			count=0;
			for (int j = 2; j < i; j++) {				
				if(i % j == 0 && i != j) {
					count++;
				}
			}
			if(count == 0) {
				System.out.print(i +" ");
			}
		}
		scan.close();
	}

}
