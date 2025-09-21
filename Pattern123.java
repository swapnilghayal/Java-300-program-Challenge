public class Pattern123
{
	public static void main(String args[])
	{
		int n=5;
		
				
		for(int i=1;i<=n;i++)
		{
		
				for(int j=n; j>=1; j--)
				if( i==1||j==n||j==i)
				System.out.print("*");
				else
				System.out.print(" ");
				
			
			System.out.println();
		}
		
		
	
	}




}