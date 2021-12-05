package questions;
import java.util.Scanner;

public class Faktoriyel {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();

		System.out.print(sayi + "! = ");
		int f = 1;

		for (int i = 1; i <= sayi; i++) {
			f *= i;
			if (i != sayi) {
				System.out.print(i + "*");
			}

		}
		
		System.out.print(sayi + " = " + f);
		scan.close();
	}

}
