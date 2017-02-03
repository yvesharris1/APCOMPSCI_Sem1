import java.util.Scanner;
public class InventoryItemsRunner
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the item manufacturer: ");
		String manu = kb.next();
		System.out.println("Please enter the item name: ");
		String nom = kb.next();
		System.out.println("Will you be entering category and price information? (yes or no) ");
		String information = kb.next();
		
		if(information.equals("yes"))
		{
			System.out.println("Item category: ");
			String cat = kb.next();
			
			System.out.println("Item price: ");
			double prix = kb.nextDouble();
			
			InventoryItems item1 = new InventoryItems(manu, nom, cat, prix);
			System.out.println();
			System.out.println(item1);
		}
		else
		{
			InventoryItems item1 = new InventoryItems(manu, nom);
			System.out.println(item1);
		}
	}
}