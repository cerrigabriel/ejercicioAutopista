package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	//Si es necesario Utilice herencia o implemente de Interfaces
	//Se debe crear contructeres getters y Setters y los atributos o metodos que crean convenientes
	private HashMap <Integer,Vehiculo> telepase;
	private HashSet <Vehiculo> vehiculosEnCirculacion;
	
	public Autopista(){
		telepase = new HashMap<Integer, Vehiculo>();
		vehiculosEnCirculacion = new HashSet<Vehiculo>();
	}
	
	public Boolean registrarTelepase (Integer numeroTelpase, Vehiculo vehiculo) {
	
		this.telepase.put(numeroTelpase, vehiculo);
		return true;
	}
	
	public Boolean ingresarAutopista (Integer numeroTelepase) throws VehiculoNotFoundException {
		//si el telepase no esta registrado lanza una Exception del tipo VehiculoNotFoundException
	    // y no permite ingresar al autopista	
		Vehiculo aIngresar = telepase.get(numeroTelepase);
		if(aIngresar != null) {
			vehiculosEnCirculacion.add(aIngresar);
			return true;
		}
		
		throw new VehiculoNotFoundException();
		
	}
	
	public void salirAutpista (Vehiculo vehiculo) {
		//lanza Una exception VehiculoNotFounException si no esta en circulacion
		
	}
	
	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente(){
	
	return null;
    }

	public Integer cantidadDeVehiculosENCirculacion() {
	
		return 0;
}
	}
