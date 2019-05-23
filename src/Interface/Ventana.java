package Interface;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import Clases.Objetos;
import Clases.Personaje;

public class Ventana extends JFrame  {
	private PanelInicio inicio;
	private PanelHabilidades habilidades;
	private PanelMapa mapa;
	private Personaje personaje;
	private Objetos[][]mochila;
	
	public Ventana() {
		super();
		this.setTitle("Fallout");
		inicio=new PanelInicio(this);
		setSize(1600,900);
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

}
