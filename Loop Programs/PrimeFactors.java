import java.util.Scanner;
class PrimeFactors
{
	public static void main(String[] args) 
	{
		boolean flag = false;
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		for(int i =2 ; i<num ; i++)
		{
			if(num%i==0)
			{
				for(int j = 2 ;j<i ; j++)
				{
					if(i%j==0)
					{
						flag=true;
					}
				}
				if(!flag)
					System.out.print(i+" ");
			}
		}
	}
}