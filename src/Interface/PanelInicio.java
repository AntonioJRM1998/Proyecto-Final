package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelInicio extends JPanel {
	private Ventana ventana;
	public PanelInicio(Ventana v) {
		super();
		this.ventana=v;
		setSize(1600,900);
		setLayout(null);
		
		JButton Cargar = new JButton("Cargar Partida");
		Cargar.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		Cargar.setBounds(283, 647, 335, 89);
		add(Cargar);
		
		JButton Iniciar = new JButton("Nueva Partida");
		Iniciar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				ventana.cargaPantallaHabilidades();
			}
		});
		Iniciar.setFont(new Font("Gill Sans Ultra Bold", Font.BOLD, 25));
		Iniciar.setBounds(283, 499, 335, 89);
		add(Iniciar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelInicio.class.getResource("/Imagenes/fallout_new_vegas_gun_art_ranger_desert_98393_1600x900.jpg")));
		lblNewLabel.setBounds(0, 0, 1600, 900);
		add(lblNewLabel);
		setVisible(true);
	}

}
