package Clases;

public class Habilidades {
	private Personaje personaje;
	private int puntosHabilidades;
	private int conversacion;
	private int ciencia;
	private int medicina;
	private int reparacion;
	
	public Habilidades(){
		
		this.ciencia=personaje.getInteligencia()*2;
		this.conversacion=personaje.getCarisma()*2;
		this.medicina=personaje.getInteligencia()*2;
		this.reparacion=personaje.getInteligencia()*2;
	}

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
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
	
}
