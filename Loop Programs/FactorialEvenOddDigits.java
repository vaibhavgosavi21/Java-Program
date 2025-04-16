import java.util.Scanner;
class FactorialEvenOddDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		int sumEven = 0;
		int sumOdd = 0;
		int sum = 0;
		while(num>0)
		{
			int rem = num % 10;
			int fact = 1;
			if(rem%2==0){
				for(int i=1;i<=rem;i++)
					fact*=i;
				sumEven += fact;
			}
			if(rem%2!=0){
				for(int j=1;j<=rem;j++)
					fact*=j;
				sumOdd += fact;
			}
			num /= 10;
			sum += fact;
			
		}
		System.out.println("Sum of factorials: "+sum);
		System.out.println("Sum of Even Factorials: "+sumEven);
		System.out.println("Sum of Odd Factorials: "+sumOdd);
	}
}
