package claseAnimal;

public class Main {

	public static void main(String[] args) {
		
		Bird piolin =new Bird();
		Canine snoopy=new Canine();
		Eagle eagle =new Eagle();
		Elephant tantor =new Elephant();
		Mouse remy = new Mouse();
		Shark tiburoncin = new Shark(10);
		Fish nemo= new Fish(5);
		Kangaroo joey = new Kangaroo();
		Swan cisne = new Swan();
		Wolf alpha =new Wolf();
		
		
		System.out.println("overloading birds: ");
		
		eagle.fly(10);
		eagle.eat(20);
		eagle.hasfeathers();
		
		
		System.out.println("Overriding Canine and Wolf: ");
		
		System.out.println(new Canine().getAverageWeight());
		System.out.println(new Wolf().getAverageWeight());
		
		System.out.println("Calling Inherited Class Members ");
		nemo.getAge();
		
		System.out.println("Hidden Method ");
		
		joey.getKangarooDescription();
		joey.getMarsupialDescription();
		
		System.out.println("Hidden Variable ");
		
		remy.getMouseDetails();
		remy.getRodentDetails();
		
		System.out.println("Abstract method ");
		
		cisne.getName();
		
	}

	
	
	
}
