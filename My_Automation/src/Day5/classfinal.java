package Day5;

public final class classfinal  
//if we make a class final it can't be further inherit
//it throws an error that it can't be inherit

{

	//final keyword is used to make constant variable due to which value of a variable can't be changed
	final int a=45;  //final keyword makes it constant and you can't assign value to it
	public static void main(String[] args) 
	{
		classfinal obj=new classfinal();
		//obj.a=34;
		int b=obj.a;
		System.out.println("Print the value of new a"+b);
	}
	
}
