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
	
	@Test
	public void generarFizzParaMultiplosDe3()
	{
		assertEquals("Fizz", fb.generar(9));
	}
	
	@Test
	public void generarBuzzParaMultiplosDe5()
	{
		assertEquals("Buzz", fb.generar(25));
	}
	
	@Test
	public void generarFizzBuzzPara15()
	{
		assertEquals("FizzBuzz", fb.generar(15));
	}
	
	@Test
	public void generarFizzBuzzParaMultiplosDe5YMultiplosDe3()
	{
		assertEquals("FizzBuzz", fb.generar(30));
	}

}
