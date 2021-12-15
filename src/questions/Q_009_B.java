package questions;

import java.util.Scanner;

public class Q_009_B {

	public static void main(String[] args) {
		/*
		 * Ask user enter a positive number and check if it is prime or not
		 * 
		 * Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
		 * kontrol edin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter value of a number");
		int num = scan.nextInt();
		if (num > 2) {
			for (int i = 2; i < num; i++) {

				if (num % i == 0) {
					System.out.println(num + " ==> " + "Number is not a prime number");
					break;
				}
				if (i == num - 1) {
					System.out.println(num + " ==> " + "Number is a prime number");
					break;
				}
			}

		} else if (num == 2) {
			System.out.println(num + " ==> " + "Number is a prime number");
		} else if (num == 1) {
			System.out.println(num + " ==> " + "Number is not a prime number");
		} else System.out.println(num + " ==> " + "You entered a negative number");

		scan.close();
	}

}
