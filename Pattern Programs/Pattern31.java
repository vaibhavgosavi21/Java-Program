class Pattern31 
{
	public static void main(String[] args) 
	{
		int n = 0;
		for(int i = 1; i<=5 ;i++)
		{
			n=n+i;
			int b = n;
			for(int j = 1 ; j<=5 ; j++)
			{
				if(j<=i)
				{
					
					System.out.print(n--+" ");
				}
			}
			n=b;
			System.out.println();
		}
	}
}
/*
1 
2 9 
3 8 10 
4 7 11 14
5 6 12 13 15

*/
