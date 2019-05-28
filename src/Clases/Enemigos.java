package Clases;

public class Enemigos {
  private String nombre;
  private int vida;
  private int daño;
  private String rutaimagen;
  private Enemigos[]enemigos;
  private int experiencia;
public Enemigos(String nombre, int vida, int daño,String url,int exp) {
	super();
	this.nombre = nombre;
	this.vida = vida;
	this.daño = daño;
	this.rutaimagen=url;
	this.experiencia=exp;
}
public Enemigos() {
	
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
public void setEnemigos(Enemigos[]enemigo){
	Enemigos enemigo1=new Enemigos("Necrofago Harris",600,10,"/Imagenes/harris.png",50);
	enemigo[0]=enemigo1;
	Enemigos enemigo2=new Enemigos("Sanguinario Joven",4200,50,"",200);
	enemigo[1]=enemigo2;
	Enemigos enemigo3=new Enemigos("Mirelurk",1500,25,"",90);
	enemigo[2]=enemigo3;
	Enemigos enemigo4=new Enemigos("Tocho-Mosca",450,8,"",10);
	enemigo[3]=enemigo4;
	Enemigos enemigo5=new Enemigos("Supermutante",2000,20,"",120);
	enemigo[4]=enemigo5;
	
	this.enemigos=enemigo;
}
  public Enemigos[] getEnemigos() {
	  return enemigos;
  }
}
