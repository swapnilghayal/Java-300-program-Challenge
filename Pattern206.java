class Pattern206
{
	public static void main(String args[])
	{
	int n=5;

	for(int i=1; i<=n; i++)
	{
		for(int j=n*2-1,j1=1; j>=1||j1<=n; j--,j1++ )
		if(i==j|| j1==i)
		System.out.print("*");
		else
		System.out.print(" ");
		
		System.out.println();
	}
	}
}