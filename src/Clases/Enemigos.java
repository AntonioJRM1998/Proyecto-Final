package Clases;

public class Enemigos {
  private String nombre;
  private int vida;
  private int da�o;
  private String rutaimagen;
  private Enemigos[]enemigos;
  private Enemigos[]mazmorras;
  private int experiencia;
public Enemigos(String nombre, int vida, int da�o,String url,int exp) {
	super();
	this.nombre = nombre;
	this.vida = vida;
	this.da�o = da�o;
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
public void setEnemigos(Enemigos[]enemigo){
	Enemigos enemigo2=new Enemigos("Sanguinario Joven",4200,50,"",200);
	enemigo[0]=enemigo2;
	Enemigos enemigo3=new Enemigos("Mirelurk",1500,25,"",90);
	enemigo[1]=enemigo3;
	Enemigos enemigo4=new Enemigos("Tocho-Mosca",450,8,"/Imagenes/Tochomosca.png",10);
	enemigo[2]=enemigo4;
	Enemigos enemigo5=new Enemigos("Supermutante",2000,20,"",120);
	enemigo[3]=enemigo5;
	Enemigos enemigo6=new Enemigos("Rata-Topo",500,10,"",20);
	enemigo[4]=enemigo6;
	
	this.enemigos=enemigo;
}
  public Enemigos[] getEnemigos() {
	  return enemigos;
  }
public Enemigos[] getMazmorras() {
	return mazmorras;
}
public void setMazmorras(Enemigos[] mazmorras) {
	Enemigos enemigo1=new Enemigos("Necrofago Harris",600,15,"/Imagenes/harris.png",50);
	mazmorras[0]=enemigo1;
	this.mazmorras = mazmorras;
}
  
}
