package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import Clases.Habilidades;
import Clases.Objetos;
import Clases.Personaje;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHabilidades extends JPanel {
	private Ventana ventana;
	private Habilidades habilidad;
	private JTextField camponombre;
	public PanelHabilidades(Ventana v) {
		super();
		this.ventana=v;
		setSize(1600,900);
		setLayout(null);
		habilidad=new Habilidades();
		
		JLabel descripcion = new JLabel("");
		descripcion.setBounds(1184, 335, 395, 544);
		add(descripcion);
		
		JLabel da�opuntos = new JLabel(Integer.toString(ventana.getPersonaje().getDa�o()));
		da�opuntos.setForeground(Color.YELLOW);
		da�opuntos.setFont(new Font("Dialog", Font.PLAIN, 30));
		da�opuntos.setBounds(969, 117, 62, 37);
		add(da�opuntos);
		
		JLabel lblDao = new JLabel("Da\u00F1o:");
		lblDao.setForeground(Color.YELLOW);
		lblDao.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblDao.setBounds(882, 117, 92, 37);
		add(lblDao);
		
		JLabel puntosvidapint = new JLabel(Integer.toString(ventana.getPersonaje().getVida()));
		puntosvidapint.setForeground(Color.YELLOW);
		puntosvidapint.setFont(new Font("Dialog", Font.PLAIN, 30));
		puntosvidapint.setBounds(776, 117, 62, 37);
		add(puntosvidapint);
		
		JLabel puntosvida = new JLabel("Puntos de Vida:");
		puntosvida.setForeground(Color.YELLOW);
		puntosvida.setFont(new Font("Dialog", Font.PLAIN, 30));
		puntosvida.setBounds(547, 117, 219, 37);
		add(puntosvida);
		
		JLabel punttospint = new JLabel(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
		punttospint.setForeground(Color.YELLOW);
		punttospint.setFont(new Font("Dialog", Font.PLAIN, 30));
		punttospint.setBounds(837, 313, 43, 37);
		add(punttospint);
		
		JLabel puntossubir = new JLabel("Puntos:");
		puntossubir.setForeground(Color.YELLOW);
		puntossubir.setFont(new Font("Dialog", Font.PLAIN, 30));
		puntossubir.setBounds(721, 309, 101, 44);
		add(puntossubir);
		
		JLabel carismapunto = new JLabel(Integer.toString(ventana.getPersonaje().getCarisma()));
		carismapunto.setForeground(Color.YELLOW);
		carismapunto.setFont(new Font("Dialog", Font.PLAIN, 30));
		carismapunto.setBounds(806, 585, 43, 37);
		add(carismapunto);
		
		JLabel carisma = new JLabel("Carisma:");
		carisma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/Carisma1.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("")));
			}
		});
		carisma.setForeground(Color.YELLOW);
		carisma.setFont(new Font("Dialog", Font.PLAIN, 30));
		carisma.setBounds(604, 578, 245, 44);
		add(carisma);
		
		
		JLabel resistenciapuntos = new JLabel(Integer.toString(ventana.getPersonaje().getResistencia()));
		resistenciapuntos.setForeground(Color.YELLOW);
		resistenciapuntos.setFont(new Font("Dialog", Font.PLAIN, 30));
		resistenciapuntos.setBounds(806, 518, 43, 37);
		add(resistenciapuntos);
		
		JButton mas2 = new JButton("+");
		mas2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ventana.getPersonaje().getPuntoshabilidades()>0&&ventana.getPersonaje().getResistencia()<10) {
					ventana.getPersonaje().setResistencia(ventana.getPersonaje().getResistencia()+1);
					resistenciapuntos.setText(Integer.toString(ventana.getPersonaje().getResistencia()));
					ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()-1);
					punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
					ventana.getPersonaje().setVida(ventana.getPersonaje().getResistencia()*20);
					puntosvidapint.setText(Integer.toString(ventana.getPersonaje().getVida()));
					}
			}
		});
		mas2.setToolTipText("");
		mas2.setBounds(856, 505, 50, 50);
		add(mas2);
				
		JLabel resistencia = new JLabel("Resistencia:");
		resistencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/Resistencia1.jpg")));
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("")));
			}
		});
		resistencia.setForeground(Color.YELLOW);
		resistencia.setFont(new Font("Dialog", Font.PLAIN, 30));
		resistencia.setBounds(604, 511, 245, 44);
		add(resistencia);
		
		JButton menos2 = new JButton("-");
		menos2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ventana.getPersonaje().getResistencia()>1) {
					ventana.getPersonaje().setResistencia(ventana.getPersonaje().getResistencia()-1);
					resistenciapuntos.setText(Integer.toString(ventana.getPersonaje().getResistencia()));
					ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
					ventana.getPersonaje().setVida(ventana.getPersonaje().getResistencia()*20);
					puntosvidapint.setText(Integer.toString(ventana.getPersonaje().getVida()));
					
					}
			}
		});
		menos2.setToolTipText("");
		menos2.setBounds(547, 505, 50, 50);
		add(menos2);
		
		JLabel contadorint = new JLabel(Integer.toString(ventana.getPersonaje().getInteligencia()));
		contadorint.setForeground(Color.YELLOW);
		contadorint.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		contadorint.setBounds(806, 447, 43, 37);
		add(contadorint);
		
		JButton mas3 = new JButton("+");
		mas3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ventana.getPersonaje().getPuntoshabilidades()>0&&ventana.getPersonaje().getCarisma()<10) {
					ventana.getPersonaje().setCarisma(ventana.getPersonaje().getCarisma()+1);
					carismapunto.setText(Integer.toString(ventana.getPersonaje().getCarisma()));
					ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()-1);
					punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
					}	
			}
		});
		mas3.setToolTipText("");
		mas3.setBounds(856, 572, 50, 50);
		add(mas3);
		
		JButton menos3 = new JButton("-");
		menos3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ventana.getPersonaje().getCarisma()>1) {
					ventana.getPersonaje().setCarisma(ventana.getPersonaje().getCarisma()-1);
					carismapunto.setText(Integer.toString(ventana.getPersonaje().getCarisma()));
					ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
					}	
			}
			});
		menos3.setToolTipText("");
		menos3.setBounds(547, 572, 50, 50);
		add(menos3);
		
		JButton mas_1 = new JButton("+");
		mas_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ventana.getPersonaje().getPuntoshabilidades()>0&&ventana.getPersonaje().getInteligencia()<10) {
					ventana.getPersonaje().setInteligencia(ventana.getPersonaje().getInteligencia()+1);
					contadorint.setText(Integer.toString(ventana.getPersonaje().getInteligencia()));
					ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()-1);
					punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
				
					}
			}
		});
		mas_1.setToolTipText("");
		mas_1.setBounds(856, 435, 50, 50);
		add(mas_1);
		
		
		JLabel Inteligencia = new JLabel("Inteligencia:");
		Inteligencia.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/Inteligencia1.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("")));
			}
		});
		Inteligencia.setForeground(Color.YELLOW);
		Inteligencia.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		Inteligencia.setBounds(604, 441, 245, 44);
		add(Inteligencia);
		
		JButton menos_1 = new JButton("-");
		menos_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ventana.getPersonaje().getInteligencia()>1) {
					ventana.getPersonaje().setInteligencia(ventana.getPersonaje().getInteligencia()-1);
					contadorint.setText(Integer.toString(ventana.getPersonaje().getInteligencia()));
					ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
					
					}
			}
		});
		menos_1.setToolTipText("");
		menos_1.setBounds(547, 435, 50, 50);
		add(menos_1);
		
		
		JLabel contadorfuerza = new JLabel(Integer.toString(ventana.getPersonaje().getFuerza()));
		contadorfuerza.setForeground(Color.YELLOW);
		contadorfuerza.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		contadorfuerza.setBounds(806, 376, 43, 37);
		add(contadorfuerza);
		
		JButton button = new JButton("+");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(ventana.getPersonaje().getPuntoshabilidades()>0&&ventana.getPersonaje().getFuerza()<10) {
				ventana.getPersonaje().setFuerza(ventana.getPersonaje().getFuerza()+1);
				contadorfuerza.setText(Integer.toString(ventana.getPersonaje().getFuerza()));
				ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()-1);
				punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
				ventana.getPersonaje().setDa�o(ventana.getPersonaje().getFuerza()*40);
				da�opuntos.setText(Integer.toString(ventana.getPersonaje().getDa�o()));
				}
			}
		});
		button.setToolTipText("");
		button.setBounds(856, 364, 50, 50);
		add(button);
		
		
		JLabel fuerza = new JLabel("Fuerza:");
		fuerza.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/Fuerza1.jpg")));
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				descripcion.setIcon(new ImageIcon(PanelHabilidades.class.getResource("")));
			}
		});
		fuerza.setForeground(Color.YELLOW);
		fuerza.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		fuerza.setBounds(604, 367, 245, 44);
		add(fuerza);
		
		JButton menos = new JButton("-");
		menos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(ventana.getPersonaje().getFuerza()>1) {
					ventana.getPersonaje().setFuerza(ventana.getPersonaje().getFuerza()-1);
					contadorfuerza.setText(Integer.toString(ventana.getPersonaje().getFuerza()));
					ventana.getPersonaje().setPuntoshabilidades(ventana.getPersonaje().getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(ventana.getPersonaje().getPuntoshabilidades()));
					ventana.getPersonaje().setDa�o(ventana.getPersonaje().getFuerza()*40);
					da�opuntos.setText(Integer.toString(ventana.getPersonaje().getDa�o()));
					}
				
			}
		});
		menos.setToolTipText("");
		menos.setBounds(547, 364, 50, 50);
		add(menos);
		
		JLabel lblAtributos = new JLabel("Atributos:");
		lblAtributos.setForeground(Color.YELLOW);
		lblAtributos.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		lblAtributos.setBounds(547, 313, 160, 37);
		add(lblAtributos);
		
		JRadioButton rdbtnFemenino = new JRadioButton("Femenino");
		rdbtnFemenino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.getPersonaje().setGenero(false);
			}
		});
		rdbtnFemenino.setBounds(869, 239, 201, 35);
		rdbtnFemenino.setBackground(new Color(0, 153, 0));
		add(rdbtnFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ventana.getPersonaje().setGenero(true);
			}
		});
		rdbtnMasculino.setBounds(672, 239, 186, 35);
		rdbtnMasculino.setBackground(new Color(0, 153, 0));
		add(rdbtnMasculino);
		
		ButtonGroup boton=new ButtonGroup();
		boton.add(rdbtnFemenino);
		boton.add(rdbtnMasculino);
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setBounds(547, 244, 119, 26);
		lblGenero.setForeground(Color.YELLOW);
		lblGenero.setFont(new Font("Dialog", Font.PLAIN, 30));
		add(lblGenero);
		
		camponombre = new JTextField();
		camponombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		camponombre.setForeground(Color.BLACK);
		camponombre.setBounds(672, 191, 186, 32);
		camponombre.setBackground(new Color(0, 102, 0));
		add(camponombre);
		camponombre.setColumns(10);
		
		JLabel nombre = new JLabel("Nombre:");
		nombre.setBounds(547, 197, 119, 26);
		nombre.setFont(new Font("Dialog", Font.PLAIN, 30));
		nombre.setForeground(new Color(255, 255, 0));
		add(nombre);
		
		JButton startpartida = new JButton("Comenzar Partida");
		startpartida.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(ventana.getPersonaje().getPuntoshabilidades()==0&&camponombre.getText().length()>0&&ventana.getPersonaje().getGenero()!=null) {
				ventana.getPersonaje().setNombre(camponombre.getText());
				ventana.cargaPantallaMapa();
				v.getMapa().asignarHabilidades(v.getAtributos());
				}else {
					JOptionPane.showMessageDialog(getParent(), "Faltan campos por rellenar o no has usado todos tus puntos");
				}
			}
		});
		startpartida.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 30));
		startpartida.setBounds(524, 663, 422, 44);
		add(startpartida);
		
		JLabel labelPersonaje = new JLabel("");
		labelPersonaje.setBounds(38, 28, 487, 830);
		labelPersonaje.setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/personaje.png")));
		add(labelPersonaje);
		JLabel fondo = new JLabel("");
		fondo.setBounds(0, 0, 1600, 900);
		fondo.setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/FondoAtributos.jpg")));
		add(fondo);
		
		JLabel genero = new JLabel("");
		genero.setBounds(547, 244, 92, 26);
		add(genero);
	}
	public void imprimeDatos(Personaje persona,Habilidades habilidades) {
		System.out.println("Nombre:"+persona.getNombre()
				+ "\nGenero:"+(persona.getGenero()?"Masculino":"Femenino")
				+ "\nFuerza:"+persona.getFuerza()
				+ "\nVida:"+ventana.getPersonaje().getVida()
				+ "\nInteligencia:"+persona.getInteligencia()
				+ "\nCarisma:"+persona.getCarisma()
				+ "\nResistencia:"+persona.getResistencia()
				+ "\nNivel:"+persona.getNivel()
				+ "\nExperiencia:"+persona.getExperiencia()
				+ "\nDa�o:"+persona.getDa�o()
				+ "\nPuntos de Habilidad:"+habilidades.getPuntosHabilidades()
				+ "\nArmas:"+habilidades.getArmas()
				+ "\nConversacion:"+habilidades.getConversacion()
				+ "\nCiencia:"+habilidades.getCiencia()
				+ "\nMedicina:"+habilidades.getMedicina()
				+ "\nReparacion:"+habilidades.getReparacion());
		
	}

}
