package Day6;

public class Datatypes 
{
// known as type casting
	
	public static void main(String[] args) 
	{
		int a=35;
		float f=a;       //implicit conversion
		System.out.println("Print the value of Float F: "+f);
		float b=154.54F;
		int c;
		c=(int)b;        //explicit conversion
		System.out.println("Print the value of Integer a: "+c);
	}
}
