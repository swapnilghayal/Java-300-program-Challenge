class Pattern197
{

	public static void main(String args[])
	{
	int n=9;
	
	for(int i=n; i>=1; i--)
	{
		for(int j=i; j<n; j++)
		System.out.print(" ");

		for(int j=1; j<=i*2-1; j++)	
		System.out.print(i);
		
		System.out.println();
		}
		
	for(int i=2; i<=n; i++)
	{
	
	for(int j=i; j<n; j++)
	System.out.print(" ");

	for(int j=1; j<=(i*2)-1; j++)
	System.out.print(i);
	System.out.println();
	}
		
		
			
		
	
	}

}