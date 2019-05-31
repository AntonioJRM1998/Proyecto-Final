package Interface;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelDescanso extends JPanel {
	Ventana ventana;
	public PanelDescanso(Ventana v){
		super();
		this.ventana=v;
		setSize(400,200);
		setVisible(true);
		setLayout(null);
		
		JButton btnNewButton = new JButton("Dormir");
		btnNewButton.setBounds(98, 133, 208, 38);
		add(btnNewButton);
		
		JLabel horasDormir = new JLabel("");
		horasDormir.setFont(new Font("Tahoma", Font.BOLD, 20));
		horasDormir.setForeground(Color.BLACK);
		horasDormir.setBounds(178, 35, 46, 38);
		add(horasDormir);
		
		JSlider slider = new JSlider();
		slider.setMaximum(24);
		slider.setSize(400, 38);
		slider.setLocation(0, 84);
		slider.setValue(0);
		slider.setPaintTicks(true);
		slider.setInverted(false);
		slider.setMajorTickSpacing(8);
		slider.setMinorTickSpacing(1);
		slider.setOpaque(false);
		slider.setPaintLabels(true);
		add(slider);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelDescanso.class.getResource("/Imagenes/fondodesc.png")));
		label.setBounds(0, 0, 400, 200);
		add(label);
		
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				horasDormir.setText(Integer.toString(slider.getValue()));
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(v.getPersonaje().getVida());
				for(int c=0;c<slider.getValue()*10;c++) {
					if(v.getPersonaje().getVida()<v.getPersonaje().getResistencia()*20) {
					v.getPersonaje().setVida(v.getPersonaje().getVida()+1);
					System.out.println(v.getPersonaje().getVida());
					
				}else{
					JOptionPane.showMessageDialog(getComponentPopupMenu(), "Ya tienes tu vida al maximo");
					break;
				}
					
				}
				v.getMapa().ponerVida(v);
			}
			
		});
		
	}
}
