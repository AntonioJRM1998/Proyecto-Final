package Interface;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import Clases.Enemigos;
import Clases.Mazmorras;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JSlider;

public class PanelMapa extends JPanel {
	private Ventana ventana;
	private int idmazmorras;
	private int sueño;
	JProgressBar sueñometro;
	private PanelInformacion informa;
	JProgressBar barraVida;
	private boolean combates;
	private Enemigos[]enemigo;
	public PanelMapa(Ventana v) {
		super();
		setSueño(100);
		setEnemigos(new Enemigos[5]);
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
				v.getCombate().crearLabels(v,getIdmazmorras(),null);
				ventana.cargaPantallaInformacion();
			}
		});
		
		JButton combateAleatorio = new JButton("Combate en el Yermo");
		combateAleatorio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(v.getPersonaje().getVida()>0) {
				Random ram=new Random();
				setIdmazmorras(ram.nextInt(5));
				combates=true;
				ventana.cargaPantallaCombateAleatorio();
				v.getCombate().crearLabels(v,getIdmazmorras(),enemigo);
				v.getCombate().crearNombre(v, getIdmazmorras(),enemigo);
				v.getCombate().modificarBarravida(v, getIdmazmorras(),enemigo);
			}else {
				JOptionPane.showMessageDialog(getParent(),"No tienes vida para combatir");
			}
				
			}
		});
		
		JButton botonDescansar = new JButton("Descansar");
		botonDescansar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame frame=new JFrame();
				frame.setSize(400,200);
				frame.setResizable(false);
				frame.setVisible(true);
				frame.getContentPane().add(new PanelDescanso(v));
			}
		});
		
		sueñometro = new JProgressBar();
		sueñometro.setStringPainted(true);
		sueñometro.setValue(getSueño());
		sueñometro.setForeground(Color.YELLOW);
		sueñometro.setBounds(1302, 783, 277, 67);
		add(sueñometro);
		
		
		botonDescansar.setBounds(1103, 782, 178, 68);
		add(botonDescansar);
		combateAleatorio.setBounds(904, 782, 178, 68);
		add(combateAleatorio);
		ciudad.setIcon(new ImageIcon(PanelMapa.class.getResource("/Imagenes/BoS_logo1.png")));
		ciudad.setBounds(730, 602, 108, 105);
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
		lblpersonaje.setBounds(1056, 110, 364, 651);
		add(lblpersonaje);
		barraVida = new JProgressBar();
		barraVida.setForeground(Color.RED);
		barraVida.setBounds(1105, 21, 286, 68);
		barraVida.setStringPainted(true);
		barraVida.setMaximum(ventana.getPersonaje().getResistencia()*20);
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
	public void setEnemigos(Enemigos[]enemigos){
		Enemigos enemigo2=new Enemigos("Sanguinario Joven",4200,50,"/Imagenes/sanguinario.png",200);
		enemigos[0]=enemigo2;
		Enemigos enemigo3=new Enemigos("Mirelurk",1500,25,"/Imagenes/mairleck.png",90);
		enemigos[1]=enemigo3;
		Enemigos enemigo4=new Enemigos("Tocho-Mosca",450,8,"/Imagenes/Tochomosca.png",10);
		enemigos[2]=enemigo4;
		Enemigos enemigo5=new Enemigos("Supermutante",2000,20,"/Imagenes/Supermuntateb.png",120);
		enemigos[3]=enemigo5;
		Enemigos enemigo6=new Enemigos("Rata-Topo",500,10,"",20);
		enemigos[4]=enemigo6;
		this.enemigo=enemigos;
	}
	public void ponerVida(Ventana v) {
		barraVida.setValue(v.getPersonaje().getVida());
		sueñometro.setValue(getSueño());
		
	}
	public int getSueño() {
		return sueño;
	}
	public void setSueño(int sueño) {
		this.sueño = sueño;
	}
	
}
