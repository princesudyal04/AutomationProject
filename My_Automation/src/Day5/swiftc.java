package Day5;

public class swiftc extends marutic
{
public swiftc() 
{
	System.out.println("Default constructor of child swiftc");
}
public swiftc(int a) 
{
	System.out.println("1 Parameterize constructor of child swiftc");
}
public swiftc(int a,int b) 
{
	this(1,2,3);
	System.out.println("2 Parameterize constructor of child swiftc");
}
public swiftc(int a,int b,int c) 
{
	super();
	System.out.println("3 Parameterize constructor of child swiftc");
}
	public static void main(String[] args) 
	{
		swiftc obj=new swiftc(1,2);
	}
}
