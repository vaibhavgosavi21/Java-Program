import java.util.Scanner;
class PowerOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
		int result = 1;
		System.out.print("Enter the power: ");
		int pow = sc.nextInt();
		for(int i=0;i<pow;i++)
			result *= num;
		System.out.println("Power of "+num+" is "+result);
	}	
}
