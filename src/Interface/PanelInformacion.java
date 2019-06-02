package Interface;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

import javax.swing.JDesktopPane;

public class PanelInformacion extends JPanel {
	private Ventana ventana;
	private Mazmorras[]mazmorra;
	private JTextPane textPane;
	private JPanel panelInfo;
	private JLabel nombre;
	public int id;
	public PanelInformacion(Ventana v){
		super();
		this.ventana=v;
		mazmorra=new Mazmorras[2];
		mazmorra=v.getMapa().getMazmorra();
		setVisible(true);
		setSize(1600,900);
		setLayout(null);
		
		panelInfo = new JPanel();
		panelInfo.setBounds(0, 0, 1600, 900);
		add(panelInfo);
		panelInfo.setLayout(null);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 32));
		btnSalir.setBounds(1258, 740, 226, 71);
		add(btnSalir);
		
		JButton btwentrar = new JButton("Entrar");
		btwentrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(mazmorra[v.getMapa().getIdmazmorras()].isCompletada()==false) {
				v.cargaPantallaCombate();
				ventana.cargaPantallaCombateAleatorio();
				v.getCombate().crearLabels(v,v.getMapa().getIdmazmorras(),v.getMapa().getEnemigos());
				v.getCombate().crearNombre(v,v.getMapa().getIdmazmorras(),v.getMapa().getEnemigos());
				v.getCombate().modificarBarravida(v,v.getMapa().getIdmazmorras(),v.getMapa().getEnemigos());
				v.getCombate().modificarMiVida(v);
			}else{
				JOptionPane.showMessageDialog(getComponentPopupMenu(), "Esta mazmorra ya ha sido completada");
			}
		}
	});
		btwentrar.setFont(new Font("Tahoma", Font.BOLD, 32));
		btwentrar.setBounds(141, 740, 226, 71);
		add(btwentrar);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(PanelInformacion.class.getResource("/Imagenes/Informacion mazmorras.jpg")));
		lblNewLabel.setBounds(0, 0, 1600, 900);
		add(lblNewLabel);
		
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ventana.cargaPantallaMapaInformacion();
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setInformacion(Mazmorras[]maz) {
		this.mazmorra=maz;
	}
	public Mazmorras[] getMazmorra() {
		return mazmorra;
	}
	public void pantallaInformacion(Ventana v) {
		textPane=new JTextPane();
		textPane.setForeground(new Color(255, 255, 224));
		textPane.setText(mazmorra[v.getMapa().getIdmazmorras()].getInformacion());
		textPane.setFont(new Font("Tahoma", Font.BOLD, 30));
		textPane.setBounds(321, 324, 1046, 230);
		textPane.setOpaque(false);
		nombre = new JLabel(mazmorra[v.getMapa().getIdmazmorras()].getNombre());
		nombre.setFont(new Font("Tahoma", Font.BOLD, 27));
		nombre.setForeground(new Color(255, 255, 255));
		nombre.setHorizontalAlignment(SwingConstants.CENTER);
		nombre.setHorizontalTextPosition(SwingConstants.CENTER);
		nombre.setBounds(465, 173, 780, 62);
		panelInfo.setOpaque(false);
		panelInfo.removeAll();
		panelInfo.add(nombre);
		panelInfo.add(textPane);
	}
}
