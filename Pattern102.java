public class Pattern102

{


	public static void main(String args[])
	{

		int n=5;
		for(int i=n; i>=1; i-- )
		{
			for(int j=1; j<=n; j++)
			{
			if(i % 2== 0)
			System.out.print((char)(i+96));
			else
			System.out.print((char)(i+64));
			
			}
			System.out.println();
		}

	}



}