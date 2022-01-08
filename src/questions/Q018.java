package questions;

import java.util.Scanner;

public class Q018 {

	public static void main(String[] args) {

		/*
		 Ask user to enter the number of lines of a  pyramid .
		 Type a program to create the pyramid.
		 For example if the number of lines is 5, the pyramid will be like;
		             *
		            * *
		           * * *
		          * * * *
		         * * * * *


		 Kullanıcının  girdigi satır sayısı kadar * ile piramid sekli yazdıran bir program create ediniz.

		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		int count = 0;
		for (int i = 1; i < num; i++) {
			if (count == 0) {
				for (int j = num; j >= 1; j--) {
					System.out.print(" ");
				}
				System.out.print(" *");
				System.out.println();
				count++;
			}
			for (int j = num + 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}
}