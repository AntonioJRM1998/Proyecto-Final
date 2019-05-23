package Clases;

public class Mazmorras {
 private String nombre;
 private boolean completada;
 private String informacion;
 

public Mazmorras(String nombre, boolean completada, String informacion) {
	super();
	this.nombre = nombre;
	this.completada = completada;
	this.informacion = informacion;
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

}
