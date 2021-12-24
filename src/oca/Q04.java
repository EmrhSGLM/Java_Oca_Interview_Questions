package oca;

public class Q04 {

	public static void main(String[] args) {
		
		int[] array= {1,2,3};
		int[] array2= new int[5];
		array2=array;
		for (int w : array2) {
			System.out.print(w+" ");			
		}
		int[] array3=new int[3];
		array3=array2;
		System.out.println();
		for (int w : array3) {
			System.out.print(w+" ");
		}
		

	}

}
