public class Pattern127
{
	public static void main(String args[])
	{
		int n=5;
		
				
		for(int i=1;i<=n*2-3;i++)
		{
		
				for(int j=1; j<=n*2-3; j++)
				
				if( j==1 || i==1 || j==n*2-3|| i==n*2-3 || j== n-1 || i==n-1 )
				System.out.print("*");
				else
				System.out.print(" ");
				
			
			System.out.println();
		}
		
		
	
	}




}