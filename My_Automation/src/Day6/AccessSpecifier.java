package Day6;

public class AccessSpecifier 
{
// public,private,default,protected are access specifiers for method
	
	
	public void Method1()
	{
		System.out.println("I am the Public method of MyAutomation Project >>Day 6 package");
	}
	private void Method2()
	{
		System.out.println("I am the Private method of MyAutomation Project >>Day 6 package");
	}
	void Method3()
	{
		System.out.println("I am the Default method of MyAutomation Project >>Day 6 package");
	}
	protected void Method4()
	{
		System.out.println("I am the Protected method of MyAutomation Project >>Day 6 package");
	}
	
	public static void main(String[] args) {
		AccessSpecifier obj=new AccessSpecifier();
		obj.Method1();
		obj.Method2();
		obj.Method3();
		obj.Method4();
	}
}
