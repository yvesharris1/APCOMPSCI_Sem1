import java.util.Scanner;
public class ReplaceAts
{
	static int number;
	static int rev = 0;
	static String sentence;

	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a sentence: ");
		sentence = kb.nextLine();
		replace();
		System.out.println(sentence);
	}
	public static void replace()
	{
		while(sentence.indexOf("a") >= 0)
		{
			sentence = sentence.substring(0, sentence.indexOf("a"))+ "@" + sentence.substring(sentence.indexOf("a") +1);
		}
	}
}