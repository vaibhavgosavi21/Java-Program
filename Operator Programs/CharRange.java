import java.util.Scanner;
class CharRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character: ");
		char ch = sc.next().charAt(0);
		String op = (ch >= 65 && ch <= 90) ? ("The character is Uppercase alphabet"):("The character is not Uppercase alphabet");
		System.out.println(op);
	}
}
