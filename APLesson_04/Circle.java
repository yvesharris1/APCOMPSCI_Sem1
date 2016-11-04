import java.util.Scanner;
public class Circle
{
	static double r;
	static double area;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the radius of the circle:");
		r = keyboard.nextInt();
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = (3.14*(r*r));
	}
	public static void print()
	{
		System.out.println("The area of a circle with the radius of " + r + " is " + area);
	}
}