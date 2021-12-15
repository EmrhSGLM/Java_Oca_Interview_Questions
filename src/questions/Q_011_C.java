package questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q_011_C {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter arr's length");
		int length=scan.nextInt();
		int arr[]=new int [length];
	
		for (int i = 0; i < length; i++) {
			System.out.print("Enter arr elements : ");
			arr[i]=scan.nextInt();			
		
		}
		Arrays.sort(arr);
		int difference=arr[arr.length-1]-arr[0];
		
		System.out.println(difference);
		
		scan.close();
	}

}
