public class Pattern104

{


	public static void main(String args[])
	{

		int n=5;
		for (int i = 1; i <= n; i++) 
		{
            
             	for (int j = 1; j <= n - i; j++) 
		{
                System.out.print(i);
           	}
		for (int j = n + i - 1; j <= 5; j++) 
		{
                System.out.print(j);
            	}
		
			System.out.println();
		}

	}



}