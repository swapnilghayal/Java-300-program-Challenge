public class Pattern15
{


	public static void main(String args[])
	{
		int n=5;
		int count=(n*(n-1)/2)+1;
		for(int i=n;  i>=1; i--)
		{
		  int c=count;

			for(int j=i; j<n; j++)
			{
			System.out.print("\t");
			}	
			for(int j=i; j>=1; j--)
			{
			System.out.print((char)(c+64)+"\t");
			c++;			
			}
			System.out.println();
			count-=i-1;
			}

	

	}











}