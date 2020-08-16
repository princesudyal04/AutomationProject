package Day3;

public class classD 
{
	public classD() 
	{
		//Default constructor
		this(1,3,4);
		System.out.println("I am Default constructor");
	}
	public classD(int a) 
	{
		//1 parameterized constructor
		System.out.println("I am 1 parametrized constructor");
	}
	public classD(int a,int b) 
	{
		//2 parameterized constructor
		this();
		System.out.println("I am 2 parametrized constructor");
	}
	public classD(int a, int b, int c) 
	{
		//3 parameterized constructor
		this(1,2,3,4);
		System.out.println("I am 3 parametrized constructor");
	}
	public classD(int a, int b, int c, int d) 
	{
		//4 parameterized constructor
		this(1);
		System.out.println("I am 4 parametrized constructor");
	}
	
	public static void main(String[] args) 
	{
		classD obj= new classD(1,2);
	}	
	
}
