import  java.util.Arrays;
class MainClass1
{


	public static void main(String args[])
	{
	
	int a[]={10,20,30,40,50};
	int b[]={11,22,33,44,55,66,77,88};
	int c[]=new int[a.length+b.length];

	for(int i=0; i<a.length; i++)	
	if(i<a.length)
		c[i]=b[i];
	else
		c[i]=b[i-a.length];

	System.out.println(Arrays.toString(c));
	
	
		
	

	}


}