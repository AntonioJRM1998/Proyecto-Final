package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class PanelAtributos extends JPanel {
	private Ventana ventana;
	public PanelAtributos(Ventana v) {
		super();
		this.ventana=v;
		setSize(400,700);
		setLayout(null);
		
		JButton aumentoArmas = new JButton("-");
		aumentoArmas.setBounds(303, 111, 41, 36);
		add(aumentoArmas);
		
		JButton restarArmas = new JButton("-");
		restarArmas.setBounds(21, 110, 41, 36);
		add(restarArmas);
		
		JLabel label = new JLabel(Integer.toString(v.getAtributos().getArmas()));
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.BOLD, 26));
		label.setBounds(238, 111, 66, 35);
		add(label);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(21, 445, 358, 234);
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
	}
	}

