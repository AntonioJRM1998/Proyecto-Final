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
		setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JButton btnNewButton = new JButton("");
		add(btnNewButton, "4, 4, 12, 7");
		
		JButton button = new JButton("");
		add(button, "16, 4, 11, 7");
		
		JButton button_2 = new JButton("");
		add(button_2, "27, 4, 13, 7");
		
		JButton button_4 = new JButton("");
		add(button_4, "40, 4, 11, 7");
		
		JButton button_5 = new JButton("");
		add(button_5, "51, 4, 12, 7");
		
		JButton button_6 = new JButton("");
		add(button_6, "63, 4, 11, 7");
		
		JButton button_7 = new JButton("");
		add(button_7, "74, 4, 12, 7");
		
		JButton button_8 = new JButton("");
		add(button_8, "86, 4, 11, 7");
		
		JButton button_9 = new JButton("");
		add(button_9, "97, 4, 9, 7");
		
		JButton button_1 = new JButton("");
		add(button_1, "108, 10");
		
		JButton button_10 = new JButton("");
		add(button_10, "4, 11, 12, 6");
		
		JButton button_11 = new JButton("");
		add(button_11, "16, 11, 11, 6");
		
		JButton button_12 = new JButton("");
		add(button_12, "27, 11, 13, 6");
		
		JButton button_13 = new JButton("");
		add(button_13, "40, 11, 11, 6");
		
		JButton button_14 = new JButton("");
		add(button_14, "51, 11, 12, 6");
		
		JButton button_15 = new JButton("");
		add(button_15, "63, 11, 11, 6");
		
		JButton button_16 = new JButton("");
		add(button_16, "74, 11, 12, 6");
		
		JButton button_17 = new JButton("");
		add(button_17, "86, 11, 11, 6");
		
		JButton button_18 = new JButton("");
		add(button_18, "97, 11, 9, 6");
		
		JButton button_19 = new JButton("");
		add(button_19, "4, 17, 12, 7");
		
		JButton button_20 = new JButton("");
		add(button_20, "16, 17, 11, 7");
		
		JButton button_21 = new JButton("");
		add(button_21, "27, 17, 13, 7");
		
		JButton button_3 = new JButton("");
		add(button_3, "40, 17, 11, 7");
		
		JButton button_28 = new JButton("");
		add(button_28, "51, 17, 12, 7");
		
		JButton button_32 = new JButton("");
		add(button_32, "63, 17, 11, 7");
		
		JButton button_33 = new JButton("");
		add(button_33, "74, 17, 12, 7");
		
		JButton button_34 = new JButton("");
		add(button_34, "86, 17, 11, 7");
		
		JButton button_35 = new JButton("");
		add(button_35, "97, 17, 9, 7");
		
		JButton button_22 = new JButton("");
		add(button_22, "4, 24, 12, 6");
		
		JButton button_29 = new JButton("");
		add(button_29, "16, 24, 11, 6");
		
		JButton button_30 = new JButton("");
		add(button_30, "27, 24, 13, 6");
		
		JButton button_31 = new JButton("");
		add(button_31, "40, 24, 11, 6");
		
		JButton button_36 = new JButton("");
		add(button_36, "51, 24, 12, 6");
		
		JButton button_37 = new JButton("");
		add(button_37, "63, 24, 11, 6");
		
		JButton button_38 = new JButton("");
		add(button_38, "74, 24, 12, 6");
		
		JButton button_39 = new JButton("");
		add(button_39, "86, 24, 11, 6");
		
		JButton button_40 = new JButton("");
		add(button_40, "97, 24, 9, 6");
		
		JButton button_23 = new JButton("");
		add(button_23, "4, 30, 12, 7");
		
		JButton button_41 = new JButton("");
		add(button_41, "16, 30, 11, 7");
		
		JButton button_42 = new JButton("");
		add(button_42, "27, 30, 13, 7");
		
		JButton button_43 = new JButton("");
		add(button_43, "40, 30, 11, 7");
		
		JButton button_44 = new JButton("");
		add(button_44, "51, 30, 12, 7");
		
		JButton button_45 = new JButton("");
		add(button_45, "63, 30, 11, 7");
		
		JButton button_46 = new JButton("");
		add(button_46, "74, 30, 12, 7");
		
		JButton button_47 = new JButton("");
		add(button_47, "86, 30, 11, 7");
		
		JButton button_48 = new JButton("");
		add(button_48, "97, 30, 9, 7");
		
		JButton button_24 = new JButton("");
		add(button_24, "4, 37, 12, 6");
		
		JButton button_49 = new JButton("");
		add(button_49, "16, 37, 11, 6");
		
		JButton button_50 = new JButton("");
		add(button_50, "27, 37, 13, 6");
		
		JButton button_51 = new JButton("");
		add(button_51, "40, 37, 11, 6");
		
		JButton button_52 = new JButton("");
		add(button_52, "51, 37, 12, 6");
		
		JButton button_53 = new JButton("");
		add(button_53, "63, 37, 11, 6");
		
		JButton button_54 = new JButton("");
		add(button_54, "74, 37, 12, 6");
		
		JButton button_55 = new JButton("");
		add(button_55, "86, 37, 11, 6");
		
		JButton button_56 = new JButton("");
		add(button_56, "97, 37, 9, 6");
		
		JButton button_25 = new JButton("");
		add(button_25, "4, 43, 12, 6");
		
		JButton button_57 = new JButton("");
		add(button_57, "16, 43, 11, 6");
		
		JButton button_58 = new JButton("");
		add(button_58, "27, 43, 13, 6");
		
		JButton button_59 = new JButton("");
		add(button_59, "40, 43, 11, 6");
		
		JButton button_60 = new JButton("");
		add(button_60, "51, 43, 12, 6");
		
		JButton button_61 = new JButton("");
		add(button_61, "63, 43, 11, 6");
		
		JButton button_62 = new JButton("");
		add(button_62, "74, 43, 12, 6");
		
		JButton button_63 = new JButton("");
		add(button_63, "86, 43, 11, 6");
		
		JButton button_64 = new JButton("");
		add(button_64, "97, 43, 9, 6");
		
		JButton button_26 = new JButton("");
		add(button_26, "4, 49, 12, 6");
		
		JButton button_65 = new JButton("");
		add(button_65, "16, 49, 11, 6");
		
		JButton button_66 = new JButton("");
		add(button_66, "27, 49, 13, 6");
		
		JButton button_67 = new JButton("");
		add(button_67, "40, 49, 11, 6");
		
		JButton button_68 = new JButton("");
		add(button_68, "51, 49, 12, 6");
		
		JButton button_69 = new JButton("");
		add(button_69, "63, 49, 11, 6");
		
		JButton button_70 = new JButton("");
		add(button_70, "74, 49, 12, 6");
		
		JButton button_71 = new JButton("");
		add(button_71, "86, 49, 11, 6");
		
		JButton button_72 = new JButton("");
		add(button_72, "97, 49, 9, 6");
		
		JButton button_27 = new JButton("");
		add(button_27, "4, 55, 12, 4");
		
		JButton button_73 = new JButton("");
		add(button_73, "16, 55, 11, 4");
		
		JButton button_74 = new JButton("");
		add(button_74, "27, 55, 13, 4");
		
		JButton button_75 = new JButton("");
		add(button_75, "40, 55, 11, 4");
		
		JButton button_76 = new JButton("");
		add(button_76, "51, 55, 12, 4");
		
		JButton button_77 = new JButton("");
		add(button_77, "63, 55, 11, 4");
		
		JButton button_78 = new JButton("");
		add(button_78, "74, 55, 12, 4");
		
		JButton button_79 = new JButton("");
		add(button_79, "86, 55, 11, 4");
		
		JButton button_80 = new JButton("");
		add(button_80, "97, 55, 9, 4");
	}
}
