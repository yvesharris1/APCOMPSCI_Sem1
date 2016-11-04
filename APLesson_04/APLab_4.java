import java.util.Scanner; //import Statement

public class APLab_4
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		APLab_4 form = new APLab_4 ();
		
		System.out.println("Enter your interest rate: " );
		
		double r = keyboard.nextDouble();

		System.out.println("Enter your principal: ");
		
		double p = keyboard.nextDouble();
		
		//prompts for user input
		System.out.println("Enter the number of times your loan is compounded per year: ");
		
		double n = keyboard.nextDouble();
		keyboard.nextLine();
		//prompts for user input
		System.out.println("Enter the life of the loan : ");
		
		double t = keyboard.nextDouble();
		
		double avg = form.payment(r, p, t, n);
		
		System.out.printf("Your total monthly payment is $%5.2f", avg);
		
	}
	public double payment(double r, double p, double t, double n)
	{
		return (p*(Math.pow(1+r/n, n*t)))/(t*12);
	}
}