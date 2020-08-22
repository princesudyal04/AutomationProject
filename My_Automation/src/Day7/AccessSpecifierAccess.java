package Day7;

import Day6.AccessSpecifier;

public class AccessSpecifierAccess
{
	public static void main(String[] args) 
	{
			AccessSpecifier ob=new AccessSpecifier();
			ob.Method1();
			// ob.Method2(); //Can't access it outside the package because it is private method
			// ob.Method3(); //Can't access it outside the package because it is Default method
			// ob.Method4(); //Can't access it outside the package because it is Protected method
	}
}
