package oca;

import java.util.ArrayList;
import java.util.List;

public class Q12 {
	
//	Which statement will empty the contents of a StringBuilder variable named sb?
//			
//			A=> sb.deleteAll();
//			B=> sb.delete(0,sb.size());
//			C=> sb.delete(0,sb.length());
//			D=> sb.removeAll();
	
	public static void main(String[] args) {
		
		String str1="Ali gel";
		StringBuilder sb = new StringBuilder(str1);	
		
		sb.delete(0, sb.length());
		System.out.println(sb);
		
		
		
	}

}
