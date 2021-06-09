import java.util.Scanner;
public class AreaOfRectangle 
{
	public static void main (String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		double length = s.nextDouble();
		System.out.println("Enter the width of Rectangle:");
		double width = s.nextDouble();
 		double area = length*width;
		System.out.println("Area of Rectangle is:"+area);
 }
}
