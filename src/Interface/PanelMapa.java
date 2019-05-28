package Interface;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;

import Clases.Mazmorras;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PanelMapa extends JPanel {
	private Ventana ventana;
	private int idmazmorras;
	private PanelInformacion informa;
	private boolean combates;
	public PanelMapa(Ventana v) {
		super();
		Mazmorras[]maz=v.getMazmorra();
		this.ventana=v;
		setSize(1600,902);
		setLayout(null);
		informa=v.getInformacion();
		JButton ciudad = new JButton("");
		ciudad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				combates=false;
				setIdmazmorras(1);
				ventana.cargaPantallaInformacion();
			}
		});
		
		JButton combateAleatorio = new JButton("Combate en el Yermo");
		combateAleatorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Random ram=new Random();
				combates=true;
				setIdmazmorras(ram.nextInt(5));
				ventana.cargaPantallaCombateAleatorio();
			}
		});
		combateAleatorio.setBounds(917, 813, 662, 68);
		add(combateAleatorio);
		ciudad.setIcon(new ImageIcon(PanelMapa.class.getResource("/Imagenes/BoS_logo1.png")));
		ciudad.setBounds(722, 599, 116, 108);
		ciudad.setContentAreaFilled(false);
		add(ciudad);
		
		JButton mazmorra1 = new JButton("");
		mazmorra1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setIdmazmorras(0);
				combates=false;
				ventana.cargaPantallaInformacion();
			}
		});
		mazmorra1.setIcon(new ImageIcon(PanelMapa.class.getResource("/Imagenes/Captura.PNG")));
		mazmorra1.setBounds(178, 270, 47, 47);
		mazmorra1.setContentAreaFilled(false);
		mazmorra1.setBorderPainted(false);
		add(mazmorra1);
		
		JLabel lblpersonaje = new JLabel("");
		lblpersonaje.setIcon(new ImageIcon(PanelMapa.class.getResource("/Imagenes/PersonajeMapa.png")));
		lblpersonaje.setBounds(1073, 155, 328, 637);
		add(lblpersonaje);
		JProgressBar barraVida = new JProgressBar();
		barraVida.setForeground(Color.RED);
		barraVida.setBounds(1105, 21, 286, 68);
		barraVida.setMaximum(ventana.getPersonaje().getVida());
		barraVida.setValue(ventana.getPersonaje().getVida());
		add(barraVida);
		
		JButton btnMochila = new JButton("Mochila");
		btnMochila.setBounds(1401, 21, 178, 68);
		add(btnMochila);
		
		JButton btnHabilidades = new JButton("Habilidades");
		btnHabilidades.setBounds(917, 21, 178, 68);
		add(btnHabilidades);
		
		JLabel lblmapa = new JLabel("");
		lblmapa.setBounds(0, -13, 896, 904);
		lblmapa.setIcon(new ImageIcon(PanelMapa.class.getResource("/Imagenes/mapa.jpg")));
		add(lblmapa);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelMapa.class.getResource("/Imagenes/c9402baace20a38fad95143f7db3dabf.jpg")));
		label.setBounds(747, 0, 869, 891);
		add(label);
	}
	public int getIdmazmorras() {
		return idmazmorras;
	}
	public void setIdmazmorras(int idmazmorras) {
		this.idmazmorras = idmazmorras;
	}
	public boolean isCombates() {
		return combates;
	}
	public void setCombates(boolean combates) {
		this.combates = combates;
	}
	
}
