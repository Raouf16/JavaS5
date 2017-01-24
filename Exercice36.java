package projet_1;

public class Exercice32 
{
	
	private static int getNbDiv(int n)
	{
		int cpt=0;
		for (int i=2;i<= n/2;n++)
		{
			if (n%i==0) cpt++;
		}
		return cpt;
	}
	
	public static void main(String [] args)
	{
		int nbDiv=0,maxDiv=0, maxNbDiv=0;
		for (int i=1;i<=100;i++)
		{
			System.out.println(i);
			nbDiv = getNbDiv(i);
			if (nbDiv > maxNbDiv)
			{
				System.out.println("o");
				maxDiv=i;
				maxNbDiv=nbDiv;
			}
		}
		System.out.println("Plus grand nombre de div: "+maxNbDiv+" le nombre est : "+maxDiv);
	}
}
