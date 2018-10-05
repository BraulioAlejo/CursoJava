public class DeclaracionesOperadores 
{
	public static void main(String[] args)
	{
		int a = 5;
		double d = 5;
		
		int b;
		b = 7;
		
		double e = 7, f;	
		
		int c = b / a;
		f = e / d;
		
		System.out.println(c);
		System.out.println(f);	
		
		final double cmApulgadas = 2.54;
		double cm = 6;
		double pulgadas = cm / cmApulgadas;
		
		System.out.println("En " + cm + " cm hay " + pulgadas + " pulgadas.");
	}
}