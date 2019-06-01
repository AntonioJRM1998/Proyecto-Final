package Clases;

public class Habilidades {
	private int puntosHabilidades;
	private int armas;
	private int conversacion;
	private int ciencia;
	private int medicina;
	private int reparacion;


	public Habilidades() {
		super();
		this.puntosHabilidades =10;
		this.armas = 0;
		this.conversacion = 0;
		this.ciencia = 0;
		this.medicina = 0;
		this.reparacion = 0;
	}

	public int getPuntosHabilidades() {
		return puntosHabilidades;
	}

	public void setPuntosHabilidades(int puntosHabilidades) {
		this.puntosHabilidades = puntosHabilidades;
	}

	public int getConversacion() {
		return conversacion;
	}

	public void setConversacion(int conversacion) {
		this.conversacion = conversacion;
	}

	public int getCiencia() {
		return ciencia;
	}

	public void setCiencia(int ciencia) {
		this.ciencia = ciencia;
	}

	public int getMedicina() {
		return medicina;
	}

	public void setMedicina(int medicina) {
		this.medicina = medicina;
	}

	public int getReparacion() {
		return reparacion;
	}

	public void setReparacion(int reparacion) {
		this.reparacion = reparacion;
	}

	public int getArmas() {
		return armas;
	}

	public void setArmas(int armas) {
		this.armas = armas;
	}
	
	
}
