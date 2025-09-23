class MaxLast
{
	public static void main(String args[])
	{
	int a[]={123,435,5487,99887,2548,87};
	for(int i=0; i<=a.length(); i++)
	{
		int temp=a[i];
		int max=0;
		int sum=0;
		while(temp !=0)
		{
		sum=temp%10;
		if(max<sum)
		max=sum;
		sum=temp/10;
		}
	}
	System.out.println(max[i])
	}
}