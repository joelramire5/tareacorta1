package claseAnimal;

public class Bird {

	public static void fly() {
		System.out.println("Bird is flying");
	}
	public static void eat(int food) {
		System.out.println("Bird is eating "+food+ "units of food");
	}
	
	public final static boolean hasfeathers() {
		return true;
	}
	
}

