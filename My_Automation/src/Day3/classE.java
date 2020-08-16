package Day3;

public class classE 
{
	public void m1()
	{

		System.out.println("I am default method of classE");
	}
	
	public void m2(int a)
	{
		System.out.println("I am 1 parametrized method of classE");
	}
	public void m3(int a, int b)
	{
		System.out.println("I am 2 parametrized method of classE");
		this.m4(1, 2, 3);
		this.m2(1);
		this.m1();
		this.m5(1, 2, 3, 4);
	}
	public void m4(int a, int b,int c)
	{
		System.out.println("I am 3 parametrized method of classE");
	}
	public void m5(int a, int b,int c,int d)
	{
		System.out.println("I am 4 parametrized method of classE");
	}
	
	public static void main(String[] args) {
		classE obj=new classE();
		obj.m3(1, 2);
	
	}
	
	
}
