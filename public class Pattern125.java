public class Pattern125
{
	public static void main(String args[])
	{
		int n=12;
		
				
		for(int i=1;i<=n;i++)
		{
		
				for(int j=n; j>=1; j--)
				if( j==n||j==1||j==i)
				System.out.print("*");
				else
				System.out.print(" ");
				
			
			System.out.println();
		}
		
		
	
	}




}