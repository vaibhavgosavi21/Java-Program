import java.util.Scanner;
class PetersonNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		int temp = num;
		int fact = 1;
		int result = 0;
		while(temp>0)
		{
			fact = 1;
			for(int i = 1 ; i<=(temp%10);i++)
				fact*=i;
			result+=fact;
			temp/=10;
		}
		if(num==result)
			System.out.println("Peterson Number : "+result);
		else
			System.out.println("Not An Peterson Number ");
	}
}
