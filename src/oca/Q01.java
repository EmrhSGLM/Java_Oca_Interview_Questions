package oca;

public class Q01 {

	public static void main(String[] args) {
		 int x = 1;
		 int y = 1;
		  
		 if (x++ < ++y) {
			System.out.println("Hello ");
		} else {
			System.out.println("Welcome ");
		}
		 
		 System.out.println("Log " + x + ":" + y);
	}

}
