public class GetOdds
{
	static int [] numbers = new int[10];
	public static void main(String[]args)
	{
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("--------");
		System.out.println(getOdds() + " are odds numbers!");
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 100) + 1;
		}
	}
	public static void printArray()
	{
		for(int numb : numbers)
		{
			System.out.println(numb);
		}
		
	}
	public static String getOdds()
	{
		String odds = ""; 
		for(int numb : numbers)
		{
			if((numb % 2) == 1)
			{
				odds += (numb + " "); 
			}
		}
		return odds; 
	}
}