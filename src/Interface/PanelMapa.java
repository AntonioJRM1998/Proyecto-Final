package Interface;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Clases.BotonesMapa;
import Clases.JPanelConFondo;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class PanelMapa extends JPanel {
	private Ventana ventana;
	JPanelConFondo [][] botones;
	private int ancho;
	private int largo;
	public PanelMapa(Ventana v) {
		//super("./src/Imagenes/mapa.jpg");
		this.setLayout(new GridLayout(24,35));
		setSize(1600,900);
		botones=new JPanelConFondo[24][35];
	//	setLayout(new GridLayout(24, 35, 0, 0));
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j]=new JPanelConFondo();
				//botones[i][j].setOpaque(false);
				botones[i][j].setLayout(new CardLayout());
				JLabel f1=new JLabel();
				f1.setIcon(new ImageIcon("./src//Imagenes/titulo.png"));
				botones[i][j].add(f1);
				botones[i][j].setBorder(BorderFactory.createLineBorder(Color.black));
				
				
				add(botones[i][j]);
			}
		}
	botones[3][3].setImagen("/Imagenes/iconof.png");
		//botones[3][3].setOpaque(true);
		botones[ancho][largo].setImagen("/Imagenes/iconof.png");
		//botones[ancho][largo].addKeyListener(this);
		
	
		botones[ancho][largo].addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("pulsada!!");

				((JPanelConFondo)botones[ancho][largo]).setImagen(null);
				int ancho=getAncho();
				int largo=getLargo();
				if(e.getKeyCode()==KeyEvent.VK_W) {
					if(ancho>1) {
					ancho-=1;
					}
				}else{
					if(e.getKeyCode()==KeyEvent.VK_S) {
						if(ancho<botones.length-2) {
						ancho+=1;
							
						}
					}else {
						if(e.getKeyCode()==KeyEvent.VK_D) {
							if(largo<botones[0].length-3) {
								largo+=1;
								
								}
					}else {
						if(e.getKeyCode()==KeyEvent.VK_A) {
							if(largo>1) {
								largo-=1;
								
								}
							
					}
				
				
				
			}
				}
			}
				botones[ancho][largo]= new JPanelConFondo("/Imagenes/iconof.png");
				setLargo(largo);
				setAncho(ancho);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	
	
	
	
	}
	public JPanel[][] getBotones() {
		return botones;
	}
	public void setBotones(JPanelConFondo[][] botones) {
		this.botones = botones;
	}

	
	public void setAncho(int ancho1) {
		this.ancho=ancho1;
	}
	public int getAncho() {
		return ancho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	
}
