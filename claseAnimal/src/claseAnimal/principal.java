package claseAnimal;

public class principal {
	
	
	public static void main(String[] args) {
		
		Perro perro = new Perro();
		perro.comer();
		perro.moverse();
		
		Ballena ballena = new Ballena();
		ballena.comer();
		ballena.moverse();
		ballena.sonar();
	}

}
