public class GameRunner
{
	public static void main(String[]args)
	{
		GameSystem objectXbox = new Xbox("Xbox");
		GameSystem objectPlayStation = new PlayStation("PlayStation");
		GameSystem objectPC = new PC("PC");
		
		System.out.println(objectXbox);
		System.out.println("-------------------");
		System.out.println(objectPlayStation);
		System.out.println("-------------------");
		System.out.println(objectPC);
		System.out.println("-------------------");
	}
}