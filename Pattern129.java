public class Pattern129
{

	public static void main(String args[])
	{
		int a[]=new int[5];
		a[0]=10;
		a[2]=20;
		a[3]=30;

		for(int i=0; i<=a.length-1; i++)
		System.out.println(a[i]);
		System.out.println("------------");

		for(int i=a.length-1; i>=0; i--)
		System.out.println(a[i]);
	}



}