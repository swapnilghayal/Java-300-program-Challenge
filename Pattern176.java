class Pattern176
{
	public static void main(String args[])
	{
	int n=5;
	int count=n;
	
	for(int i=n; i>=1; i--)
	{
	int c=count;
	for(int j=i; j<=n; j++)
	{
	System.out.print(c+"\t");
	c-=j+1;
	}
	System.out.println();
	count+=i-1;
	}
	}
}