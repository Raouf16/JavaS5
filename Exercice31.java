
import java.lang.Math;

public class Exercice31 
{
	private static int generateDice()
	{
		return ((int)(Math.random()*6) + 1) ;
	}
	
	private static boolean isSnakeEyes(int d1, int d2)
	{
		return (d1 == 1) && (d2 == 1);
	}
	
	public static void main(String [] args)
	{
		int d1=0, d2=0, cpt=0;

		while (true)
		{
			d1 = generateDice();
			d2 = generateDice();
			cpt++;
			if (isSnakeEyes(d1,d2)) break;
		}
		System.out.println(cpt);
		
	}
}

