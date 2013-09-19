package MyFizzBuzz;

public class FizzBuzz {
  
	public String generar(int numero) 
	{
		if(numero == 3)
			return "Fizz";
		if(numero == 5)
			return "Buzz";
		return String.valueOf(numero);
	}

}