package Interface;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

import Clases.BaseDatos;
import Clases.Enemigos;
import Clases.Mazmorras;


import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import javax.swing.JSlider;

public class PanelMapa extends JPanel {
	private Ventana ventana;
	private int idmazmorras;
	private int sueño;
	JProgressBar sueñometro;
	private PanelInformacion informa;
	private Mazmorras[]mazmorra;
	private Connection conn;
	JProgressBar barraVida;
	private boolean combates;
	private Enemigos[]enemigo;
	public PanelMapa(Ventana v) {
		super();
		setSueño(100);
		setEnemigos(new Enemigos[5]);
		setMazmorra(new Mazmorras[2]);
		this.ventana=v;
		setSize(1600,902);
		setLayout(null);
		informa=v.getInformacion();
		JButton ciudad = new JButton("");
		ciudad.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				combates=false;
				setIdmazmorras(0);
				ventana.cargaPantallaInformacion();
				v.getCombate().crearLabels(v,getIdmazmorras(),enemigo);
				v.getCombate().crearNombre(v, getIdmazmorras(),enemigo);
				v.getCombate().modificarBarravida(v, getIdmazmorras(),enemigo);
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
		
		JButton btnNewButton = new JButton("Guardar Partida");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(v.getPersonaje().getNombre());
				try {
					conn=DriverManager.getConnection(BaseDatos.bdNombre,BaseDatos.bdUsuario,BaseDatos.bdContraseña);
					PreparedStatement loginStatement1=null;
					Statement registerpokemon=conn.createStatement();
					PreparedStatement statement = conn.prepareStatement("TRUNCATE " + "personaje");
					PreparedStatement statement1=conn.prepareStatement(" TRUNCATE " + " mazmorras ");
					statement.executeUpdate();
					statement1.executeUpdate();
					
					PreparedStatement loginStatement=conn.prepareStatement(
					        "insert into personaje (Nombre,genero,vida,fuerza,inteligencia,carisma,resistencia,nivel,experiencia,daño,puntoshabilidades"
					                        + ") values('"+v.getPersonaje().getNombre()+"',"+v.getPersonaje().getGenero()+",'"+v.getPersonaje().getVida()+
					                        "','"+v.getPersonaje().getFuerza()+"','"+v.getPersonaje().getInteligencia()+
					                        "','"+v.getPersonaje().getCarisma()+"','"+v.getPersonaje().getResistencia()+"','"+v.getPersonaje().getNivel()+
					                        "','"+v.getPersonaje().getExperiencia()+"','"+v.getPersonaje().getDaño()+"',"+v.getPersonaje().getPuntoshabilidades()+")");
				for(int c=0;c<mazmorra.length;c++) {
					if(mazmorra[c].isCompletada()==false) {
						System.out.println(mazmorra[c].isCompletada()+""+mazmorra[c].getNombre());
						loginStatement1=conn.prepareStatement(
						      "insert into mazmorras (completada,nombre"
						                        + ") values('"+0+"','"+mazmorra[c].getNombre()+"')");
						loginStatement1.executeUpdate();
					}else {
						loginStatement1=conn.prepareStatement(
					        "insert into mazmorras (completada,nombre"
					                        + ") values('"+1+"','"+mazmorra[c].getNombre()+"')");
					}
					
				}
					loginStatement.executeUpdate();
					JOptionPane.showConfirmDialog(getComponentPopupMenu(), "Se han guardado los datos");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(898, 723, 235, 54);
		add(btnNewButton);
		
		sueñometro = new JProgressBar();
		sueñometro.setStringPainted(true);
		sueñometro.setValue(getSueño());
		sueñometro.setForeground(Color.YELLOW);
		sueñometro.setBounds(1323, 783, 277, 67);
		add(sueñometro);
		
		
		botonDescansar.setBounds(1152, 781, 160, 68);
		add(botonDescansar);
		combateAleatorio.setBounds(898, 781, 235, 68);
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
		btnHabilidades.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JFrame habilidad=new JFrame();
				System.out.println(v.getAtributos().getArmas());
				v.getAtributos().setArmas(v.getPersonaje().getFuerza()*2);
				v.getAtributos().setConversacion(v.getPersonaje().getCarisma()*2);
				v.getAtributos().setCiencia(v.getPersonaje().getInteligencia()*2);
				v.getAtributos().setMedicina(v.getPersonaje().getInteligencia()*2);
				v.getAtributos().setReparacion(v.getPersonaje().getInteligencia()*2);
				habilidad.setSize(500,700);
				habilidad.setVisible(true);
				habilidad.getContentPane().add(new PanelAtributos(v));
				
			}
		});
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
	public void setMazmorra(Mazmorras[]maz) {
		this.mazmorra=ventana.getMazmorra();
	}
	public Enemigos[] getEnemigos(){
		return enemigo;
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
