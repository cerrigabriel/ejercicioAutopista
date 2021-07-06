package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.*;

import java.util.*;

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

	@Test(expected = VehiculoNotFoundException.class)
	public void queAlIntentarRegistrarUnVehiculoQueNoTieneTelepaseLanceUnaExcepcion() throws VehiculoNotFoundException {
		
		Vehiculo autoDeGabi = new Automovil ("AZ001NA", (Integer)50, (Integer)80);
		
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
	
	@Test
	public void queLanceUnaExcepcionAlQuererSacarUnAutoQueNoEstaEnCirculacion() throws VehiculoNotFoundException {
		Vehiculo autoDeGabi = new Automovil ("AZ001NA", (Integer)50, (Integer)80);
		Vehiculo autoDeMati = new Automovil ("MAA001", (Integer)170, (Integer)80);
		Vehiculo autoDeBruno = new Camion ("AAA000", (Integer)170, (Integer)80, (Integer)8);
		Autopista accesoOeste = new Autopista();
		accesoOeste.registrarTelepase((Integer)1, autoDeGabi);
		accesoOeste.registrarTelepase((Integer)2, autoDeBruno);
		accesoOeste.registrarTelepase((Integer)3, autoDeMati);
	
		accesoOeste.ingresarAutopista((Integer)1);
		accesoOeste.ingresarAutopista((Integer)2);
		
		accesoOeste.salirAutopista(autoDeGabi);
		
		assertEquals((Integer)1,accesoOeste.cantidadDeVehiculosENCirculacion());
	}
	
	@Test
	public void queVerifiqueQueSeObtengaUnaListaDeAutosInfractoresOrdenadaPorPatente() throws VehiculoNotFoundException{
		Vehiculo autoDeMati = new Automovil ("MAT001", (Integer)170, (Integer)130);
		Vehiculo autoDeBruno = new Camion ("BRU000", (Integer)170, (Integer)80, (Integer)8);
		Vehiculo autoDeGabi = new Automovil ("GA666BI", (Integer)50, (Integer)130);
		Vehiculo autoDeAgus = new Camion ("AGU000", (Integer)81, (Integer)80, (Integer)8);
		Autopista accesoOeste = new Autopista();
		accesoOeste.registrarTelepase((Integer)1, autoDeGabi);
		accesoOeste.registrarTelepase((Integer)2, autoDeBruno);
		accesoOeste.registrarTelepase((Integer)3, autoDeMati);
		accesoOeste.registrarTelepase((Integer)4, autoDeAgus);
		accesoOeste.ingresarAutopista((Integer)1);
		accesoOeste.ingresarAutopista((Integer)2);
		accesoOeste.ingresarAutopista((Integer)3);
		accesoOeste.ingresarAutopista((Integer)4);
		
		List<Vehiculo> nuevaLista = new LinkedList <Vehiculo>();
		
		nuevaLista.addAll(accesoOeste.obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente());
		
		assertEquals(autoDeAgus, nuevaLista.get(0));
		
		
		
	}
}
