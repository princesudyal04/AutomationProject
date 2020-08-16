package Day2;

public class classB
{

	//parameterized methods
	public int sum(int a,int b)
	{
		//with return integer value
		int c= a+b;
		return c;
	}
	
	public int sub(int a,int b)
	{
		//with return integer value
		int c= a-b;
		return c;
	}
	public void mul(int a,int b)
	{
		//does not return anything because method is void
		int c= a*b;
		System.out.println("The result of the expression (10+2)(10-2) is: "+c);
	}
	
	public static void main(String[] args) {
		classB obj=new classB();
		int x =obj.sum(10, 2);
		int y=obj.sub(10, 2);
		obj.mul(x, y);
	}
	
}
