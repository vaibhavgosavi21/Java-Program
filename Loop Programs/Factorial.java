import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		int fact = 1;

		for (int i=num;i>=1;i--)
			fact *= i;
		System.out.println(fact);
	}
}
    