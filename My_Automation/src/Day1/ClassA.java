package Day1;

public class ClassA 
{
 int a;   // Global variable 
	public void method1()
	{
		//It is a method and access with in the boundary
		System.out.println("Welcome all of you");
	}
	
	public static void main(String[] args) 
	{
		//main method in which object creation has been performed
		// classname refrence_variable= new classname(); "it is syntax of object creation"
		ClassA obj=new ClassA();
		obj.method1();  //method has been called
		obj.a=5;       //value is assign to global variable
		int b= obj.a;
		System.out.println("my fav no. is "+b);
	}
}
