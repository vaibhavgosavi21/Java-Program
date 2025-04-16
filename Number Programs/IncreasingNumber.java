import java.util.Scanner;
class IncreasingNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		int lastDigit = 10;
		boolean flag = true;
		for (int i=n;i>0;i/=10){
			int rem = i%10;
			if(rem>=lastDigit){
				flag = false;
				System.out.print(n+" is not an Increasing Number");
				break;
			}	
			lastDigit = rem;
		}
		if(flag)
			System.out.println(n+" is an Increasing Number");
	}
}
