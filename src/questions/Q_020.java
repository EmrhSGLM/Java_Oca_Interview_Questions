package questions;

public class Q_020 {

	public static void main(String[] args) {
		
		/*

        We are organizing a horse race with horses having distinct strengths.
        The strength of the horses is represented by an array of integers.
        In order to make the race competitive,  your program should find out the pair of
        horses with similar str
        
        Farklı güçleri olan atlarla bir at yarışı düzenliyor. 
        Atların gücü bir tamsayı dizi assign  edilirse.
        bir birine yakın güçlere sahip at çiftlerini bulunuz.
        For example : {3, 67, 9, 46, 55, 48}
        output 		: 46,48

         */
		
		int[] arr={3, 67, 9, 46, 55, 48};
		
		int count=arr[0]-arr[1];
		int sayi1=0;
		int sayi2=0;
		for(int i=arr.length-1; i > 0;i--) {
			
			for(int j=arr.length-2; j >= 0;j--) {
				
				int count1= arr[i] - arr[j];
				if(count1 < 0 ) {count1 = count1*-1;}
				if(count < 0) {count = count*-1;}
				
				if((count1) < count && i != j ) {
					count=arr[i]-arr[j];
					sayi1=arr[j];
					sayi2=arr[i];
				}
			}
			
		}
		System.out.println(sayi1 + "," + sayi2);

	}

}
