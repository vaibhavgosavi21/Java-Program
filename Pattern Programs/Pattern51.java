class Pattern51 
{
	public static void main(String[] args)		//WRONG CODE
	{
		int evendiff = 7;
		int odddiff = 1;
		int n = 4;
		for (int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
			int temp = i;
			for (int j=2;j<=n;j++)
			{
				if(j%2==0){
					temp += evendiff;
					System.out.print(temp+" ");
				}
				else{
					temp += odddiff;
					System.out.print(temp+" ");
				}
				System.out.println();
				evendiff -= 2;
				odddiff += 1;
			}
		}
	}
}
