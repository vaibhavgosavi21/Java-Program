class EvenNumbers 
{
	public static void main(String[] args) 
	{
		/*for (int i=1; i<=100; i++ )		//METHOD 1 for EVEN numbers
		{
			if(i%2==0)
				System.out.print(i+" ");
		}

		for (int i=2; i<=100; i+=2 )		//METHOD 2 for EVEN numbers
		{
			System.out.print(i+" ");
		}*/

		for (int i=100; i>=1; i--)			//METHOD 1 for ODD numbers
		{
			if(i%2 != 0)
				System.out.print(i+" ");
		}
		System.out.println();
		for (int i=99; i>=1; i-=2 )		//METHOD 2 for ODD numbers
		{
			System.out.print(i+" ");
		}
	}
}
