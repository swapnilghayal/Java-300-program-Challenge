public class Pattern118
{
	public static void main(String args[])
	{
		int n=16;
		for(int i=1; i<=n-1; i++)
		{
			for(int j=1; j<=(n*2)-3; j++)
			{
				if(i==1 && j>=(n-1))
				{
				System.out.print("*");
				}
				else
				{
				if(j==1 || i==n-1 || j==n-1 )
				System.out.print("*");
     				else
				System.out.print(" ");	
				}	
				
			}
			System.out.println();
		}
			
			for(int i=1; i<n-1; i++)
			{
				for(int j=1; j<=(n*2)-3; j++)
					if(i==n-2 && (j<=n-1))
					{
					System.out.print("*");
					}
					else
					{
					if(j==(n*2)-3||j==n-1)
					System.out.print("*");
					else
					System.out.print(" ");
					}
				System.out.println();
			}


		}
	
	




}