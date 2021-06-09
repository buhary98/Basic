import java.util.Scanner;
public class SquareAreaDemo 
{
	public static void main (String[] args)
	{
		System.out.println("Enter Side of Square:");
 		Scanner s = new Scanner(System.in);
 		double side = s.nextDouble();
 		double area = side*side; 
		System.out.println("Area of Square is: "+area);
	}
}
