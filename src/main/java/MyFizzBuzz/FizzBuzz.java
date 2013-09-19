package MyFizzBuzz;

public class FizzBuzz {
  
	private static final String _MENSAJE_BUZZ = "Buzz";
	private static final String _MENSAJE_FIZZ = "Fizz";

	public String generar(int numero) 
	{
		if((numero % 3 == 0)&&(numero % 5 == 0))
			return "FizzBuzz";
		if(numero % 3 == 0)
			return _MENSAJE_FIZZ;
		if(numero % 5 == 0)
			return _MENSAJE_BUZZ;
		return String.valueOf(numero);
	}

}