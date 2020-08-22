package Day6;

public class overloading 
{
	//compile time polymorphism because it is decided at compile time that which method has been recalled
	//static polymorphism or method overloading or compile time polymorphism
	//Yes we can overload the constructor
	//Overloading happen in same class
public void sum(int a, int b) 
{
	int c;
	c=a+b;
	System.out.println("Result is:"+c);
}

public void sum(int a,int b,int c)
{
	int d;
	d=a+b+c;
	System.out.println("Result is:"+d);
}
	public static void main(String[] args) {
		overloading obj= new overloading();
		obj.sum(1, 2);
		obj.sum(1, 2, 3);
	}
}
