import java.util.Scanner;
class SumByLoop  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int dup = num;
		int sum = 0;

		while(num>0)
		{
			int rem = num%10;
			sum += rem;
			

			/*if(rem%2==0){		//SUM OF EVEN DIGITS
				sum += rem;
			}*


			if(rem%2!=0){		//SUM OF ODD DIGITS
				sum += rem;
			}*/
			num /= 10;
		}
		System.out.println(sum);
		System.out.println(dup);
	}
}
