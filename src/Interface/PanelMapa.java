package Interface;

import javax.swing.JPanel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Clases.JPanelConFondo;

import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JButton;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class PanelMapa extends JPanelConFondo {
	private Ventana ventana;
	public PanelMapa(Ventana v) {
		setSize(1600,900);
		setImagen("/Imagenes/mapa.jpg");
		setLayout(null);
	}
}
