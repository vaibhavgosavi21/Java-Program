import java.util.Scanner;
class GoodPrime 
{
	public static void main(String[] args) 
	{
		/*Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");			//METHOD 1
		int n = sc.nextInt();
		int cnt = 0;
		for(int i=2;i<=n;i++)
		{
			boolean flag = true;
			for(int j=2;j*j<=i;j++){
				if((i%j)==0){
					flag = false;
					break;
				}
			}
			if(flag){
				int num = i;
				boolean flag1 = true;

				while(num>0){
					int rem = num%10;
					if(rem != 2 && rem != 3 && rem != 5 && rem != 7){
						flag1 = false;
						break;
					}
					num/=10;
				}
				if(flag1)
					cnt++;
			}
		}
		System.out.println("Count of Good Prime NUmbers from 1 to "+n+" is "+cnt);*/


		int range = 50;						//METHOD 2
		for (int k=1;k<=range;k++)
		{
			int num = k;
			boolean flag = true;
			if(num<2)
				flag = false;
			for (int i=2;i<num;i++)
			{
				if(num%i==0){
					flag = false;
					break;
				}
			}
			if(flag){
				int prime = num;
				if(prime>9){
					boolean flag1= true;
					outerloop:
					for (int i=prime;i>0;i/=10)
					{
						int dgt = i%10;
						if(dgt<2){
							flag1=false;
							break outerloop;
						}
						for (int m=2;m<dgt;m++)
						{
							if(dgt%m==0){
								flag1 = false;
								break outerloop;
							}
						}
					}
					if(flag1)
						System.out.print(prime+" ");
				}
				else
					System.out.print(prime+" ");
			}
		}
	}
}
