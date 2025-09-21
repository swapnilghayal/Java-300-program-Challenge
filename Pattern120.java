public class Pattern120
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1; i<=n ; i++)
		{
			for(int j=1; j<=n; j++)
			{
				if( i==j)
				System.out.print("*");
				else
				System.out.print(" ");
				
			
    			for(int i1=1; i1<=n ; i1++)
			{
			for(int j=(n*2)-1; j>=1; j--)
			{
				if( i1==j)
				System.out.print("*");
				else
				System.out.print("-");
				
			}
			System.out.println();

			}

		}

		
		}

	
	}




}