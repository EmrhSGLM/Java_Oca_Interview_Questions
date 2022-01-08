package questions;

import java.util.Arrays;

public class Q_023 {

	public static void main(String[] args) {
		
		/*
        Ebay Interview Question:
        Put all zeros to end in a integer array
        Bir tamsayı dizisinde tüm sıfırları sona koyan bir program create ediniz.

        input : {3, 0, 4, 2, 0}
        output: {3, 4, 2, 0, 0}
         */
		
		int[] arr={3, 0, 4, 2, 0};
		int[] arr1= new int[arr.length];
		int count=0;
		int count1=1;
		for(int i=0; i < arr.length;i++) {
			
			if(arr[i] != 0) {
				arr1[count]=arr[i];
				count++;				
			}
			if(arr[i] == 0) {
				arr1[arr1.length-count1]=arr[i];
				count1++;
				
			}
		}
		System.out.println("Input => " + Arrays.toString(arr));
		System.out.println("Output => " + Arrays.toString(arr1));

	}

}
