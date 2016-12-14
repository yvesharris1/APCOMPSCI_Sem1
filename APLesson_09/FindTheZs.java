import java.util.Scanner;
public class FindTheZs
{
	static String [] words = new String[5];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the words...");
		printArray();
		System.out.println("--------");
		System.out.println("Only " + hasZs() + " contains the letter z!");
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter 5 words: ");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
		for(String word : words)
		{
			System.out.println(word);
		}
		
	}
	public static String hasZs()
	{
		String zs = ""; 
		for(String word : words)
		{
			if(word.indexOf("z") >= 0)
			{
				zs += word;
			}
		}
		return zs; 
	}
}