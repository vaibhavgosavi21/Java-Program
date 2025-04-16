import java.util.Scanner;
class PrimeNumBetweenRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number From");
		int num1 = sc.nextInt();
		System.out.print("Enter the Number Till");
		int num2 = sc.nextInt();
		

		for (int i= num1;i<=num2 ;i++ )           // this loop is for the range i.e eg   11-20
		{
			boolean flag = true;
			for(int j=2; j<i; j++ )              /*this loop is for the range 2 till the number 						    
												i.e ( 12(i) comes in this loop and that number is % by every number from 2(j) till 11(j) (i<j i.e 11) )*/
			{
				if(i % j == 0 )
					flag = false;
			}
			if(flag)
			{
				System.out.print(i+" ");
			}
		}
	}
	
}