package Interface;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

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
	public Ventana() {
		super();
		mazmorra=new Mazmorras[20];
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Fallout");
		inicio=new PanelInicio(this);
		setSize(1600,900);
		setVisible(true);
		setResizable(false);
		this.setContentPane(inicio);
		personaje=new Personaje("",true,new Objetos[3][3]);
		mazmorra[0]=new Mazmorras("Casa del Anciano Harris",false,"Esta casa lleva años abandonada pero se dice que algunos saqueadores la usan como refugio");
		
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
		System.out.println(mazmorra[0].getNombre());
		if(this.informacion==null) {
			this.informacion=new PanelInformacion(this);
		}
		this.mapa.setVisible(false);
		this.setContentPane(this.informacion);
		this.mapa.setVisible(true);
	}
	public Mazmorras[] getMazmorra() {
		return mazmorra;
	}
	public void setMazmorra(Mazmorras[] mazmorra2) {
		this.mazmorra = mazmorra2;
	}
	

}
