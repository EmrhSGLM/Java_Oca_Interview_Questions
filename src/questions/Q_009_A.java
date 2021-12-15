package questions;

import java.util.Scanner;

public class Q_009_A {

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
		if (num > 1) {
			for (int i = 0; i < num; i++) {

				if (i == num - 2) {
					System.out.println(num + " ==> " + "is a prime number");
					break;
				}

				if (num % (i + 2) == 0) {
					System.out.println(num + " ==> " + "is not a prime number");
					break;
				}

			}
		} else if (num == 1) {
			System.out.println(num + " ==> " + "is not a prime number");
		} else
			System.out.println("entered a negative number");
		scan.close();

	}
}