package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelTienda extends JPanel {
	public PanelTienda() {
		setSize(1600,900);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(PanelTienda.class.getResource("/Imagenes/Ciudadela.png")));
		lblNewLabel.setBounds(0, 0, 1600, 900);
		add(lblNewLabel);
		
	}

}
