package Interface;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	private PanelInicio inicio;
	private PanelHabilidades habilidades;
	private PanelMapa mapa;
	public Ventana() {
		super();
		this.setTitle("Fallout");
		inicio=new PanelInicio(this);
		setSize(1600,900);
		setVisible(true);
		setResizable(false);
		this.setContentPane(inicio);
		
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
