import java.util.Scanner;
class FactorsPrime 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int cnt = 0;
		
		for (int i=2;i<(num/2);i++)
			if(num%i==0)
				cnt++;
		System.out.println(cnt==0?num+" is prime":num+" is not a prime");
	}
}