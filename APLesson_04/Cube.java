import java.util.Scanner;
public class Cube
{
	static int side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the length of a side:");
		side = keyboard.nextInt();
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = (6*(side*side));
	}
	public static void print()
	{
		System.out.println("The surface area of a cube with " + side + " sides is " + sa + ".");
	}
}