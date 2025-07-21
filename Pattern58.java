public class Pattern58
{
	public static void main(String args[])
	{
		int n=5;
		int counter1=n;
		int counter2=n;
   		
		for(int i=n, i1=1; i>=1 || i1<=n; i--, i1++)
		{
		int c1=counter1;
		int c2=counter2;
		
		for(int j1=n;  j1>=i1;  j1--)
		{
		System.out.print((char)(c1 +64));
		System.out.print((char)(c2 +64));
		System.out.print("\t");
		c1--;
		c2+=j1-1;

		}
		System.out.println();
		counter1+=i-1;
		counter2--;
		}
	}




}