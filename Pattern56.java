public class Pattern56
{
	public static void main(String args[])
	{
		int n=5;
		int counter1=n*(n+1)/2;
		int counter2=1;
   		
		for(int i=n, i1=1; i>=1 || i1<=n; i--, i1++)
		{
		int c1=counter1;
		int c2=counter2;
		
		for(int j=i; j>1; j--)
		{
		System.out.print("\t");
		}
		for(int j=i;  j<=n;  j++)
		{
		System.out.print((char)(c1 +64));
		System.out.print((char)(c2 +64));
		System.out.print("\t");
		c1+=j;
		c2--;

		}
		System.out.println();
		counter1-=i;
		counter2+=i1+1;
		}
	}




}