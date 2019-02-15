public class Arreglo 
{
	int tam;
	int arr[];
	
	public Arreglo(int tam)
	{
		arr = new int[tam];
		this.tam = tam;
		for(int i = 0; i < tam; i++)
		{
			arr[i]	= (int) (Math.random() * tam ) + 1;
			
		}
	}
	
	public void OrdenaSrtA()
	{
		int key;
		
		for(int j = 1; j < tam; j++)
		{
			key = arr[j];
			int i = j - 1;
			while(i > -1 && arr[i] > key) 
			{
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}	
	}
	
	public void Muestra()
	{
		for(int i = 0; i < tam ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("");
	}

}
