class A
{
	static int count = 0;
	
	A()
	{
		++count;
		System.out.println("Object " + count);
	}
	
}

public class CountObjects
{
	
	public static void main(String args[])
	{
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		
		
	}
	
}