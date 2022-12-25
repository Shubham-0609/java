
public class exceptionhandling 
{
public static void main(String[] args) 
{
	int a=10;
	int b=0;
	
	
	try
	{
		int z=a/b;
		System.out.println(z);	
	}
	catch(ArrayIndexOutOfBoundsException aob)
	{
		System.out.println("Catch1");
	}
	catch(ArithmeticException ae)
	{
		System.out.println("Catch2");
	}
	
	finally
	{
		System.out.println("Finally");
		
	}
	
}
}
