package oca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q03 {

	public static void main(String[] args) {
		
		String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
				
		
		System.out.println(date);

	}

}
