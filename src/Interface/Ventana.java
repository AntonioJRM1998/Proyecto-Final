package Interface;
import javax.swing.JFrame;

import Clases.Enemigos;
import Clases.Habilidades;
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
	private Habilidades atributos;
	private PanelDescanso descanso;
	public Ventana() {
		super();
		mazmorra=new Mazmorras[2];
		enemigos=new Enemigos();
		atributos=new Habilidades();
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
	public void cargaPantallaMapaInicio() {
		if(this.mapa==null) {
			this.mapa=new PanelMapa(this);
		}
		this.inicio.setVisible(false);
		this.setContentPane(this.mapa);
		this.inicio.setVisible(true);
	}
	public void cargaPantallaMapaCombatesAl() {
		if(this.mapa==null) {
			this.mapa=new PanelMapa(this);
		}
		this.combate.setVisible(false);
		this.setContentPane(this.mapa);
		this.combate.setVisible(true);
	}
	public void cargaPantallaMapaInformacion() {
		if(this.mapa==null) {
			this.mapa=new PanelMapa(this);
		}
		this.informacion.setVisible(false);
		this.setContentPane(this.mapa);
		this.informacion.setVisible(true);
	}
	public Mazmorras[] getMazmorra() {
		return mazmorra;
	}
	public void setMazmorra(Mazmorras[] mazmorra2) {
		Mazmorras mazmorracasa=new Mazmorras("Casa del Anciano Harris",false,"Esta casa lleva años abandonada pero se dice que algunos saqueadores la usan como refugio",0);
		mazmorra2[0]=mazmorracasa;
		Mazmorras ciudad=new Mazmorras("Ciudadela",false,"La ciudadela de la hermandad del acero es el sitio ideal para comprar sumisnistros medicos,armas,municion y curarse, tambien podras vender tus cosas al mercader local",1);
		mazmorra2[1]=ciudad;
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
	public PanelDescanso getDescanso() {
		return descanso;
	}
	public void setDescanso(PanelDescanso descanso) {
		this.descanso = descanso;
	}
	public Habilidades getAtributos() {
		return atributos;
	}
	public void setAtributos(Habilidades atributos) {
		this.atributos = atributos;
	}
	
	
	

}
