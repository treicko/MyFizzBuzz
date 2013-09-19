package MyFizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFizzBuzzTest {

	@Test
	public void generaFizzParaNumero3() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.generar(3));
	}
	
	@Test
	public void generarBuzzParaNumero5()
	{
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Buzz", fb.generar(5));
	}
	
	@Test
	public void generarMismoNumeroCuandoNoEsNi3Ni5()
	{
		FizzBuzz fb = new FizzBuzz();
		assertEquals("4", fb.generar(4));
	}

}
