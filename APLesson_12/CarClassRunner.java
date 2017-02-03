import java.util.Scanner;
public class CarClassRunner
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your paint: ");
		String paint = kb.next();
		System.out.println("Please enter your interior: ");
		String interior = kb.next();
		System.out.println("Please enter your engine: ");
		String engine = kb.next();
		System.out.println("Please enter your tires: ");
		String tires = kb.next();
		
		CarClass newcar = new CarClass(paint, interior, engine, tires);
		
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint:\t" + newcar.getPaint());
		System.out.println("Interior:\t" + newcar.getInterior());
		System.out.println("Engine:\t" + newcar.getEngine());
		System.out.println("Tires:\t" + newcar.getTires());
		
		newcar.setCustom("red w/gold fleck", "Corinthian leather (Brown)", "5 litre v8 507hp", "20\" Priellis");
		
		System.out.println("Your vehicle is ready.....");
		System.out.println("Paint:\t" + newcar.getPaint());
		System.out.println("Interior:\t" + newcar.getInterior());
		System.out.println("Engine:\t" + newcar.getEngine());
		System.out.println("Tires:\t" + newcar.getTires());
	}
}