package oca;
class Animal {
	String type = "Canine";
	int maxSpeend = 60;
	
	Animal() {}
	
	Animal(String type, int maxSpeend) {
		this.type=type;
		this.maxSpeend=maxSpeend;
	}
}

class WildAnimal extends Animal {
	String bounds;
	WildAnimal (String bounds){
		super();
		this.bounds=bounds;	
	}
	
	WildAnimal (String type, int maxSpeend, String bounds){
		super(type, maxSpeend);
		this.bounds=bounds;
	}
}
public class Q09 {
	public static void main(String[] args) {
		WildAnimal wolf = new WildAnimal("Long");
		WildAnimal tiger = new WildAnimal("Feline", 80, "Short");
		System.out.println(wolf.type+" " + wolf.maxSpeend + " " + wolf.bounds);
		System.out.println(tiger.type + " " + tiger.maxSpeend + " " + tiger.bounds);
	}
	

}
