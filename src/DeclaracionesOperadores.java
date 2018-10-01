public class DeclaracionesOperadores 
{
	public static void main(String[] args)
	{
		final int a = 5;
		double d = 5;
		int b;
		double e;
		
		b = 7;
		e = 7;
		
		int c = b / a;
		double f = e / d;
		
		System.out.println(c);
		System.out.println(f);	
		
		final double cmApulgadas = 2.54;
		double cm = 6;
		double pulgadas = cm / cmApulgadas;
		
		System.out.println("En " + cm + " cm hay " + pulgadas + " pulgadas.");
	}
}