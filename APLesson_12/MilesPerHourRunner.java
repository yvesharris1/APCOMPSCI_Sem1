import java.util.Scanner;
public class MilesPerHourRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter a distance: ");
		int distance = kb.nextInt();
		System.out.println("Please enter the hours: ");
		int hours = kb.nextInt();
		System.out.println("Please enter the minutes: ");
		int minutes = kb.nextInt();
		double mph = 0;
		
		MilesPerHour object = new MilesPerHour(distance, hours, minutes);
		
		System.out.println(distance + " miles in " + hours + " hours, " + minutes + " minutes = " + object.getMPH());
		object.setValues(10000, 3, 7);
		
		System.out.println("10000 miles in 3 hours, 7 minutes = " + object.getMPH() + " mph");
		
		
	}
}