import java.util.Scanner;
class SeriesExample 
{
	public static void main(String[] args)//throws InterruptedException
	{
		/*int a = 1;
		for (char ch = 'A';ch<='Z'; ch += a)
		{
			System.out.print(ch+" ");		// A C F J O U
			a++;
		}*/

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String un = sc.next().toUpperCase();
		int len = un.length();
		for (int i=0;i<len;i++)
		{
			System.out.println(un.charAt(i));
			//Thread.sleep(1000);
		}
	}
}
