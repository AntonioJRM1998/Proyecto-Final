package Interface;

import javax.swing.JPanel;


import Clases.BaseDatos;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PanelInicio extends JPanel {
	private Ventana ventana;
	private Connection bd;
	private Statement executeStatement;
	public PanelInicio(Ventana v) {
		super();
		this.ventana=v;
		setSize(1600,900);
		setLayout(null);
		
		JButton Cargar = new JButton("Cargar Partida");
		Cargar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				base();
			}
		});
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
	public void base() {
		try {
            bd=DriverManager.getConnection(BaseDatos.bdNombre,BaseDatos.bdUsuario,BaseDatos.bdContraseña);
            executeStatement=bd.createStatement();
            Statement po=bd.createStatement();
            ResultSet mipokemo=po.executeQuery("select * from personaje");
            if(mipokemo.next()) {
            	cargarPersonaje(mipokemo);
            	ventana.cargaPantallaMapaInicio();
            }
            
            
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(ventana, "No se ha podido iniciar la conexion con la base de datos");
            e.printStackTrace();
        }
	}
	public void cargarPersonaje(ResultSet mipokemo){
        try {
			ventana.getPersonaje().setNombre(mipokemo.getString("Nombre"));
	        ventana.getPersonaje().setFuerza(mipokemo.getInt("fuerza"));
	        ventana.getPersonaje().setDaño(mipokemo.getInt("daño"));
	        ventana.getPersonaje().setVida(mipokemo.getInt("vida"));
	        ventana.getPersonaje().setInteligencia(mipokemo.getInt("inteligencia"));
	        ventana.getPersonaje().setCarisma(mipokemo.getInt("carisma"));
	        ventana.getPersonaje().setExperiencia(mipokemo.getInt("experiencia"));
	        ventana.getPersonaje().setNivel(mipokemo.getInt("nivel"));
	        ventana.getPersonaje().setPuntoshabilidades(mipokemo.getInt("puntoshabilidades"));
	        ventana.getPersonaje().setResistencia(mipokemo.getInt("resistencia"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
