package Day3;

public class classC 
{

	public classC() 
	{
		//Default constructor
		System.out.println("I am Default constructor");
	}
	public classC(int a) 
	{
		//1 parameterized constructor
		System.out.println("I am 1 parametrized constructor");
	}
	public classC(int a,int b) 
	{
		//2 parameterized constructor
		System.out.println("I am 2 parametrized constructor");
	}
	public classC(int a, int b, int c) 
	{
		//3 parameterized constructor
		System.out.println("I am 3 parametrized constructor");
	}
	public classC(int a, int b, int c, int d) 
	{
		//4 parameterized constructor
		System.out.println("I am 4 parametrized constructor");
	}
	
	public static void main(String[] args) 
	{
		classC obj= new classC(1,2);
	}
}
