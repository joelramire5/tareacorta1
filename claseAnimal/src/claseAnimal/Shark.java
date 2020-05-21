package claseAnimal;

public class Shark extends Fish {
	
	private int numberoffins =10;
		
	public Shark(int age) {
		super(age);
		this.size=4;
	}

	public void displaySharkDetails() {
		System.out.print("Shark with age: " +super.getAge());
		System.out.print(" and " + size+"meters long ");
		System.out.print(" with "+numberoffins+" fins");
		
	}
}
