package claseAnimal;

public  class Lion extends BigCat {
	
	public static final String name = "Lion";
	public static final int age = 5;

	public Lion () {
		super(name, age);
	}
	public void roar() {
		System.out.println("The Lion lets out a loud ROAR!");
	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	
		
	
}
