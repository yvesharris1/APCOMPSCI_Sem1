import java.util.Scanner;
public class Count_by_X
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num1 = kb.nextInt();
		System.out.println("Please enter iterating value: ");
		int yves = kb.nextInt();
		
		for(int i = 1; i <= num1; i+=yves)
		{
			System.out.print("\t" + i);
		}
	}
}