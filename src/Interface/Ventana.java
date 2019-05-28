package Interface;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import Clases.Enemigos;
import Clases.Mazmorras;
import Clases.Objetos;
import Clases.Personaje;

public class Ventana extends JFrame  {
	private PanelInicio inicio;
	private PanelHabilidades habilidades;
	private PanelMapa mapa;
	private Personaje personaje;
	private Objetos[][]mochila;
	private Mazmorras[]mazmorra;
	private PanelInformacion informacion;
	private PanelCombate combate;
	private Enemigos enemigos;
	public Ventana() {
		super();
		mazmorra=new Mazmorras[20];
		enemigos=new Enemigos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Fallout");
		inicio=new PanelInicio(this);
		setSize(1600,920);
		setVisible(true);
		setResizable(false);
		this.setContentPane(inicio);
		personaje=new Personaje("",true,new Objetos[3][3]);
	}
	public Personaje getPersonaje() {
		return personaje;
	}
	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}
	public Objetos[][] getMochila() {
		return mochila;
	}
	public void setMochila(Objetos[][] mochila) {
		this.mochila = mochila;
	}
	public void cargaPantallaHabilidades() {
		if(this.habilidades==null) {
			this.habilidades=new PanelHabilidades(this);
		}
		this.inicio.setVisible(false);
		this.setContentPane(this.habilidades);
		this.habilidades.setVisible(true);
	}
	public void cargaPantallaMapa() {
		if(this.mapa==null) {
			this.mapa=new PanelMapa(this);
		}
		this.habilidades.setVisible(false);
		this.setContentPane(this.mapa);
		this.habilidades.setVisible(true);
	}
	public void cargaPantallaInformacion() {
		if(this.informacion==null) {
			this.informacion=new PanelInformacion(this);
		}
		this.mapa.setVisible(false);
		this.setContentPane(this.informacion);
		this.mapa.setVisible(true);
	}
	public void cargaPantallaCombate() {
		if(this.combate==null) {
			this.combate=new PanelCombate(this);
		}
		this.informacion.setVisible(false);
		this.setContentPane(this.combate);
		this.informacion.setVisible(true);
	}
	public void cargaPantallaCombateAleatorio() {
		if(this.combate==null) {
			this.combate=new PanelCombate(this);
		}
		this.mapa.setVisible(false);
		this.setContentPane(this.combate);
		this.mapa.setVisible(true);
	}
	public Mazmorras[] getMazmorra() {
		return mazmorra;
	}
	public void setMazmorra(Mazmorras[] mazmorra2) {
		this.mazmorra = mazmorra2;
	}
	public PanelInformacion getInformacion() {
		return informacion;
	}
	public void setInformacion(PanelInformacion informacion) {
		this.informacion = informacion;
	}
	public PanelMapa getMapa() {
		return mapa;
	}
	public void setMapa(PanelMapa mapa) {
		this.mapa = mapa;
	}
	public Enemigos getEnemigos() {
		return enemigos;
	}
	public void setEnemigos(Enemigos enemigos) {
		this.enemigos = enemigos;
	}
	public PanelCombate getCombate() {
		return combate;
	}
	public void setCombate(PanelCombate combate) {
		this.combate = combate;
	}
	

}
