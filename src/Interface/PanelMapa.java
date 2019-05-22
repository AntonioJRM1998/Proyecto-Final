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
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class PanelMapa extends JPanelConFondo implements KeyListener {
	private Ventana ventana;
	private JButton[][] botones;
	private int ancho;
	private int largo;
	public PanelMapa(Ventana v) {
		setSize(1600,900);
		setImagen("/Imagenes/mapa.jpg");
		botones=new JButton[7][7];
		setLayout(new GridLayout(7, 7, 0, 0));
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j]=new BotonesMapa("");
				add(botones[i][j]);
			}
		}
		botones[ancho][largo].setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/iconof.png")));
		botones[ancho][largo].addKeyListener(this);
	}
	public JButton[][] getBotones() {
		return botones;
	}
	public void setBotones(JButton[][] botones) {
		this.botones = botones;
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		JButton [][] botones=this.getBotones();
		int ancho=this.getAncho();
		int largo=this.getLargo();
		if(arg0.getKeyCode()==KeyEvent.VK_W) {
			if(ancho>0) {
			botones[ancho][largo].setIcon(null);
			ancho-=1;
			botones[ancho][largo].setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/iconof.png")));
			this.setAncho(ancho);
			}
		}else{
			if(arg0.getKeyCode()==KeyEvent.VK_S) {
				if(ancho<6) {
				botones[ancho][largo].setIcon(null);
				ancho+=1;
				botones[ancho][largo].setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/iconof.png")));
				this.setAncho(ancho);
				
						
					
				}
			}else {
				if(arg0.getKeyCode()==KeyEvent.VK_D) {
					if(largo<6) {
						botones[ancho][largo].setIcon(null);
						largo+=1;
						botones[ancho][largo].setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/iconof.png")));
						this.setLargo(largo);
						}
			}else {
				if(arg0.getKeyCode()==KeyEvent.VK_A) {
					if(largo>0) {
						botones[ancho][largo].setIcon(null);
						largo-=1;
						botones[ancho][largo].setIcon(new ImageIcon(PanelHabilidades.class.getResource("/Imagenes/iconof.png")));
						this.setLargo(largo);
						}
			}
		
		
		
	}
		}
	}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
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
