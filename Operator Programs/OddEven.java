import java.util.Scanner;
class OddEven 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the number: ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(num %2 == 0);					//With modulus
		System.out.println((num / 2) == (num / 2.0));		//Without Modulus
		System.out.println(( num / 2) * 2 == num);			//Without Modulus
		
		System.out.println(num/2.0);
		System.out.println(num/2);
	}
}
