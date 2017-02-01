import java.util.Scanner;
public class DistanceBetween2PointsRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter x1: ");
		int x1 = kb.nextInt();
		System.out.println("Please enter y1: ");
		int y1 = kb.nextInt();
		System.out.println("Please enter x2: ");
		int x2 = kb.nextInt();
		System.out.println("Please enter y2: ");
		int y2 = kb.nextInt();
		
		DistanceBetween2Points object = new DistanceBetween2Points(x1, y1, x2, y2);
		
		System.out.println("distance = " + object.getDist());
		object.setValues(0, 0, 1, 1);
      
		System.out.println("distance = " + object.getDist());
	}
}