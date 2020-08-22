package Day7;

import Day6.AccessSpecifier;

public class AccessSpecifierAccess2 extends AccessSpecifier
{
	public static void main(String[] args) 
	{
		AccessSpecifierAccess2 obj = new AccessSpecifierAccess2();
		obj.Method1();
		// ob.Method2(); //Can't access it outside the package because it is private method
		// ob.Method3(); //Can't access it outside the package because it is Default method
		obj.Method4();  //Protected method can access outside the package only in case of it is the sub class(inherited) of main class
	}

}
