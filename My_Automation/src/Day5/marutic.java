package Day5;

public class marutic 
{

	public marutic() 
	{
		this(1,2,3);
		System.out.println("default constructor of Marutic class");
	}
	
	public marutic(int a) 
	{
		System.out.println("1 Parametrize constructor of Marutic class");
	}
	public marutic(int a,int b) 
	{
		System.out.println("2 Parametrize constructor of Marutic class");
	}
	public marutic(int a, int b, int c) 
	{
		this(1);
		System.out.println("3 Parametrizeconstructor of Marutic class");
	}
	
}
