class Demo3 extends Demo2
{
	int a=1000;
	void display()
	{
	
	int a=100;
	System.out.println("demo 3 class called " + this.a);	
	}

	Demo3()
	{
	this(10);
	System.out.println("default const of demo3 called");
	}

	Demo3(int a)
	{

	System.out.println("para const of demo3 called");

	}
}