import java.util.*;
import javax.swing.*;

public class EntradaSalida
{
	public static void main(String[] args) 
	{
		String nombre, numeroS;
		int edad;
		double numeroD;
		Scanner entrada ;		
		
		nombre = JOptionPane.showInputDialog("nombre: ");
		edad =  Integer.parseInt( JOptionPane.showInputDialog("edad :"));
		
		System.out.println(nombre + ", " + edad);
		
		entrada = new Scanner(System.in);	
		
		nombre = entrada.nextLine();
		edad = entrada.nextInt();
		
		System.out.println(nombre + ", " + edad);			
		
		entrada.close();
		
		numeroS = JOptionPane.showInputDialog("numero");

		numeroD = Double.parseDouble(numeroS);
		
		System.out.printf("%1.4f", numeroD);		
	}
}