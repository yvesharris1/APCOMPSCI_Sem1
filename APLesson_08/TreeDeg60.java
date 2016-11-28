import java.util.Scanner;
public class TreeDeg60
{
	static String word;
	static int stop;
	static int start;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		word = kb.nextLine();
		stop = word.length();
		System.out.println(tree(word, start, stop));
	}
	public static String tree(String word, int start, int stop)
	{
		if (start <= stop)
			System.out.printf()
			start ++;
			tree(word, start, stop);
			
	}
}