import java.util.Scanner;
class VowelFinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next().toUpperCase();
		for(int i = 0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				System.out.print(ch+" ");
		}
	}
}
