package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JProgressBar;

import Clases.Armas;
import Clases.Enemigos;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCombate extends JPanel {
	private Ventana ventana;
	private int idenemigo;
	private Enemigos[]arrayenemigos;
	private ArrayList<Armas> arma;
	private Armas x;
	public PanelCombate(Ventana v) {
		super();
		this.ventana=v;
		setSize(1600,900);
		setLayout(null);
		arma=new ArrayList<Armas>(10);
		Enemigos enemigo1=new Enemigos("Necrofago Harris",600,10,"/Imagenes/harris.png",50);
		Enemigos enemigo2=new Enemigos("Sanguinario Joven",1000,50,"",200);
		Armas pistola10m=new Armas("Pistola de 10m",10,1000000,"/Imagenes/pistola10m.png");
		Armas pistola9m=new Armas("Pistola de 9m",5,100,"");
		arma.add(pistola10m);
		arma.add(pistola9m);
		
		JComboBox curacion = new JComboBox();
		curacion.setBounds(359, 223, 182, 30);
		add(curacion);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBounds(359, 21, 182, 30);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elige tu arma",arma.get(0).getNombre(),arma.get(1).getNombre()}));
		add(comboBox);
		
		JLabel lblimagenarmas = new JLabel("");
		lblimagenarmas.setHorizontalTextPosition(SwingConstants.CENTER);
		lblimagenarmas.setHorizontalAlignment(SwingConstants.CENTER);
		lblimagenarmas.setBounds(359, 62, 182, 150);
		add(lblimagenarmas);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(comboBox.getSelectedIndex()>0) {
				x=arma.get(comboBox.getSelectedIndex()-1);
				lblimagenarmas.setIcon(new ImageIcon(PanelCombate.class.getResource(x.getUrls())));
				}else{
					comboBox.setSelectedIndex(0);
				}
				}
		});
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		textPane.setForeground(Color.WHITE);
		textPane.setBorder(new LineBorder(Color.LIGHT_GRAY, 10));
		textPane.setBackground(Color.GRAY);
		textPane.setBounds(551, 21, 278, 553);
		add(textPane);
		
		JLabel nombreEnemigo = new JLabel(enemigo1.getNombre());
		nombreEnemigo.setForeground(Color.YELLOW);
		nombreEnemigo.setFont(new Font("Tahoma", Font.BOLD, 20));
		nombreEnemigo.setHorizontalAlignment(SwingConstants.CENTER);
		nombreEnemigo.setBounds(996, 585, 278, 30);
		add(nombreEnemigo);
		
		JLabel nombreJugador = new JLabel(v.getPersonaje().getNombre());
		nombreJugador.setForeground(Color.YELLOW);
		nombreJugador.setFont(new Font("Tahoma", Font.BOLD, 20));
		nombreJugador.setHorizontalAlignment(SwingConstants.CENTER);
		nombreJugador.setBounds(71, 585, 278, 30);
		add(nombreJugador);
		JButton btnCurarse = new JButton("Curarse");
		btnCurarse.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnCurarse.setBounds(792, 669, 215, 70);
		add(btnCurarse);
		
		JButton defenderse = new JButton("Defenderse");
		defenderse.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		defenderse.setFont(new Font("Tahoma", Font.BOLD, 32));
		defenderse.setBounds(567, 669, 215, 70);
		add(defenderse);
		
		JProgressBar vidaenemigo = new JProgressBar();
		vidaenemigo.setForeground(Color.RED);
		vidaenemigo.setMaximum(enemigo1.getVida());
		vidaenemigo.setBounds(996, 626, 278, 32);
		vidaenemigo.setValue(enemigo1.getVida());
		vidaenemigo.setStringPainted(true);
		add(vidaenemigo);
		
		JProgressBar vidaJugador = new JProgressBar();
		vidaJugador.setForeground(Color.RED);
		vidaJugador.setBounds(71, 626, 278, 32);
		vidaJugador.setMaximum(v.getPersonaje().getResistencia()*20);
		vidaJugador.setValue(v.getPersonaje().getVida());
		vidaJugador.setStringPainted(true);
		add(vidaJugador);
		
		
		JButton atacar = new JButton("Atacar");
		atacar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
					Random ram=new Random();
					if(v.getPersonaje().getVida()>0&&enemigo1.getVida()>0) {
					if(ram.nextInt(100)>30) {
						v.getPersonaje().setVida(v.getPersonaje().getVida()-enemigo1.getDaño());
						enemigo1.setVida(enemigo1.getVida()-v.getPersonaje().getDaño()+x.getDaño());
						vidaenemigo.setValue(enemigo1.getVida());
						vidaJugador.setValue(v.getPersonaje().getVida());
						System.out.println(enemigo1.getVida());
						textPane.replaceSelection(enemigo1.getNombre()+" ha recibido "+(v.getPersonaje().getDaño()+x.getDaño())+"\n");
					}else{
						enemigo1.setVida(enemigo1.getVida()-v.getPersonaje().getDaño()+50);
						vidaenemigo.setValue(enemigo1.getVida());
						textPane.replaceSelection("El enemigo se ha defendido y ha perdido "+(v.getPersonaje().getDaño()-50+x.getDaño())+" de vida"+"\n");
					}
					if(enemigo1.getVida()<=0) {
						textPane.replaceSelection("Has ganado "+enemigo1.getExperiencia()+" de experiencia");
						v.getPersonaje().setExperiencia(v.getPersonaje().getExperiencia()+enemigo1.getExperiencia());
						}
				}
			}
		});
		atacar.setFont(new Font("Tahoma", Font.BOLD, 32));
		atacar.setBounds(342, 669, 215, 70);
		add(atacar);
		
		JLabel imagenenemigo = new JLabel("");
		imagenenemigo.setIcon(new ImageIcon(PanelCombate.class.getResource(enemigo1.getRutaimagen())));
		imagenenemigo.setBounds(996, 21, 278, 553);
		add(imagenenemigo);
		
		
		JLabel jugador = new JLabel("");
		jugador.setIcon(new ImageIcon(PanelCombate.class.getResource("/Imagenes/personakepeleas.png")));
		jugador.setBounds(71, 21, 278, 553);
		add(jugador);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelCombate.class.getResource("/Imagenes/fondoCasa.jpg")));
		label.setBounds(0, 0, 1600, 900);
		add(label);
	}
}
