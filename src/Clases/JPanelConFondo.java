package Clases;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
 
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
 
public class JPanelConFondo extends JPanel {
 
    private JLabel imagen;
    
 
    public JPanelConFondo() {
    	this.setBackground(Color.green);
    }
 
    public JPanelConFondo(String nombreImagen) {
        imagen = new JLabel();
        if (nombreImagen != null) {
            imagen.setIcon(new ImageIcon(nombreImagen));
        }
       this.add(imagen);
       this.setVisible(true);
    }
 
 
    public void setImagen(String nombreImagen) {
        /*if (nombreImagen != null) {
            imagen.setIcon(new ImageIcon(nombreImagen));
            this.add(imagen);
        } else {
            imagen = null;
        }
 
        repaint();*/
    }
 
    /*public void setImagen(Image nuevaImagen) {
        imagen = nuevaImagen;
 
        repaint();
    }*/
 
    /* @Override
    public void paint(Graphics g) {
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),
                              this);
 
            setOpaque(false);
        } else {
            setOpaque(true);
        }
 
        super.paint(g);
    }*/
}