package Clases;

public class Enemigos {
  private String nombre;
  private int vida;
  private int da�o;
  private String rutaimagen;
  private int experiencia;
public Enemigos(String nombre, int vida, int da�o,String url,int exp) {
	super();
	this.nombre = nombre;
	this.vida = vida;
	this.da�o = da�o;
	this.rutaimagen=url;
	this.experiencia=exp;
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
public int getDa�o() {
	return da�o;
}
public void setDa�o(int da�o) {
	this.da�o = da�o;
}
public String getRutaimagen() {
	return rutaimagen;
}
public void setRutaimagen(String rutaimagen) {
	this.rutaimagen = rutaimagen;
}
public int getExperiencia() {
	return experiencia;
}
public void setExperiencia(int experiencia) {
	this.experiencia = experiencia;
}

  
}
