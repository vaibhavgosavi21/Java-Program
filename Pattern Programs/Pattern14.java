import java.util.Scanner;
class Pattern14 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter the Number: ");
		int n = new Scanner(System.in).nextInt();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(j<n-i)
					System.out.print(" "+" ");
				else
					System.out.print("*"+" ");
			}
			System.out.println();
		}		
	}
}
