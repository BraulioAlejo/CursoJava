public class ManipulaCadenas
{
	public static void main(String[] args)
	{
		String nombre = "Braulio";
		
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("Inicia con: " + nombre.charAt(0));
		System.out.println("Termina con: " + nombre.charAt(nombre.length() -1 ));
		
		nombre = "Adolfo";
		
		System.out.println("Mi nombre es: " + nombre);
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		System.out.println("Inicia con: " + nombre.charAt(0));
		System.out.println("Termina con: " + nombre.charAt(nombre.length() -1 ));
		
		
		String frase = "Hola mundo estoy aprendiendo Java";	
		String fracmentoFrase = frase.substring(29);
		System.out.println(frase);
		System.out.println(fracmentoFrase);
	}
}