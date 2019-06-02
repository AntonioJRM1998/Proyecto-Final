package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

import Clases.Armas;
import Clases.BaseDatos;
import Clases.Enemigos;
import Clases.Mazmorras;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.BorderLayout;

public class PanelCombate extends JPanel {
	private Ventana ventana;
	private ArrayList<Armas> arma;
	private Armas x;
	private JPanel nombrenemy ;
	private JPanel panelVidaEnemy;
	private Connection conn;
	private JLabel nombreEnemigo;
	private JProgressBar vidaenemigos;
	private JProgressBar vidaJugador;
	private JPanel areaFotoEnemigo;
	private int cont;
	private JPanel miVida;
	private Enemigos[]enemigos;
	private Enemigos[]enemigomazmorra;
	private boolean ajustes;
	private int id;
	public PanelCombate(Ventana v) {
		super();
		setEnemigos(enemigos=new Enemigos[5]);
		setEnemigomazmorra(enemigomazmorra=new Enemigos[1]);
		this.ventana=v;
		id=v.getMapa().getIdmazmorras();
		setSize(1600,900);
		setLayout(null);
		arma=new ArrayList<Armas>(10);
		ArrayList<String> nombrearmas= new ArrayList<String>(10);
		Armas puños=new Armas("Puños",0,10000000,"","Usa tus puños para derrotar a los enemigos");
		Armas pistola10m=new Armas("Pistola de 10m",10+(v.getAtributos().getArmas()*2),1000000,"/Imagenes/pistola10m.png","Es un arma muy duradera y eficiente producida por Colt Firearms antes de la Gran Guerra. Su diseño simple hace que pueda ser manufacturada con equipamiento básico. La durabilidad, manejo y su diseño simple hacen que sea muy popular entre los habitantes de yermo.");
		Armas pistola9m=new Armas("Pistola de 9m",5+(v.getAtributos().getArmas()*2),100,"/Imagenes/pistola9mm.png","Pistola mucho mas debil que la de 10mm pero no del todo inutil, puede matar enemigos pequeños como tochomoscas y ratastopo");
		arma.add(puños);
		arma.add(pistola10m);
		arma.add(pistola9m);
		
		miVida = new JPanel();
		miVida.setBounds(114, 626, 278, 32);
		add(miVida);
		miVida.setLayout(new BorderLayout(0, 0));
		
		panelVidaEnemy = new JPanel();
		panelVidaEnemy.setBounds(1142, 626, 278, 32);
		add(panelVidaEnemy);
		panelVidaEnemy.setLayout(new BorderLayout(0, 0));
		
		nombrenemy = new JPanel();
		nombrenemy.setBounds(1142, 583, 278, 32);
		add(nombrenemy);
		
		areaFotoEnemigo = new JPanel();
		areaFotoEnemigo.setBounds(1142, 99, 278, 454);
		add(areaFotoEnemigo);
		
		JButton btnNewButton = new JButton("Salir");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.setBounds(644, 583, 278, 58);
		add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(5, 1, 5, 1, (Color) new Color(0, 0, 0)));
		panel.setBackground(Color.GRAY);
		panel.setBounds(114, 662, 1306, 192);
		add(panel);
		
		JButton atacar = new JButton("Atacar");
		atacar.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		JButton defenderse = new JButton("Defenderse");
		
		defenderse.setFont(new Font("Tahoma", Font.BOLD, 32));
		JButton btnCurarse = new JButton("Curarse");
		btnCurarse.setFont(new Font("Tahoma", Font.BOLD, 32));
		
		for(int c=0;c<arma.size();c++) {
			nombrearmas.add(c,arma.get(c).getNombre());
		}
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(nombrearmas.toArray()));
		
		
		JComboBox curacion = new JComboBox();
		JLabel lblimagenarmas = new JLabel("");
		lblimagenarmas.setHorizontalTextPosition(SwingConstants.CENTER);
		lblimagenarmas.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel curarselbl = new JLabel("");
		curarselbl.setHorizontalTextPosition(SwingConstants.CENTER);
		curarselbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		JTextPane InformacionArmas = new JTextPane();
		InformacionArmas.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(atacar, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
						.addComponent(defenderse, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
						.addComponent(btnCurarse, GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
					.addGap(49)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblimagenarmas, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
						.addComponent(comboBox, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(curacion, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
						.addComponent(curarselbl, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(InformacionArmas, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(InformacionArmas, GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
								.addComponent(curacion, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addComponent(curarselbl, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblimagenarmas, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(atacar)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(defenderse, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnCurarse)))
					.addGap(18))
		);
		panel.setLayout(gl_panel);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPane.setForeground(Color.WHITE);
		textPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 10));
		textPane.setBackground(Color.GRAY);
		textPane.setBounds(644, 21, 278, 553);
		add(textPane);
		if(v.getMapa().isCombates()==false) {
			System.out.println(enemigomazmorra[id].getNombre());
		}else{
			
		}
		
		JLabel nombreJugador = new JLabel(v.getPersonaje().getNombre());
		nombreJugador.setForeground(Color.YELLOW);
		nombreJugador.setFont(new Font("Tahoma", Font.BOLD, 20));
		nombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		nombreJugador.setBounds(114, 585, 278, 30);
		add(nombreJugador);
		

		JLabel jugador = new JLabel();
		jugador.setIcon(new ImageIcon(PanelCombate.class.getResource("/Imagenes/personakepeleas.png")));
		jugador.setBounds(114, 21, 278, 553);
		add(jugador);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelCombate.class.getResource("/Imagenes/fondoCasa.jpg")));
		label.setBounds(0, 0, 1600, 900);
		add(label);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(vidaenemigos.getValue()<=0||v.getPersonaje().getVida()<=0) {
				v.cargaPantallaMapaCombatesAl();
				v.getMapa().ponerVida(v);
				ajustes=false;
				}
			}
		});
		
		atacar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(v.getMapa().isCombates()==false) {
				combateFuncion(v,enemigomazmorra,vidaenemigos,vidaJugador,textPane,x,v.getMapa().getIdmazmorras(),v.getMapa().getMazmorra(),btnNewButton);
				}else{	
				combateAleatorio(v,enemigos,vidaenemigos,vidaJugador,textPane,x,v.getMapa().getIdmazmorras(),btnNewButton);
				}
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x=arma.get(comboBox.getSelectedIndex());
				lblimagenarmas.setIcon(new ImageIcon(PanelCombate.class.getResource(x.getUrls())));
				InformacionArmas.setText("Nombre :"+x.getNombre()
						+ "\nDaño:"+x.getDaño()
						+ "\nDurabilidad:"+x.getDuravilidad()
						+ "\nDescripcion:"+x.getDescripcion());
				}
		});
		defenderse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(v.getMapa().isCombates()==false) {
				v.getPersonaje().setVida((v.getPersonaje().getVida()-enemigomazmorra[id].getDaño())+5);
				vidaJugador.setValue(v.getPersonaje().getVida());
				textPane.replaceSelection(v.getPersonaje().getNombre()+" se ha defendido y ah recibido "+(enemigomazmorra[id].getDaño()-5)+"\n");	
				}else {
				v.getPersonaje().setVida((v.getPersonaje().getVida()-enemigos[id].getDaño())+5);
				vidaJugador.setValue(v.getPersonaje().getVida());
				textPane.replaceSelection(v.getPersonaje().getNombre()+" seha defendido y ah recibido "+(enemigos[id].getDaño()-5)+"\n");
				}
	
			}
		});
		
	}
	//Funcion Combate de Mazmorras
	public void combateFuncion(Ventana v,Enemigos[] enemigo1,JProgressBar vidaenemigo,JProgressBar vidaJugador,JTextPane textPane,Armas x,int id,Mazmorras[]maz,JButton botonsalir) {
		Random ram=new Random();
		if(v.getPersonaje().getVida()>0&&enemigo1[id].getVida()>0) {
		if(ram.nextInt(100)>30) {
			v.getPersonaje().setVida(v.getPersonaje().getVida()-enemigo1[id].getDaño());
			enemigo1[id].setVida(enemigo1[id].getVida()-v.getPersonaje().getDaño()+x.getDaño());
			vidaenemigo.setValue(enemigo1[id].getVida());
			vidaJugador.setValue(v.getPersonaje().getVida());
			System.out.println(enemigo1[id].getVida());
			textPane.replaceSelection(enemigo1[id].getNombre()+" ha recibido "+(v.getPersonaje().getDaño()+x.getDaño())+"\n");
		}else{
			enemigo1[id].setVida(enemigo1[id].getVida()-v.getPersonaje().getDaño()+50);
			vidaenemigo.setValue(enemigo1[id].getVida());
			textPane.replaceSelection("El enemigo se ha defendido y ha perdido "+(v.getPersonaje().getDaño()-50+x.getDaño())+" de vida"+"\n");
		}
		if(enemigo1[id].getVida()<=0) {
			textPane.replaceSelection("Has ganado "+enemigo1[id].getExperiencia()+" de experiencia");
			v.getPersonaje().setExperiencia(v.getPersonaje().getExperiencia()+enemigo1[id].getExperiencia());
			maz[id].setCompletada(true);
			
			FileWriter ficheroEscribir = null;

                try {
					ficheroEscribir = new FileWriter("mazmorrascompletadas.txt");
				    // Escribimos linea a linea en el fichero

                    ficheroEscribir.write("La mazmorra: "+maz[id].getNombre()+"\n"+
                                          "Ha sido completada por: "+v.getPersonaje().getNombre());

                ficheroEscribir.close();
			
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}
	}
	//Funcion declarar enemigos
	public void setEnemigos(Enemigos[]enemigo){
		Enemigos enemigo2=new Enemigos("Sanguinario Joven",4200,50,"/Imagenes/sanguinario.png",200);
		enemigo[0]=enemigo2;
		Enemigos enemigo3=new Enemigos("Mirelurk",1500,25,"/Imagenes/mairleck.png",90);
		enemigo[1]=enemigo3;
		Enemigos enemigo4=new Enemigos("Tocho-Mosca",450,8,"",10);
		enemigo[2]=enemigo4;
		Enemigos enemigo5=new Enemigos("Supermutante",2000,20,"",120);
		enemigo[3]=enemigo5;
		Enemigos enemigo6=new Enemigos("Rata-Topo",500,10,"",20);
		enemigo[4]=enemigo6;
		this.enemigos=enemigo;
	}
	//Funcion combate aleatorios
	public void combateAleatorio(Ventana v,Enemigos[] enemigo1,JProgressBar vidaenemigo,JProgressBar vidaJugador,JTextPane textPane,Armas x,int id,JButton botonsalir) {
		Random ram=new Random();
		if(v.getPersonaje().getVida()>0&&vidaenemigo.getValue()>0) {
		if(ram.nextInt(100)>30) {
			vidaenemigo.setValue(vidaenemigo.getValue()-(v.getPersonaje().getDaño()+x.getDaño()));
			textPane.replaceSelection(enemigo1[id].getNombre()+" ha recibido "+(v.getPersonaje().getDaño()+x.getDaño())+"\n");
			v.getPersonaje().setVida(v.getPersonaje().getVida()-enemigo1[id].getDaño());
			vidaJugador.setValue(v.getPersonaje().getVida());
		}else{
			System.out.println(vidaenemigo.getValue());
			vidaenemigo.setValue((vidaenemigo.getValue()-((v.getPersonaje().getDaño()+x.getDaño())-50)));
			textPane.replaceSelection("El enemigo se ha defendido y ha perdido "+((v.getPersonaje().getDaño()+x.getDaño())-50)+" de vida"+"\n");
		}
		if(enemigo1[id].getVida()<=0) {
			textPane.replaceSelection("Has ganado "+enemigo1[id].getExperiencia()+" de experiencia");
			v.getPersonaje().setExperiencia(v.getPersonaje().getExperiencia()+enemigo1[id].getExperiencia());
			}
		}
	}
	public Enemigos[] getEnemigomazmorra() {
		return enemigomazmorra;
	}
	public void setEnemigomazmorra(Enemigos[] enemigomazmorra) {
		Enemigos enemigo1=new Enemigos("Necrofago Harris",600,15,"/Imagenes/harris.png",50);
		enemigomazmorra[0]=enemigo1;
		this.enemigomazmorra = enemigomazmorra;
	}
	public JLabel crearLabels(Ventana v,int num,Enemigos[]enemigos) {
		JLabel imagenenemigo = new JLabel("");
		if(v.getMapa().isCombates()==false) {
		imagenenemigo.setIcon(new ImageIcon(PanelCombate.class.getResource(enemigomazmorra[num].getRutaimagen())));
		}else {
		imagenenemigo.setIcon(new ImageIcon(PanelCombate.class.getResource(enemigos[num].getRutaimagen())));
		}
		imagenenemigo.setBounds(1142, 21, 278, 553);
		imagenenemigo.setVisible(true);
		imagenenemigo.repaint();
		imagenenemigo.revalidate();
		areaFotoEnemigo.removeAll();
		areaFotoEnemigo.setOpaque(false);
		areaFotoEnemigo.add(imagenenemigo);
		areaFotoEnemigo.setVisible(true);
		
		return imagenenemigo;
	}
	public void crearNombre(Ventana v,int num,Enemigos[]enemigos) {
		JLabel nombrenemigo = new JLabel("");
		System.out.println(v.getMapa().isCombates());
		if(v.getMapa().isCombates()==false) {
			nombrenemigo.setText(enemigomazmorra[num].getNombre());
			}else {
			nombrenemigo.setText(enemigos[num].getNombre());
			}
		nombrenemigo.setForeground(Color.YELLOW);
		nombrenemigo.setFont(new Font("Tahoma", Font.BOLD, 20));
		nombrenemigo.setHorizontalAlignment(SwingConstants.CENTER);
		nombrenemigo.setVisible(true);
		nombrenemy.removeAll();
		nombrenemy.setOpaque(false);
		nombrenemy.add(nombrenemigo);
	}
	public void modificarBarravida(Ventana v,int num,Enemigos[]enemigos) {
		vidaenemigos=new JProgressBar();
		if(v.getMapa().isCombates()==false){
		vidaenemigos.setMaximum(enemigomazmorra[id].getVida());
		vidaenemigos.setValue(enemigomazmorra[num].getVida());
		}else {
		vidaenemigos.setMaximum(enemigos[id].getVida());
		vidaenemigos.setValue(enemigos[num].getVida());
		}
		vidaenemigos.setForeground(Color.RED);
		vidaenemigos.setVisible(true);
		panelVidaEnemy.setOpaque(false);
		vidaenemigos.setStringPainted(true);
		panelVidaEnemy.removeAll();
		panelVidaEnemy.add(vidaenemigos);
		
		
	}
	public void modificarMiVida(Ventana v) {
		vidaJugador=new JProgressBar();
		vidaJugador.setMaximum(v.getPersonaje().getResistencia()*20);
		vidaJugador.setValue(v.getPersonaje().getVida());
		vidaJugador.setForeground(Color.RED);
		vidaJugador.setStringPainted(true);
		vidaJugador.setVisible(true);
		miVida.removeAll();
		miVida.add(vidaJugador);
	}
	public void guardarMazmorra(Mazmorras[]mazmorra) {
		try {
			conn=DriverManager.getConnection(BaseDatos.bdNombre,BaseDatos.bdUsuario,BaseDatos.bdContraseña);
			PreparedStatement loginStatement1=null;
			PreparedStatement statement1=conn.prepareStatement(" TRUNCATE " + " mazmorras ");
			statement1.executeUpdate();
			for(int c=0;c<mazmorra.length;c++) {
				if(mazmorra[c].isCompletada()==false) {
					loginStatement1=conn.prepareStatement(
					      "insert into mazmorras (completada,nombre"
					                        + ") values('"+0+"','"+mazmorra[c].getNombre()+"')");
					loginStatement1.executeUpdate();
				}else {
					loginStatement1=conn.prepareStatement(
				        "insert into mazmorras (completada,nombre"
				                        + ") values('"+1+"','"+mazmorra[c].getNombre()+"')");
					loginStatement1.executeUpdate();
				}
				
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}
}



