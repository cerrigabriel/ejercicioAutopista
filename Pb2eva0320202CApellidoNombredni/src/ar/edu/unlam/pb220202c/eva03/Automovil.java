package ar.edu.unlam.pb220202c.eva03;

public class Automovil extends Vehiculo{

	
	
	public Automovil(String patente, Integer velocidadActual, Integer limiteVelocidad) {
		super(patente, velocidadActual, limiteVelocidad);
		// TODO Auto-generated constructor stub
	}

	//Si es necesario Utilice herencia o implemente de Interfaces
	//	Se debe crear contructeres getters y Setters y los que crean convenientes
	
	//el Limite de velociadad para autos es de 130km
	//en caso que supere dicho limite el este sera multado

	@Override
	public Boolean enInfraccion() {
		// TODO Auto-generated method stub
		if (this.getVelocidadActual()>this.getLimiteVelocidad()) {
			return true;
		}
		return false;
	}
	
   
	
}
