public class CalculosMath 
{
	public static void main(String[] args)
	{
		double num1 = 5.85;
		double raiz =  Math.sqrt(9);
		
		int resultado1 = (int) Math.round(num1);
		int resultado2 = Math.round((float)num1);
		int expo = (int) Math.pow(5, 3); 
		
		System.out.println(raiz);	
		System.out.println(resultado1);
		System.out.println(resultado2);
		System.out.println(expo);
	}
}