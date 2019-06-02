package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.border.MatteBorder;

import Clases.BaseDatos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PanelAtributos extends JPanel {
	private Ventana ventana;
	private Connection conn;
	public PanelAtributos(Ventana v) {
		super();
		this.ventana=v;
		this.ventana=v;
		setSize(400,700);
		setLayout(null);
		
		JLabel puntosHabilidad = new JLabel(Integer.toString(v.getAtributos().getPuntosHabilidades()));
		puntosHabilidad.setForeground(Color.RED);
		puntosHabilidad.setFont(new Font("Tahoma", Font.BOLD, 26));
		puntosHabilidad.setBounds(262, 35, 41, 35);
		add(puntosHabilidad);
		
		JLabel lblNewLabel = new JLabel("Puntos de habilidad");
		lblNewLabel.setBounds(21, 36, 207, 36);
		add(lblNewLabel);
		
		JButton aumentoMedicina = new JButton("+");

		aumentoMedicina.setFont(new Font("Tahoma", Font.BOLD, 10));
		aumentoMedicina.setBounds(303, 319, 41, 36);
		add(aumentoMedicina);
		
		JButton aumentoReparacion = new JButton("+");
		aumentoReparacion.setFont(new Font("Tahoma", Font.BOLD, 10));
		aumentoReparacion.setBounds(303, 262, 41, 36);
		add(aumentoReparacion);
		
		JButton aumentoCiencia = new JButton("+");
		aumentoCiencia.setFont(new Font("Tahoma", Font.BOLD, 10));
		aumentoCiencia.setBounds(303, 205, 41, 36);
		add(aumentoCiencia);
		
		JButton aumentoConver = new JButton("+");
		aumentoConver.setFont(new Font("Tahoma", Font.BOLD, 10));
		aumentoConver.setBounds(303, 156, 41, 36);
		add(aumentoConver);
		
		JLabel lblpuntmedicina = new JLabel(Integer.toString(v.getAtributos().getMedicina()));
		lblpuntmedicina.setForeground(Color.RED);
		lblpuntmedicina.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblpuntmedicina.setBounds(262, 318, 41, 35);
		add(lblpuntmedicina);
		
		JLabel lblpuntreparacion = new JLabel(Integer.toString(v.getAtributos().getReparacion()));
		lblpuntreparacion.setForeground(Color.RED);
		lblpuntreparacion.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblpuntreparacion.setBounds(262, 261, 41, 35);
		add(lblpuntreparacion);
		
		JLabel lblpuntciencia = new JLabel(Integer.toString(v.getAtributos().getCiencia()));
		lblpuntciencia.setForeground(Color.RED);
		lblpuntciencia.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblpuntciencia.setBounds(262, 204, 41, 35);
		add(lblpuntciencia);
		
		JLabel label_1 = new JLabel(Integer.toString(v.getAtributos().getConversacion()));
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		label_1.setBounds(262, 155, 41, 35);
		add(label_1);
		
		JLabel lblMedicina = new JLabel("Medicina");
		lblMedicina.setForeground(Color.BLACK);
		lblMedicina.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblMedicina.setBounds(75, 319, 207, 35);
		add(lblMedicina);
		
		JLabel lblReparacion = new JLabel("Reparacion");
		lblReparacion.setForeground(Color.BLACK);
		lblReparacion.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblReparacion.setBounds(75, 261, 207, 35);
		add(lblReparacion);
		
		JLabel lblCiencia = new JLabel("Ciencia");
		lblCiencia.setForeground(Color.BLACK);
		lblCiencia.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblCiencia.setBounds(75, 205, 207, 35);
		add(lblCiencia);
		
		JLabel lblConversacion = new JLabel("Conversacion");
		lblConversacion.setForeground(Color.BLACK);
		lblConversacion.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblConversacion.setBounds(75, 156, 207, 35);
		add(lblConversacion);
		
		JButton button_2 = new JButton("-");
		button_2.setBounds(21, 261, 41, 36);
		add(button_2);
		
		JButton button_3 = new JButton("-");
		button_3.setBounds(21, 318, 41, 36);
		add(button_3);
		
		JButton button = new JButton("-");
		button.setBounds(21, 155, 41, 36);
		add(button);
		
		JButton button_1 = new JButton("-");
		button_1.setBounds(21, 204, 41, 36);
		add(button_1);
		
		JButton aumentoArmas = new JButton("+");
		aumentoArmas.setFont(new Font("Tahoma", Font.BOLD, 9));
		aumentoArmas.setBounds(303, 111, 41, 36);
		add(aumentoArmas);
		
		JButton restarArmas = new JButton("-");
		restarArmas.setBounds(21, 110, 41, 36);
		add(restarArmas);
		
		JLabel label = new JLabel(Integer.toString(v.getAtributos().getArmas()));
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 26));
		label.setBounds(262, 110, 41, 35);
		add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.BOLD, 25));
		textPane.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		textPane.setBounds(21, 388, 358, 234);
		add(textPane);
		
		JLabel lblarmas = new JLabel("Armas");
		lblarmas.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblarmas.setForeground(Color.BLACK);
		lblarmas.setBounds(75, 111, 207, 35);
		add(lblarmas);
		
		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon(PanelAtributos.class.getResource("/Imagenes/fondoAtributos.png")));
		fondo.setBounds(0, 0, 400, 700);
		add(fondo);
		setVisible(true);
		
		aumentoArmas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getPuntosHabilidades()>0) {
					v.getAtributos().setArmas(v.getAtributos().getArmas()+1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()-1);
					label.setText(Integer.toString(v.getAtributos().getArmas()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		restarArmas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getArmas() >v.getPersonaje().getFuerza()*2) {
					v.getAtributos().setArmas(v.getAtributos().getArmas()-1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()+1);
					label.setText(Integer.toString(v.getAtributos().getArmas()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		aumentoConver.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getPuntosHabilidades()>0) {
					v.getAtributos().setConversacion(v.getAtributos().getConversacion()+1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()-1);
					label_1.setText(Integer.toString(v.getAtributos().getConversacion()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getConversacion() >v.getPersonaje().getCarisma()*2) {
					v.getAtributos().setConversacion(v.getAtributos().getConversacion()-1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()+1);
					label_1.setText(Integer.toString(v.getAtributos().getConversacion()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		aumentoCiencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getPuntosHabilidades()>0) {
					v.getAtributos().setCiencia(v.getAtributos().getCiencia()+1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()-1);
					lblpuntciencia.setText(Integer.toString(v.getAtributos().getCiencia()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getCiencia() >v.getPersonaje().getInteligencia()*2) {
					v.getAtributos().setCiencia(v.getAtributos().getCiencia()-1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()+1);
					lblpuntciencia.setText(Integer.toString(v.getAtributos().getCiencia()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		aumentoReparacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getPuntosHabilidades()>0) {
					v.getAtributos().setReparacion(v.getAtributos().getReparacion()+1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()-1);
					lblpuntreparacion.setText(Integer.toString(v.getAtributos().getReparacion()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getReparacion() >v.getPersonaje().getInteligencia()*2) {
					v.getAtributos().setReparacion(v.getAtributos().getReparacion()-1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()+1);
					lblpuntreparacion.setText(Integer.toString(v.getAtributos().getReparacion()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		aumentoMedicina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getPuntosHabilidades()>0) {
					v.getAtributos().setMedicina(v.getAtributos().getMedicina()+1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()-1);
					lblpuntmedicina.setText(Integer.toString(v.getAtributos().getMedicina()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(v.getAtributos().getMedicina() >v.getPersonaje().getInteligencia()*2) {
					v.getAtributos().setMedicina(v.getAtributos().getMedicina()-1);
					v.getAtributos().setPuntosHabilidades(v.getAtributos().getPuntosHabilidades()+1);
					lblpuntmedicina.setText(Integer.toString(v.getAtributos().getMedicina()));
					puntosHabilidad.setText(Integer.toString(v.getAtributos().getPuntosHabilidades()));
				}
			}
		});
		lblarmas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textPane.setText("Con el atributo de armas haras mas daño con cualquier arma que tengas en tus manos, desde un oso de peluche hasta un atomizador de neutrones");
			}
		});
		lblConversacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textPane.setText("Tienes el don de la palabra!!, con este atributo tus precios en el estafador local seran un poco menos estafa");
			}
		});
		lblCiencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textPane.setText("Sabelotodo, con este atributo podras desbloquear ordenadores y desactivar automatrones");
			}
		});
		lblReparacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textPane.setText("El chapuzas!! con este atributo podras reparar tu armas con mas eficiencia");
			}
		});
		lblMedicina.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				textPane.setText("Hora de poner en practica tus conocimiento de biologia de 4º de la eso, con este atributo te curaras mas al descansar");
			}
		});
		
		
	}

	}

