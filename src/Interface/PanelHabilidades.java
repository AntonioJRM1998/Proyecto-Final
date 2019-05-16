package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
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
	private Personaje personaje;
	private Objetos[][]mochila;
	public PanelHabilidades(Ventana v) {
		super();
		this.ventana=v;
		setSize(1600,900);
		setLayout(null);
		personaje=new Personaje("",true,mochila);
		habilidad=new Habilidades();
		
		JLabel dañopuntos = new JLabel(Integer.toString(personaje.getDaño()));
		dañopuntos.setForeground(Color.YELLOW);
		dañopuntos.setFont(new Font("Dialog", Font.PLAIN, 30));
		dañopuntos.setBounds(969, 117, 62, 37);
		add(dañopuntos);
		
		JLabel lblDao = new JLabel("Da\u00F1o:");
		lblDao.setForeground(Color.YELLOW);
		lblDao.setFont(new Font("Dialog", Font.PLAIN, 30));
		lblDao.setBounds(882, 117, 92, 37);
		add(lblDao);
		
		JLabel puntosvidapint = new JLabel(Integer.toString(personaje.getVida()));
		puntosvidapint.setForeground(Color.YELLOW);
		puntosvidapint.setFont(new Font("Dialog", Font.PLAIN, 30));
		puntosvidapint.setBounds(776, 117, 62, 37);
		add(puntosvidapint);
		
		JLabel puntosvida = new JLabel("Puntos de Vida:");
		puntosvida.setForeground(Color.YELLOW);
		puntosvida.setFont(new Font("Dialog", Font.PLAIN, 30));
		puntosvida.setBounds(547, 117, 219, 37);
		add(puntosvida);
		
		JLabel punttospint = new JLabel(Integer.toString(personaje.getPuntoshabilidades()));
		punttospint.setForeground(Color.YELLOW);
		punttospint.setFont(new Font("Dialog", Font.PLAIN, 30));
		punttospint.setBounds(837, 313, 43, 37);
		add(punttospint);
		
		JLabel puntossubir = new JLabel("Puntos:");
		puntossubir.setForeground(Color.YELLOW);
		puntossubir.setFont(new Font("Dialog", Font.PLAIN, 30));
		puntossubir.setBounds(721, 309, 101, 44);
		add(puntossubir);
		
		JLabel carismapunto = new JLabel(Integer.toString(personaje.getCarisma()));
		carismapunto.setForeground(Color.YELLOW);
		carismapunto.setFont(new Font("Dialog", Font.PLAIN, 30));
		carismapunto.setBounds(806, 585, 43, 37);
		add(carismapunto);
		
		JLabel carisma = new JLabel("Carisma:");
		carisma.setForeground(Color.YELLOW);
		carisma.setFont(new Font("Dialog", Font.PLAIN, 30));
		carisma.setBounds(604, 578, 234, 44);
		add(carisma);
		
		
		JLabel resistenciapuntos = new JLabel(Integer.toString(personaje.getResistencia()));
		resistenciapuntos.setForeground(Color.YELLOW);
		resistenciapuntos.setFont(new Font("Dialog", Font.PLAIN, 30));
		resistenciapuntos.setBounds(806, 518, 43, 37);
		add(resistenciapuntos);
		
		JButton mas2 = new JButton("+");
		mas2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(personaje.getPuntoshabilidades()>0&&personaje.getResistencia()<10) {
					personaje.setResistencia(personaje.getResistencia()+1);
					resistenciapuntos.setText(Integer.toString(personaje.getResistencia()));
					personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()-1);
					punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
					personaje.setVida(personaje.getResistencia()*20);
					puntosvidapint.setText(Integer.toString(personaje.getVida()));
					}
			}
		});
		mas2.setToolTipText("");
		mas2.setBounds(856, 505, 50, 50);
		add(mas2);
				
		JLabel resistencia = new JLabel("Resistencia:");
		resistencia.setForeground(Color.YELLOW);
		resistencia.setFont(new Font("Dialog", Font.PLAIN, 30));
		resistencia.setBounds(604, 511, 234, 44);
		add(resistencia);
		
		JButton menos2 = new JButton("-");
		menos2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(personaje.getResistencia()>1) {
					personaje.setResistencia(personaje.getResistencia()-1);
					resistenciapuntos.setText(Integer.toString(personaje.getResistencia()));
					personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
					personaje.setVida(personaje.getResistencia()*20);
					puntosvidapint.setText(Integer.toString(personaje.getVida()));
					
					}
			}
		});
		menos2.setToolTipText("");
		menos2.setBounds(547, 505, 50, 50);
		add(menos2);
		
		JLabel contadorint = new JLabel(Integer.toString(personaje.getInteligencia()));
		contadorint.setForeground(Color.YELLOW);
		contadorint.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		contadorint.setBounds(806, 447, 43, 37);
		add(contadorint);
		
		JButton mas3 = new JButton("+");
		mas3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(personaje.getPuntoshabilidades()>0&&personaje.getCarisma()<10) {
					personaje.setCarisma(personaje.getCarisma()+1);
					carismapunto.setText(Integer.toString(personaje.getCarisma()));
					personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()-1);
					punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
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
				if(personaje.getCarisma()>1) {
					personaje.setCarisma(personaje.getCarisma()-1);
					carismapunto.setText(Integer.toString(personaje.getCarisma()));
					personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
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
				if(personaje.getPuntoshabilidades()>0&&personaje.getInteligencia()<10) {
					personaje.setInteligencia(personaje.getInteligencia()+1);
					contadorint.setText(Integer.toString(personaje.getInteligencia()));
					personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()-1);
					punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
					
					}
			}
		});
		mas_1.setToolTipText("");
		mas_1.setBounds(856, 435, 50, 50);
		add(mas_1);
		
		
		JLabel Inteligencia = new JLabel("Inteligencia:");
		Inteligencia.setForeground(Color.YELLOW);
		Inteligencia.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		Inteligencia.setBounds(604, 441, 234, 44);
		add(Inteligencia);
		
		JButton menos_1 = new JButton("-");
		menos_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(personaje.getInteligencia()>1) {
					personaje.setInteligencia(personaje.getInteligencia()-1);
					contadorint.setText(Integer.toString(personaje.getInteligencia()));
					personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
					
					}
			}
		});
		menos_1.setToolTipText("");
		menos_1.setBounds(547, 435, 50, 50);
		add(menos_1);
		
		JLabel descripcion = new JLabel("");
		descripcion.setBounds(970, 376, 550, 414);
		add(descripcion);
		
		JLabel contadorfuerza = new JLabel(Integer.toString(personaje.getFuerza()));
		contadorfuerza.setForeground(Color.YELLOW);
		contadorfuerza.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		contadorfuerza.setBounds(806, 376, 43, 37);
		add(contadorfuerza);
		
		JButton button = new JButton("+");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(personaje.getPuntoshabilidades()>0&&personaje.getFuerza()<10) {
				personaje.setFuerza(personaje.getFuerza()+1);
				contadorfuerza.setText(Integer.toString(personaje.getFuerza()));
				personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()-1);
				punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
				personaje.setDaño(personaje.getFuerza()*40);
				dañopuntos.setText(Integer.toString(personaje.getDaño()));
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

			}
		});
		fuerza.setForeground(Color.YELLOW);
		fuerza.setFont(new Font("Sitka Small", Font.PLAIN, 30));
		fuerza.setBounds(604, 367, 185, 44);
		add(fuerza);
		
		JButton menos = new JButton("-");
		menos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(personaje.getFuerza()>1) {
					personaje.setFuerza(personaje.getFuerza()-1);
					contadorfuerza.setText(Integer.toString(personaje.getFuerza()));
					personaje.setPuntoshabilidades(personaje.getPuntoshabilidades()+1);
					punttospint.setText(Integer.toString(personaje.getPuntoshabilidades()));
					personaje.setDaño(personaje.getFuerza()*40);
					dañopuntos.setText(Integer.toString(personaje.getDaño()));
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
				personaje.setGenero(false);
			}
		});
		rdbtnFemenino.setBounds(869, 239, 201, 35);
		rdbtnFemenino.setBackground(new Color(0, 153, 0));
		add(rdbtnFemenino);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		rdbtnMasculino.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				personaje.setGenero(true);
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
				personaje.setNombre(camponombre.getText());
				asignarHabilidades(habilidad,personaje);
				imprimeDatos(personaje,habilidad);
				ventana.cargaPantallaMapa();
			}
		});
		startpartida.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 30));
		startpartida.setBounds(524, 663, 422, 44);
		add(startpartida);
		
		JLabel personaje = new JLabel("");
		personaje.setBounds(38, 51, 488, 814);
		personaje.setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/Personaje.png")));
		add(personaje);
		
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
				+ "\nVida:"+personaje.getVida()
				+ "\nInteligencia:"+persona.getInteligencia()
				+ "\nCarisma:"+persona.getCarisma()
				+ "\nResistencia:"+persona.getResistencia()
				+ "\nNivel:"+persona.getNivel()
				+ "\nExperiencia:"+persona.getExperiencia()
				+ "\nDaño:"+persona.getDaño()
				+ "\nPuntos de Habilidad:"+habilidades.getPuntosHabilidades()
				+ "\nArmas:"+habilidades.getArmas()
				+ "\nConversacion:"+habilidades.getConversacion()
				+ "\nCiencia:"+habilidades.getCiencia()
				+ "\nMedicina:"+habilidades.getMedicina()
				+ "\nReparacion:"+habilidades.getReparacion());
		
	}
	public void asignarHabilidades(Habilidades habilidades,Personaje personaje) {
		habilidades.setArmas(personaje.getFuerza()*2);
		habilidades.setCiencia(personaje.getInteligencia()*2);
		habilidades.setConversacion(personaje.getCarisma()*3);
		habilidades.setMedicina(personaje.getInteligencia()*2);
		habilidades.setReparacion(personaje.getInteligencia()*2);
	}
}
