public class SortA
{
	public static void main(String[] args) 
	{
		int tam = 11;
		int key;
		int i, j;
		int arr[] = new int[tam];
		
		arr[0] = 3;
		arr[1] = 6;
		arr[2] = 4;
		arr[3] = 8;
		arr[4] = 1;
		arr[5] = 9;
		arr[6] = 2;
		arr[7] = 10;
		arr[8] = 5;
		arr[9] = 11;
		arr[10] = 7;
		
		for(j = 0; j < tam ; j++)
		{
			System.out.print(arr[j] + " ");			
		}
		
		for(j = 1; j < tam; j++)
		{
			key = arr[j];
			i = j - 1;
			while(i > -1 && arr[i] > key) 
			{
				arr[i + 1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
		
		System.out.println();
		for(j = 0; j < tam ; j++)
		{
			System.out.print(arr[j] + " ");			
		}		
	}	
}