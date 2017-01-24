import java.io.*;
import java.util.Scanner;


public class Exercice34 
{
	public static void main(String [] args)
	{
		String line = null;
		try
		{
			Scanner sc = new Scanner(new File("fichierALire.txt"));
			while (sc.hasNext())
			{
				System.out.println(sc.next());
				
			}
		}
		catch (FileNotFoundException e)
		{
			return;
		}
		
	}
}
