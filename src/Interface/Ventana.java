package Interface;

import javax.swing.JFrame;

public class Ventana extends JFrame {
	private PanelInicio inicio;
	private PanelHabilidades habilidades;
	public Ventana() {
		super();
		this.setTitle("pantallaInicio");
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
		this.setTitle("Inicio");
		this.inicio.setVisible(false);
		this.setContentPane(this.habilidades);
		this.habilidades.setVisible(true);
	}

}
