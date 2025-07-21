public class Pattern54
{
	public static void main(String args[])
	{
		int n=5;
		int counter1=(n*(n+1)/2);
		int counter2=n*(n+1)/2;
   		
		for(int i=1; i<=n; i++)
		{
		int c1=counter1;
		int c2=counter2;
		
		
		for(int j=i,  j1=n;  j<=n || j1>=i;  j++,j1--)
		{
		System.out.print((char)(c1 +64));
		System.out.print((char)(c2 +64));
		System.out.print("\t");
		c1-=j;
		c2-=j1;

		}
		System.out.println();
		counter1-=i+1;
		counter2--;
		}
	}




}