package Clases;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelCreacion extends JLabel {
	public LabelCreacion(String texto) {
		setText(texto);
		setForeground(Color.YELLOW);
		setFont(new Font("Sitka Small", Font.PLAIN, 30));
	}
}
