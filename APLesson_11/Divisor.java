import java.util.Scanner;
public class Divisor
{
	public static void main(String[]args)
	{
		int[][] numbers = new int [4][4];
		Scanner kb = new Scanner(System.in);
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				numbers[i][j] = (int)(Math.random() * 100) + 1;
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Please enter a number: ");
		int divisor = kb.nextInt();
		
		int count = 0;
		for(int i = 0; i < numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length; j++)
			{
				if (numbers[i][j] % 2 == 0)
				{
					count++;
				}
			}
		}
		System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array!");
	}
}