public class Pattern55
{
	public static void main(String args[])
	{
		int n=5;
		int counter1=n;
		int counter2=n*(n+1)/2;
   		
		for(int i=n; i>=1; i--)
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
		c1-=j+1;
		c2+=j;

		}
		System.out.println();
		counter1+=i-1;
		counter2-=i;
		}
	}




}