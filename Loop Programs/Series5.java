import java.util.Scanner;
class Series5
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Range: ");
		int range = new Scanner(System.in).nextInt();
		int res = 0 ,fact = 1;
		for(int i = 1 ; i<=range;i++)
		{
			fact = 1;
			for(int j= 1 ; j<=i ; j++)
			{
				fact*=j;
			}
			res +=fact;
			System.out.print(res+" ");
		}
	}
}
