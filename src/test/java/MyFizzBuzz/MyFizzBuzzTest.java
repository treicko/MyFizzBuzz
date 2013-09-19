package MyFizzBuzz;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyFizzBuzzTest {

	@Test
	public void generaFizzParaNumero3() {
		FizzBuzz fb = new FizzBuzz();
		assertEquals("Fizz", fb.generar(3));
	}

}
