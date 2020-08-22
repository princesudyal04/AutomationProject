package Day6;

public class AccessSpecifierAccess 
{
public static void main(String[] args) 
{
		AccessSpecifier ob=new AccessSpecifier();
		ob.Method1();
		// ob.Method2(); //Can't access this because it is private method and can not access outside the class
		ob.Method3();
		ob.Method4();
}
}
