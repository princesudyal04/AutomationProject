package Day3;

public class classF 
{

	//this keyword is used to differentiate between global and local variable if the name is same
	
	int prince;
	public void m1(int prince)
	{
		
		this.prince=prince;
	}
	
	public static void main(String[] args) {
		classF obj=new classF();
	    obj.m1(34);
	    System.out.println(obj.prince);
	}
	
	
}
