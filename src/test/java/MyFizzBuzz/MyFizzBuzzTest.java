package MyFizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFizzBuzzTest {

	FizzBuzz fb = new FizzBuzz();
	
	@Test
	public void generaFizzParaNumero3() 
	{
		assertEquals("Fizz", fb.generar(3));
	}
	
	@Test
	public void generarBuzzParaNumero5()
	{
		assertEquals("Buzz", fb.generar(5));
	}
	
	@Test
	public void generarMismoNumeroCuandoNoEsNi3Ni5()
	{
		assertEquals("4", fb.generar(4));
	}

}
