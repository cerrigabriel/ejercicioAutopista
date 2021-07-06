package ar.edu.unlam.pb220202c.eva03;

public abstract class Vehiculo implements IMultable,Comparable<Vehiculo> {

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



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Patente == null) ? 0 : Patente.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Vehiculo other = (Vehiculo) obj;
		if (Patente == null) {
			if (other.Patente != null)
				return false;
		} else if (!Patente.equals(other.Patente))
			return false;
		return true;
	}
	
	
}
