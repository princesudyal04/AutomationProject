package Day7;

public class classC implements Interface1 
{
	public void abc()                  //with body method
	{
		System.out.println("Body given to abstract method abc");
	}
	public void xyz()
	{
		System.out.println("Body given to abstract method xyz");
	}
	
	public static void main(String[] args) 
	{
		classC obj=new classC();
		obj.abc();
		obj.xyz();
	}
	
}
