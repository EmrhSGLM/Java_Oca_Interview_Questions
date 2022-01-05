package oca;

public class Employee {
		
	 String name;
	 boolean contract;
	 double salary;
	 
	Employee() {
		 this.name=new String("Joe");
		 this.contract = new Boolean(true);
		 this.salary=new Double(100);
		 
	 }
	 public String toString() {
		 return name + ":" + contract + ":" + salary;
	 }
	 
	 public static void main(String[] args) {
		 Employee e = new Employee();
		 
		 e.name="Joe";
		 e.contract=true;    // ==> CEVAP Obje uzerinden class level da bulunan variable'lara atama yapar ve  
		 e.salary=100;			//	obje ismi ile objeyi yazdirirsak adadigimiz degerleri buluruz	 
		 
		 System.out.println(e);
	}
	
}
