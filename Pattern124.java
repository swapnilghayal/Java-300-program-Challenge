public class Pattern124
{
	public static void main(String args[])
	{
		int n=18;
		
				
		for(int i=1;i<=n;i++)
		{
		
				for(int j=n; j>=1; j--)
				if( i==n||i==1||j==i)
				System.out.print("*");
				else
				System.out.print(" ");
				
			
			System.out.println();
		}
		
		
	
	}




}