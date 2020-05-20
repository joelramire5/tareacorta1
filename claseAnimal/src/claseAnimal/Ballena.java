package claseAnimal;

public class Ballena extends Animal {
	int distancia;
	public void setDistancia(int distancia) {
		this.distancia =distancia;
	}
	
		public Ballena( ) {
		super();
		setNombre("Ballena");
		setTipocomida("plancton");
		setDistancia(500);
	
	
	}
	public void moverse() {
		System.out.println("La Ballena nada");

	}
	public void sonar() {
		System.out.println("La ballena se puede comunicar con otras ballenas a una distancia de " + distancia + "metros");
	}
		

}
