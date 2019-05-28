package Clases;

public class Armas {
 private String nombre;
 private int daño;
 private int duravilidad;
 private String urls;
public Armas(String nombre, int daño, int duravilidad,String urls) {
	super();
	this.nombre = nombre;
	this.daño = daño;
	this.duravilidad = duravilidad;
	this.urls=urls;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDaño() {
	return daño;
}
public void setDaño(int daño) {
	this.daño = daño;
}
public int getDuravilidad() {
	return duravilidad;
}
public void setDuravilidad(int duravilidad) {
	this.duravilidad = duravilidad;
}
public String getUrls() {
	return urls;
}
public void setUrls(String urls) {
	this.urls = urls;
}
 
}
