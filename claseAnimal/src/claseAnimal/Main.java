package claseAnimal;

public class Main {

	public static void main(String[] args) {
		
	System.out.println(new Canine().getAverageWeight());
	System.out.println(new Wolf().getAverageWeight());

	
	
	Kangaroo joey = new Kangaroo();
	
	joey.getKangarooDescription();
	joey.getMarsupialDescription();
	
	Mouse mickey = new Mouse();
	mickey.getRodentDetails();
	mickey.getMouseDetails();
	
	}

	
	
	
}
