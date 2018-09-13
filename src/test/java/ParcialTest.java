import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ParcialTest {

	Operacion operacion;

	@Before
	public void setUp() {
		operacion = new Operacion();
	}
	
	@Test
	public void dosYtresIgualCinco() {
	
		//arrange 
		int a = 2;
		int b = 3; 
		
		//act
		int resultado = operacion.suma(a, b);
		
	
		//assert
		assertEquals(5, resultado);
	}

	
	@Test
	public void ochoYVeinteIgualVenteYOcho() {
	
		//arrange 
		int a = 8;
		int b = 20; 
		
		//act
		int resultado = operacion.suma(a, b);
		
	
		//assert
		assertEquals(28, resultado);
	}
	
	
	@Test
	public void ochoEsPositivo() {
		
		//arrange
		int a = 8;
		
		//act
		boolean resultado = operacion.esPositivo(a);
		
		//assert
		assertEquals(true, resultado);
		
	}
	
	
	@Test
	public void multiplo6_30() {
		
		//arrange
		int a = 6;
		int b = 30;
				
		//act
		boolean resultado = operacion.esMultiplo(a, b);		
		
		//assert
		assertEquals(false, resultado);
	}
	

	@Test
	public void multiplo2_4() {
		
		//arrange
		int a = 2;
		int b = 4;
				
		//act
		boolean resultado = operacion.esMultiplo(a, b);		
		
		//assert
		assertEquals(false, resultado);
	}	
	
}
