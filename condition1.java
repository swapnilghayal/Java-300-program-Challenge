public class condition1
{

	public static void main(String args[])
	{
	
		int a=20;
		int b=40;
		int c=50;

		if(a>b)
			if(a>c)
				System.out.println("a is greater");
		else 
			System.out.println("c is greater");
		
		if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");

	}



}