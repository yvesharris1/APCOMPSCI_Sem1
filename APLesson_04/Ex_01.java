import java.util.Scanner; //import Statement

public class Ex_01 
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Ex_01 form = new Ex_01();
		
		System.out.println("Please enter item 1: " );
		
		String item1 = keyboard.next();

		System.out.println("Please enter the price: ");
		
		double price1 = keyboard.nextDouble();
		
		
		//prompts for user input
		System.out.println("Please enter item 2: ");
		
		String item2 = keyboard.next();
		
		//prompts for user input
		System.out.println("Please enter the price: ");
		
		double price2 = keyboard.nextDouble();
		
		//prompts for user input
		System.out.println("Please enter item 3: ");
		
		String item3 = keyboard.next();
		
		//prompts for user input
		System.out.println("Please enter the price: ");
		
		double price3 = keyboard.nextDouble();
		
		//calculate subtotal, tax, total
		double subtotal = price1 + price2 + price3;//add all the item prices
		double tax = 0.08 * subtotal;
		double total = subtotal + tax;
		
		
		System.out.println("<<<<<<<<<<<<<<<_Recepit_>>>>>>>>>>>>>>>");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format("Subtotal:", subtotal);
		form.format("Tax:", tax);
		
	}
	public void format(String item, double price)
	{
		System.out.printf("\n* %10s ........ %10.2f", item, price);
	}
}