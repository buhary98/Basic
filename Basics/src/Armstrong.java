public class Armstrong 
{
	public static void main(String[] args) 
	{
		int a = 120, b, remainder, result = 0;
		 b = a;
		 while (b != 0)
		 {
			 remainder = b % 10;
			 result += Math.pow(remainder, 3);
			 b /= 10;
		 }
		 if(result == a)
		 System.out.println(a + " is an Armstrong number.");
		 else
		 System.out.println(a + " is not an Armstrong number.");
	}
}
