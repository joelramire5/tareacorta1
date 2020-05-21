package claseAnimal;

public abstract class Animal {
	
	private int age;
	private String name;
	
	public Animal(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public abstract String getName();

}
