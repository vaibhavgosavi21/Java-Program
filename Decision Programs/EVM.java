import java.util.Scanner;
class EVM 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int bjp = 0, cng = 0, ss = 0, aap = 0, mns = 0, nota = 0;
		System.out.println("	Welcome		 ");
		System.out.println();
		System.out.print("Enter the population: ");
		int population = sc.nextInt();

		for(int i=1; i<=population; i++)
		{
			System.out.println();
			System.out.println("*****List of parties*****");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. MNS");
			System.out.println("5. AAP");
			System.out.println("6. NOTA");
			System.out.println();

			System.out.print("Enter the option: ");
			int opt = sc.nextInt();
			if(opt>=1 && opt<=6)
			{
				if(opt==1)
				{
					bjp++;
					System.out.println("Ache Din Aayenge");
				}
				if(opt==2)
				{
					cng++;
					System.out.println("Bharat Todo");
				}
				if(opt==3)
				{
					ss++;
					System.out.println("Hum Hai Asli Sena");
				}
				if(opt==4)
				{
					aap++;
					System.out.println("Muje Azad Karo");
				}
				if(opt==5)
				{
					mns++;
					System.out.println("Jay Maharashtra");
				}
				if(opt==6)
				{
					nota++;
					System.out.println("You are an educated person");
				}
			}
			if(!(opt>=1 && opt<=6)){
				i--;
				System.out.println("Invalid Option");
			}
		}
		System.out.println();
		
		if (bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota)
		{
			System.out.println("BJP Has WON The Election By "+bjp+" votes"); 
			return;			
		}
		if (cng>=bjp && cng>=ss && cng>=aap && cng>=mns && cng>=nota)
		{
			System.out.println("Congress Has WON The Election By "+cng+" votes");
			return;
		}
		if (ss>=bjp && ss>=cng && ss>=aap && ss>=mns && ss>=nota)
		{
			System.out.println("Shiv Sena Has WON The Election By "+ss+" votes"); 
			return;
		}
		if (aap>=bjp && aap>=cng && aap>=ss && aap>=mns && aap>=nota)
		{
			System.out.println("AAP Has WON The Election By "+aap+" votes"); 
				return;
		}
		if (mns>=bjp && mns>=cng && mns>=ss && mns>=aap && mns>=nota)
		{
			System.out.println("MNS Has WON The Election By "+mns+" votes");  
			return;
		}
	}
}  
