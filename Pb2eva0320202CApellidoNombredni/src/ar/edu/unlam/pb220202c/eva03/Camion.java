package ar.edu.unlam.pb220202c.eva03;

public class Camion extends Vehiculo {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los que crean conveniente
	private Integer cantidadDeEjes;
	//el Limite de velociadad para autos es de 80km
	//en caso que supere dicho limite el este sera multado

	public Camion(String patente, Integer velocidadActual, Integer limiteVelocidad, Integer cantidadDeEjes) {
		super(patente, velocidadActual, limiteVelocidad);
		this.setCantidadDeEjes(cantidadDeEjes);
	}

	public Integer getCantidadDeEjes() {
		return cantidadDeEjes;
	}

	public void setCantidadDeEjes(Integer cantidadDeEjes) {
		this.cantidadDeEjes = cantidadDeEjes;
	}

	@Override
	public Boolean enInfraccion() {
		// TODO Auto-generated method stub
		if (this.getVelocidadActual()>this.getLimiteVelocidad()) {
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Vehiculo o) {
		// TODO Auto-generated method stub
		return this.getPatente().compareTo(o.getPatente());
	}

	
}
