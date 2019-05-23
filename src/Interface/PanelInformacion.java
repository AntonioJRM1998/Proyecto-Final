package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;

import Clases.Mazmorras;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;

public class PanelInformacion extends JPanel {
	private Ventana ventana;
	private Mazmorras[]mazmorra;
	public PanelInformacion(Ventana v){
		super();
		this.ventana=v;
		setVisible(true);
		setSize(1600,900);
		setLayout(null);
		mazmorra=ventana.getMazmorra();
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(255, 255, 224));
		textPane.setFont(new Font("Tahoma", Font.BOLD, 30));
		textPane.setBounds(321, 324, 1046, 230);
		textPane.setOpaque(false);
		textPane.setText(mazmorra[0].getInformacion());
		add(textPane);
		
		JLabel nombre = new JLabel("");
		nombre.setFont(new Font("Tahoma", Font.BOLD, 27));
		nombre.setForeground(new Color(255, 255, 255));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setHorizontalTextPosition(SwingConstants.CENTER);
		nombre.setText(mazmorra[0].getNombre());
		nombre.setBounds(465, 173, 780, 62);
		add(nombre);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PanelInformacion.class.getResource("/Imagenes/Informacion mazmorras.jpg")));
		lblNewLabel.setBounds(0, 0, 1600, 900);
		add(lblNewLabel);
	}
}
