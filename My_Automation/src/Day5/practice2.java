package Day5;

public class practice2 extends practice 
{
	//single level inheritance

	public void method3() 
	{
		System.out.println("I m method of class 2");
	}
	
	public static void main(String[] args) 
	{
		practice2 obj=new practice2();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}
