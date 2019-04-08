import java.util.Scanner;

public class Addition {

	public static void main (String args[]) 
	{
		int Sum,x,y;

		System.out.println("Please enter first number");
		Scanner n1 = new Scanner(System.in);
		x = n1.nextInt();
		
	
		System.out.println("Please enter your second number");
		Scanner n2 = new Scanner(System.in);
		y = n2.nextInt();
		 Sum = x + y ;
		System.out.printf("Result is "+Sum);

	}
}
