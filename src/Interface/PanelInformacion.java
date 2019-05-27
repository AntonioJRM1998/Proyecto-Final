package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import Clases.Mazmorras;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		
		JButton btnSalir = new JButton("Salir");

		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnSalir.setBounds(1258, 740, 226, 71);
		add(btnSalir);
		
		JButton btwentrar = new JButton("Entrar");
		btwentrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		btwentrar.setFont(new Font("Tahoma", Font.BOLD, 32));
		btwentrar.setBounds(190, 740, 226, 71);
		add(btwentrar);
		
		JTextPane textPane = new JTextPane();
		textPane.setForeground(new Color(255, 255, 224));
		textPane.setFont(new Font("Tahoma", Font.BOLD, 30));
		textPane.setBounds(321, 324, 1046, 230);
		textPane.setOpaque(false);
		textPane.setText(mazmorra[0].getInformacion());
		add(textPane);
		
		JLabel nombre = new JLabel(mazmorra[0].getNombre());
		nombre.setFont(new Font("Tahoma", Font.BOLD, 27));
		nombre.setForeground(new Color(255, 255, 255));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setHorizontalTextPosition(SwingConstants.CENTER);
		nombre.setBounds(465, 173, 780, 62);
		add(nombre);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PanelInformacion.class.getResource("/Imagenes/Informacion mazmorras.jpg")));
		lblNewLabel.setBounds(0, 0, 1600, 900);
		add(lblNewLabel);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.cargaPantallaMapa();
			}
		});
		
	}
	public String textolabel(String texto,int idee,Mazmorras[] mazmorra) {
		texto=mazmorra[idee].getNombre();
				return texto;
		
	}
	public String informacionlbl(String texto,int idee,Mazmorras[]mazmorra) {
		texto=mazmorra[idee].getInformacion();
		return texto;
	}
	
	
}
