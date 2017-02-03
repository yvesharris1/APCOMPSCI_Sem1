import java.lang.Math.*;
public class InventoryItems
{
	private String manufacturer;
	private String name;
	private String category;
	private int UPC;
	private double price;
	
	public InventoryItems(String manu, String nom)
	{
		manufacturer = manu;
		name = nom; 
		UPC = (int)(Math.random() * 1000000000) + 1;
		category = "N/A";
		price = 0;
	}
	public InventoryItems(String manu, String nom, String cat, double prix)
	{
		manufacturer = manu;
		name = nom; 
		UPC = (int)(Math.random() * 1000000000) + 1;
		category = cat;
		price = prix;
	}

	public String toString()
	{
		return "Item Info...\nItem Manufacturer: " + manufacturer +
                           "\nItem Name: " + name +
                           "\nItem Category: " + category +
                           "\nItem Price: $" + price +
						   "\nUPC# : " + UPC;
	}
}