package ar.edu.unlam.pb220202c.eva03;

public abstract class Vehiculo implements IMultable {

	//Se debe crear contructeres getters y Setters y loos que crean convenientes
	private String Patente;
	private Integer velocidadActual;
	private Integer limiteVelocidad;

	
	
	public Vehiculo(String patente, Integer velocidadActual, Integer limiteVelocidad) {
		super();
		Patente = patente;
		this.velocidadActual = velocidadActual;
		this.limiteVelocidad = limiteVelocidad;
	}



	public void incrmentarVelocidad(Integer velocidad) {
		this.velocidadActual = velocidad;
	}



	public String getPatente() {
		return Patente;
	}



	public void setPatente(String patente) {
		Patente = patente;
	}



	public Integer getVelocidadActual() {
		return velocidadActual;
	}



	public void setVelocidadActual(Integer velocidadActual) {
		this.velocidadActual = velocidadActual;
	}



	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}



	public void setLimiteVelocidad(Integer limiteVelocidad) {
		this.limiteVelocidad = limiteVelocidad;
	}
	
	
}
