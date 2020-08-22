package Day6;

public class overriding2 extends overriding1 
{
//with the help of child class parent class method can be recalled
//Dayanamic polymorphism or Method overriding or Runtime polymorphism
	//We can not override the constructor
	//overriding occur in case of inheritance
	public void airthmatic(int a, int b) 
	{
		int c;
		c=a*b;
		System.out.println("Result is:"+c);
	}
	
	
	public static void main(String[] args) 
	{
	
		overriding2 obj=new overriding2();
		obj.airthmatic(5, 4);
		
	}
	
	
	
}
