package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class PanelCombate extends JPanel {
	public PanelCombate() {
		super();
		setSize(1600,900);
		setLayout(null);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelCombate.class.getResource("/Imagenes/fondoCasa.jpg")));
		label.setBounds(0, 0, 1600, 900);
		add(label);
	}
}
