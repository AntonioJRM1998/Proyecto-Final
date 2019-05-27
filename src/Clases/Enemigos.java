package Clases;

public class Enemigos {
  private String nombre;
  private int vida;
  private int daño;
public Enemigos(String nombre, int vida, int daño) {
	super();
	this.nombre = nombre;
	this.vida = vida;
	this.daño = daño;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getVida() {
	return vida;
}
public void setVida(int vida) {
	this.vida = vida;
}
public int getDaño() {
	return daño;
}
public void setDaño(int daño) {
	this.daño = daño;
}
  
}
