package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

import Clases.Armas;
import Clases.Enemigos;
import Clases.Mazmorras;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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

public class PanelCombate extends JPanel {
	private Ventana ventana;
	private ArrayList<Armas> arma;
	private Armas x;
	JLabel nombreEnemigo;
	private JPanel areaFotoEnemigo;
	private int cont;
	private Enemigos[]enemigos;
	private Enemigos[]enemigomazmorra;
	private boolean ajustes;
	private int id;
	public PanelCombate(Ventana v) {
		super();
		setEnemigos(enemigos=new Enemigos[5]);
		setEnemigomazmorra(enemigomazmorra=new Enemigos[5]);
		this.ventana=v;
		id=v.getMapa().getIdmazmorras();
		setSize(1600,900);
		setLayout(null);
		arma=new ArrayList<Armas>(10);
		Armas puños=new Armas("Puños",0,10000000,"","Usa tus puños para derrotar a los enemigos");
		Armas pistola10m=new Armas("Pistola de 10m",10,1000000,"/Imagenes/pistola10m.png","Es un arma muy duradera y eficiente producida por Colt Firearms antes de la Gran Guerra. Su diseño simple hace que pueda ser manufacturada con equipamiento básico. La durabilidad, manejo y su diseño simple hacen que sea muy popular entre los habitantes de yermo.");
		Armas pistola9m=new Armas("Pistola de 9m",5,100,"/Imagenes/pistola9mm.png","Pistola mucho mas debil que la de 10mm pero no del todo inutil, puede matar enemigos pequeños como tochomoscas y ratastopo");
		arma.add(puños);
		arma.add(pistola10m);
		arma.add(pistola9m);
		
		areaFotoEnemigo = new JPanel();
		areaFotoEnemigo.setBounds(1038, 103, 291, 401);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setModel(new DefaultComboBoxModel(arma.toArray()));
		
		
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
		
		nombreEnemigo = new JLabel(enemigos[id].getNombre());
		nombreEnemigo.setForeground(Color.YELLOW);
		nombreEnemigo.setFont(new Font("Tahoma", Font.BOLD, 20));
		nombreEnemigo.setHorizontalAlignment(SwingConstants.CENTER);
		nombreEnemigo.setBounds(1142, 585, 278, 30);
		if(v.getMapa().isCombates()==false) {
			nombreEnemigo.setText(enemigomazmorra[id].getNombre());
		}else {
			nombreEnemigo.setText(enemigos[id].getNombre());
		}
		add(nombreEnemigo);
		
		JLabel nombreJugador = new JLabel(v.getPersonaje().getNombre());
		nombreJugador.setForeground(Color.YELLOW);
		nombreJugador.setFont(new Font("Tahoma", Font.BOLD, 20));
		nombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		nombreJugador.setBounds(114, 585, 278, 30);
		add(nombreJugador);
		
		JProgressBar vidaenemigo = new JProgressBar();
		vidaenemigo.setForeground(Color.RED);
		if(v.getMapa().isCombates()==false) {
		vidaenemigo.setMaximum(enemigomazmorra[id].getVida());
		vidaenemigo.setValue(enemigomazmorra[id].getVida());
		}else {
		vidaenemigo.setMaximum(enemigos[id].getVida());
		vidaenemigo.setValue(enemigos[id].getVida());
		}
		vidaenemigo.setBounds(1142, 626, 278, 32);
		vidaenemigo.setStringPainted(true);
		add(vidaenemigo);
		
		JProgressBar vidaJugador = new JProgressBar();
		vidaJugador.setForeground(Color.RED);
		vidaJugador.setBounds(114, 626, 278, 32);
		vidaJugador.setMaximum(v.getPersonaje().getResistencia()*20);
		vidaJugador.setValue(v.getPersonaje().getVida());
		vidaJugador.setStringPainted(true);
		add(vidaJugador);
		

		JLabel jugador = new JLabel();
		jugador.setIcon(new ImageIcon(PanelCombate.class.getResource("/Imagenes/personakepeleas.png")));
		jugador.setBounds(114, 21, 278, 553);
		add(jugador);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelCombate.class.getResource("/Imagenes/fondoCasa.jpg")));
		label.setBounds(0, 0, 1600, 900);
		add(label);
		
		JLabel imagenenemigo = new JLabel("");
		if(v.getMapa().isCombates()==false) {
		imagenenemigo.setIcon(new ImageIcon(PanelCombate.class.getResource(enemigomazmorra[id].getRutaimagen())));
		}else {
		imagenenemigo.setIcon(new ImageIcon(PanelCombate.class.getResource(enemigos[id].getRutaimagen())));	
		}
		imagenenemigo.setBounds(1142, 21, 278, 553);
		imagenenemigo.setVisible(true);
		add(imagenenemigo,2);
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(vidaenemigo.getValue()<=0||v.getPersonaje().getVida()<=0) {
				v.cargaPantallaMapa();
				v.getMapa().ponerVida(v);
				ajustes=false;
				crearLabels(v, id, enemigos).setIcon(new ImageIcon(""));
				}
			}
		});
		
		atacar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(v.getMapa().isCombates()==false) {
				if(ajustes==false) {
				vidaenemigo.setValue(enemigomazmorra[v.getMapa().getIdmazmorras()].getVida());
				nombreEnemigo.setText(enemigomazmorra[v.getMapa().getIdmazmorras()].getNombre());
				ajustes=true;
				}
				combateFuncion(v,enemigomazmorra,vidaenemigo,vidaJugador,textPane,x,v.getMapa().getIdmazmorras(),v.getInformacion().getMazmorra(),btnNewButton);
				}else{
				
				if(ajustes==false) {
					vidaenemigo.setValue(enemigos[v.getMapa().getIdmazmorras()].getVida());
					nombreEnemigo.setText(enemigos[v.getMapa().getIdmazmorras()].getNombre());
					ajustes=true;
					}
				combateAleatorio(v,enemigos,vidaenemigo,vidaJugador,textPane,x,v.getMapa().getIdmazmorras(),btnNewButton);
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
		JLabel nombrenemigo = new JLabel("");
		System.out.println(enemigos[num].getRutaimagen());
		if(v.getMapa().isCombates()==false) {
		imagenenemigo.setIcon(new ImageIcon(PanelCombate.class.getResource(enemigomazmorra[num].getRutaimagen())));
		nombrenemigo.setText(enemigomazmorra[num].getNombre());
		}else {
		imagenenemigo.setIcon(new ImageIcon(PanelCombate.class.getResource(enemigos[num].getRutaimagen())));
		nombrenemigo.setText(enemigos[num].getNombre());
		}
		imagenenemigo.setBounds(1142, 21, 278, 553);
		imagenenemigo.setVisible(true);
		imagenenemigo.repaint();
		imagenenemigo.revalidate();
		areaFotoEnemigo.removeAll();
		nombreEnemigo.removeAll();
		areaFotoEnemigo.setBackground(new Color(200,0,0));
		areaFotoEnemigo.add(imagenenemigo);
		nombreEnemigo.add(nombrenemigo);
		areaFotoEnemigo.setVisible(true);
		
		return imagenenemigo;
	}
}



