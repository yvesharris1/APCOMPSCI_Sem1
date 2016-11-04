import java.util.Scanner; //import Statement

public class APLab_42
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		APLab_42 form = new APLab_42 ();
		
		System.out.println("Enter your height for your subwoofer box: " );
		
		double h = keyboard.nextDouble();

		System.out.println("Enter your length for your subwoofer box: ");
		
		double l = keyboard.nextDouble();
		
		//prompts for user input
		System.out.println("Enter your width for you subwoofer box: ");
		
		double w = keyboard.nextDouble();
		
		double vol = form.calcVol(h, l, w);
		
		System.out.println("Your volume is " + vol);
	}
	
	public double calcVol(double h, double l, double w)
	{
		return ((h*l*w)/1728);
	}
}