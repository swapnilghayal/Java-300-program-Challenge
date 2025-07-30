public class Pattern117
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=n; i>=1; i--)
		{
			for(int j=n-i+1; j>=1; j--)
			{
				if( i==1 || j==n-i+1 )
				System.out.print("*");
				else
				System.out.print(" ");
				
			}
			System.out.println();

		}
	
	}




}