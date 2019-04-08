import java.util.Scanner;

public class Subdivision {
	public static void main (String args[]) 
	{
		float Result,x,y;

		System.out.println("Please enter first number");
		Scanner n1 = new Scanner(System.in);
		x = n1.nextFloat();
		
	
		System.out.println("Please enter your second number");
		Scanner n2 = new Scanner(System.in);
		y = n2.nextFloat();
		 Result = x / y ;
		System.out.printf("Result is "+Result);

	}
}
