import java.util.Scanner;
class ReverseString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str = sc.next();
		//String rev ="";
		/*for (int i=0;i<str.length();i++)			//METHOD 1
			rev = str.charAt(i) + rev;*/

		/*for (int i=str.length()-1;i>=0;i--)		//METHOD 2
			rev += str.charAt(i);*/
		//System.out.println(rev);

		StringBuffer rev = new StringBuffer(str);	//METHOD 3
		System.out.println(rev.reverse());		
	}
}
