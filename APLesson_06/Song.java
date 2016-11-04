public class Song
{
	public static void main(String[]args)
	{
		song("Na", 4);
		song("Na", 4);
		song("Hey", 3);
		song("Goodbye", 1);
	}
	public static void song(String lyric, int yves)
	{
		for(int i = 1; i <= yves; i++)
		{
			System.out.print(lyric + " ");
		}
		System.out.print("\n");
	}
}