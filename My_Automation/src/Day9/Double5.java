package Day9;

public class Double5 
{
	public static void main(String[] args) 
	{
		int b=5;
		for(int i=1; i<=5;i++)
		{
			for (int j=1; j<=b; j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			b--;
		}
	}
	
}
