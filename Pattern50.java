public class Pattern50
{
	public static void main(String args[])
	{	
		int n=5;
		for(int i=n; i>=1; i--)
		{	
			for(int j=i; j>n; j--)
			{
			 System.out.print(" ");
			}
			for(int j=5; j>=i; j--)
			{
				System.out.print(j);
			}
			System.out.println();

		}		
	


	}






}