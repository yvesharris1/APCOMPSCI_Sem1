import java.util.Scanner;
public class GameGun
{
	static int bulletCount;
	static int CLIPSIZE = 16;
	static int shotCount;
	static String[] clip ;
	
	public static void main(String[]args)
	{
		bulletCount = 96;
		shotCount = 0;
		clip = new String[CLIPSIZE];
		resetClip();
	
		while(bulletCount > 0 || shotCount > 0)
		{
			Scanner kb = new Scanner(System.in);
			System.out.println("Action: ");
			String action = kb.next();
			
			if(action.equals ("R"))
			{
				reload();
			}
			else if(action.equals ("S"))
			{
				System.out.print(shoot());
				printClip();
			}
		}
		System.out.println("Out of Bullets!!!");
		
	}
	public static void resetClip()
	{
		for(int i = 0; i < clip.length; i++)
			clip[i] = "[]";
		
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = "[]";
			shotCount -= 1;
			return "Boom!!!" ;
		}
		else
		{
			return "Reload!!!";
		}
	}
	public static void reload()
	{
		if(bulletCount >= CLIPSIZE)
		{
			bulletCount -= CLIPSIZE;
			shotCount = CLIPSIZE;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "";
		System.out.println("Bullets: \t" + bulletCount + "\nClip: \t");
		for(int i = 0; i < CLIPSIZE; i++)
		{	
			output += clip[i];
		}
		System.out.println(output);
	}
}