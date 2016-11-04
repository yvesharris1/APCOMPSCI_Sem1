import java.util.Scanner;
public class Graph_Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		int num = kb.nextInt();
		System.out.println("Please enter the size of the graph table: ");
		int size = kb.nextInt();
		int graph = (4*num)+1;
		
		for(int i= 1; i <= size; i++)
		{
			System.out.printf("* %5s | %5s *\n", i, num*i);
		}
	}
}