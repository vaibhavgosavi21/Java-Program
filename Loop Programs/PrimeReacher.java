import java.util.Scanner;
class PrimeReacher
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");		
		int num = sc.nextInt();
		boolean flag = true;
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag = false;
				num++;
				i = 2;
			}
		}
		System.out.println("num "+num);
	}
}