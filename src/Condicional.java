import java.util.*;

public class Condicional 
{
	public static void main(String[] args) 
	{
		int edad;
		
		Scanner entrada = new Scanner(System.in);
		
		edad = entrada.nextInt();
		if (edad < 18)
		{
			System.out.println("Menor edad");
		}
		else
		{
			System.out.println("Mayor edad");
		}
		entrada.close();
	}
}
