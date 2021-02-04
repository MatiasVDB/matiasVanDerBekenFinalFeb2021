package vanderbekenmatias;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCabina {

	@Test
	public void queVerificaQueCuenteCorrectamenteLaCantidadDeVehiculosQuePaSanPorUnacabina() {
		
		//Preparaci�n
		Vehiculo coche = new Coche("NZD234");
		Vehiculo cocheDos = new Coche("OII349");
		Vehiculo motoUno = new Moto("AXD435");
		Cabina cabina = new Cabina(2000);
		Integer valorEsperado = 2;
		
		//Ejecuci�n
		cabina.pagar(coche);
		cabina.pagar(cocheDos);
		cabina.pagar(motoUno);
	
		
		//Verificaci�n
		assertEquals(valorEsperado, cabina.getContadorCoches());
		
		
		
	}


	@Test
	public void queVerificaQueSeRecaudeCorrectaMenteElPagoDeUnVehiculo() {
		//Preparaci�n
		Vehiculo coche = new Coche("NZD234");
		Vehiculo cocheDos = new Coche("OII349");
		Vehiculo motoUno = new Moto("AXD435");
		Vehiculo motoDos = new Moto("MPD455");
		Cabina cabina = new Cabina(2000);
		Double valorEsperado = 400D;
		
		//Ejecuci�n
		cabina.pagar(coche);
		cabina.pagar(cocheDos);
		cabina.pagar(motoUno);
		cabina.pagar(motoDos);
		cabina.pagar(coche);
		
		//Verificaci�n
		assertEquals(valorEsperado, cabina.getRecaudacion());
		
		
	}

	
}
