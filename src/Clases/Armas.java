package Clases;

public class Armas {
 private String nombre;
 private int da�o;
 private int duravilidad;
 private String urls;
 private String descripcion;
public Armas(String nombre, int da�o, int duravilidad,String urls,String descripcion) {
	super();
	this.nombre = nombre;
	this.da�o = da�o;
	this.duravilidad = duravilidad;
	this.urls=urls;
	this.descripcion=descripcion;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getDa�o() {
	return da�o;
}
public void setDa�o(int da�o) {
	this.da�o = da�o;
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
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
 
}
