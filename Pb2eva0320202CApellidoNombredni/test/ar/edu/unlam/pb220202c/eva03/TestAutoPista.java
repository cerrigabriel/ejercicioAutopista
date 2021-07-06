package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAutoPista {
	
	@Test
	public void queSePuedaRegistrarTelepase () {
		//public Automovil(String patente, Integer velocidadActual, Integer limiteVelocidad) 
		;
		Vehiculo autoDeGabi = new Automovil ("AZ001NA", (Integer)50, (Integer)80);
		
		Autopista accesoOeste = new Autopista();
		Integer telepaseGabi = 001;
		assertTrue(accesoOeste.registrarTelepase(telepaseGabi, autoDeGabi));
		
	}

	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() {
		Vehiculo autoDeMati = new Automovil ("MAA001", (Integer)170, (Integer)80);
		Vehiculo autoDeBruno = new Camion ("AAA000", (Integer)170, (Integer)80, (Integer)8);
	}
	
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
		
	}

	@Test(expected = VehiculoNotFoundException.class)
	public void queAlIntentarRegistrarUnVehiculoQueNoTieneTelepaseLanceUnaExcepcion() throws VehiculoNotFoundException {
		
		Vehiculo autoDeGabi = new Automovil ("AZ001NA", (Integer)50, (Integer)80);
		@SuppressWarnings("unused")
		Vehiculo autoDeMati = new Automovil ("MAA001", (Integer)170, (Integer)80);
		Vehiculo autoDeBruno = new Camion ("AAA000", (Integer)170, (Integer)80, (Integer)8);
		Autopista accesoOeste = new Autopista();
		accesoOeste.registrarTelepase((Integer)1, autoDeGabi);
		accesoOeste.registrarTelepase((Integer)2, autoDeBruno);
		//
		assertFalse(accesoOeste.ingresarAutopista((Integer)3));
		
	}
	@Test
	public void queAlIntentarRegistrarUnVehiculoQueTieneTelepaseNoLanceUnaExcepcion() throws VehiculoNotFoundException {
		Vehiculo autoDeGabi = new Automovil ("AZ001NA", (Integer)50, (Integer)80);
		Vehiculo autoDeMati = new Automovil ("MAA001", (Integer)170, (Integer)80);
		Vehiculo autoDeBruno = new Camion ("AAA000", (Integer)170, (Integer)80, (Integer)8);
		Autopista accesoOeste = new Autopista();
		accesoOeste.registrarTelepase((Integer)1, autoDeGabi);
		accesoOeste.registrarTelepase((Integer)2, autoDeBruno);
		accesoOeste.registrarTelepase((Integer)3, autoDeMati);
		
		assertTrue(accesoOeste.ingresarAutopista((Integer)3));
		
	}
	
}
