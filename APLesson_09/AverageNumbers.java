public class AverageNumbers
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) +1;
		}
		System.out.println("Numbers... ");
		
		for(int num : numbers)
		System.out.println(num + " ");
		System.out.println("--------");
		System.out.println("The average of the numbers above is...... " + average(numbers));

	}
	public static int average(int[] n)
	{
		int average = 0;
		for(int num : n)
		{
			average += num % 10;
		}
		return average;
	}
}