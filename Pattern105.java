public class Pattern105

{


	public static void main(String args[])
	{

		int n=5;
		for(int i=1; i<=n; i++ )
		{
			for(int j=1; j<=n; j++)
			{
			if(i % 2== 0)
				
			System.out.print((char)(i/2+64));
			else
			System.out.print("1");
			
			}
			System.out.println();
		}

	}



}