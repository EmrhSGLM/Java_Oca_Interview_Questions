package questions;
import java.util.Scanner;

public class Q_002 {

	public static void main(String[] args) {
		/* 
	      Check if the integer is an Armstrong numbers
	       Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
	​
	         153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
	         370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
	    */
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		int num1=num;
		String numUz=Integer.toString(num);
		int toplam=0;
		for (int i = 0 ; i < numUz.length(); i++) {
			int a=num1%10;
			toplam += Math.pow(a, numUz.length());
			num1=num1/10;			
		}
		 
		if (toplam == num) {
			System.out.println(num + " = " + toplam);
			System.out.println(num + " Armstrong bir sayidir" );
		} else {
			System.out.println(num + " != " + toplam);
			System.out.println(num + " Armstrong bir sayi degildir" );
		}
		scan.close();		

		
	}

}
