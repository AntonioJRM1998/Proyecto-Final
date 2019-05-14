package Clases;

public class Personaje {
	private String nombre;
	private Boolean genero;
	private int vida;
	private int fuerza;
	private int inteligencia;
	private int carisma;
	private int resistencia;
	private Objetos[][]mochila;
	private int nivel;
	private int experiencia;
	private int puntoshabilidades;
public Personaje(String nombre, Boolean genero, Objetos[][] mochila) {
		super();
		this.vida=100;
		this.puntoshabilidades=7;
		this.nombre = nombre;
		this.genero = genero;
		this.fuerza = 5;
		this.inteligencia = 5;
		this.carisma = 5;
		this.resistencia =5;
		this.mochila = mochila;
		this.nivel = 1;
		this.experiencia = 0;
	}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public Boolean getGenero() {
	return genero;
}
public void setGenero(Boolean genero) {
	this.genero = genero;
}
public int getFuerza() {
	return fuerza;
}
public void setFuerza(int fuerza) {
	this.fuerza = fuerza;
}
public int getInteligencia() {
	return inteligencia;
}
public void setInteligencia(int inteligencia) {
	this.inteligencia = inteligencia;
}
public int getCarisma() {
	return carisma;
}
public void setCarisma(int carisma) {
	this.carisma = carisma;
}
public int getResistencia() {
	return resistencia;
}
public void setResistencia(int resistencia) {
	this.resistencia = resistencia;
}
public Objetos[][] getMochila() {
	return mochila;
}
public void setMochila(Objetos[][] mochila) {
	this.mochila = mochila;
}
public int getNivel() {
	return nivel;
}
public void setNivel(int nivel) {
	this.nivel = nivel;
}
public int getExperiencia() {
	return experiencia;
}
public void setExperiencia(int experiencia) {
	this.experiencia = experiencia;
}
public int getPuntoshabilidades() {
	return puntoshabilidades;
}
public void setPuntoshabilidades(int puntoshabilidades) {
	this.puntoshabilidades = puntoshabilidades;
}
public int getVida() {
	return vida;
}
public void setVida(int vida) {
	this.vida = vida;
}

	
}
