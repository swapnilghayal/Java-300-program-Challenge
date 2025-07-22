public class Counter1
{
	public static void main(String args[])
	{
		int n=5;
		int counter1=1;
		int counter2=n*(n+1)/2;
		
		for(int i=1; i<=n; i++)
		{
		for(int j=i; j>=1; j--)
		{
			System.out.print((char)(counter1+64));
			System.out.print((char)(counter2+96));
			System.out.print("\t");

		counter1++;
		counter2--;
		}
		System.out.println();

		}

	


	}








}