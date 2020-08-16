package Day5;

public class swift extends maruti 
{

	public void m3()
	{
		super.m3(22);
		System.out.println("Method 1 of child class");
	}
	public void m4()
	{
		System.out.println("Method 2 of child class");
	}
	
	public static void main(String[] args) 
	{
		swift obj=new swift();
		maruti ob=new maruti();
		obj.m3();
		ob.m1();
	}
}
