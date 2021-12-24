package oca;

public class MyConstructor {
	static int x=3;
	int y=5;
	
	MyConstructor() {
		x += 1;
		System.out.println("-x"+x);
	}

	MyConstructor(int i){
		this();
		
		this.y=i;
		x += y;
		System.out.println("-x"+x);
		
	}
	
	MyConstructor(int i,int i2){
		this(3);
		
		this.x -= 3;
		System.out.println("-x"+x);
		
	}
	
	
	public static void main(String[] args) {
		MyConstructor mc1=new MyConstructor(4,3);
		MyConstructor mc2=new MyConstructor();

	}

}
