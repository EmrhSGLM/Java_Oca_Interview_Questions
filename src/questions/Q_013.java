package questions;

public class Q_013 {

	public static void main(String[] args) {
		/*
		 
		 * Write a Java Program to swap two numbers
		 * 
		 * Swap (takas) islemini --> a=3, b=5 iken a=5, b=3 degerlerini alması
		 * islemidir. iki yoldan yaptiginiz java kodunu yaziniz.
		 * 
		 *  1.Yol: 3. degisken kullanarak 
		 *  2.Yol: 3. degisken kullanmadan
		 
		 */

		System.out.println("***** 1.Solution Way *****\n");
		int a=3;
		int b=5;
		System.out.print("First situation ===> "+"a = "+a+"\tb = " + b+"\n");
		int c=b; b=a; a=c;
		System.out.println("Last situation ===> "+"a = "+a+"\tb = " + b);
		
		System.out.println("\n***** 2.Solution Way *****\n");
		a=3; b=5;
		System.out.print("First situation ===> "+"a = "+a+"\tb = " + b+"\n");
		
		a=a-b; b=a+b; a=b-a;		
		System.out.println("Last situation ===> "+"a = "+a+"\tb = " + b);
		
	}

}
