package Clases;

public class Mazmorras {
 private String nombre;
 private boolean completada;
 private String informacion;
 private int id;
 

public Mazmorras(String nombre, boolean completada, String informacion,int id) {
	super();
	this.nombre = nombre;
	this.completada = completada;
	this.informacion = informacion;
	this.id=id;
}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public boolean isCompletada() {
	return completada;
}

public void setCompletada(boolean completada) {
	this.completada = completada;
}

public String getInformacion() {
	return informacion;
}

public void setInformacion(String informacion) {
	this.informacion = informacion;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}
