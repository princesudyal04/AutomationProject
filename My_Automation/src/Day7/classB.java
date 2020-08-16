package Day7;

public class classB extends classA  //responsibility of this class is to give body of abstract method
{

public void xyz() 
{	

	System.out.println("Body given by child class");
}
public static void main(String[] args) 
{
	classB obj=new classB();  //we can't create object for abstract class
	obj.abc();
	obj.xyz();
}
}
