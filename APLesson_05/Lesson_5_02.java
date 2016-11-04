import java.util.Scanner; 
public class Lesson_5_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your first item: " );
		String item1 = keyboard.next();
		System.out.println("Enter your first price: " );
		double price1 = keyboard.nextDouble();
		
		System.out.println("Enter your second item: " );
		String item2 = keyboard.next();
		System.out.println("Enter your second price: " );
		double price2 = keyboard.nextDouble();
		
		System.out.println("Enter your third item: " );
		String item3 = keyboard.next();
		System.out.println("Enter your third price: " );
		double price3 = keyboard.nextDouble();
		
		System.out.println("Enter your fourth item: " );
		String item4 = keyboard.next();
		System.out.println("Enter your fourth price: " );
		double price4 = keyboard.nextDouble();
		
		
		double subtotal = price1 + price2 + price3 + price4;
		double tax = 0.08 * subtotal;
		double discount = calcDisc(subtotal);
		double total = ((subtotal - discount) + tax);
		
		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>>>>");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		System.out.println("\n\n");
		format("Subtotal:", subtotal);
		format("Discount:", discount);
		format("Tax:", tax);
		format("Total:", total);
		System.out.println("\n");
		System.out.println("__________________________________");
		System.out.println("Thank you!");
	}
	public static double calcDisc(double subtotal)
	{
		if(subtotal >= 2000)
			return subtotal * 0.15;
		return 0.0;
	}
	public static void format(String item, double price)
	{
		System.out.printf("\n* %10s ........ %10.2f", item, price);
	}
}