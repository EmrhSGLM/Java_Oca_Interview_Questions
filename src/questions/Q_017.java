package questions;

import java.util.Scanner;

public class Q_017 {

	public static void main(String[] args) {
		
		/*
		  Ask user to enter the number of lines of a inverted half pyramid .
		  Type a program to create the inverted half pyramid.
		  For example if the number of lines is 5, the pyramid will be like;

		  * * * * *
		  * * * *
		  * * *
		  * *
		  *

		  Kullanıcının  girdigi satır sayısı kadar * ile ters yarım piramid sekli yazdıran bir program create ediniz.

		  */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();

		for (int i = num; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		scan.close();

	}

}
