package claseAnimal;

public abstract class Animal {

	
	public String nombre;
	public String  tipocomida;
 
	public Animal() {
}
public void comer() {
	System.out.println("El "+nombre+ " come "+tipocomida);
	
}

public abstract void moverse();

public String getNombre() {
	return nombre;	
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getTipocomida() {
	return tipocomida;
}
public void setTipocomida(String tipocomida) {
	this.tipocomida = tipocomida;
}
}
