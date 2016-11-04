import java.util.Scanner;
public class BMIPart2
{
	static double height;
	static double weight;
	static double bmi;
	static String condition;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your height in inches: ");
		height = keyboard.nextDouble();
		System.out.println("Enter your weight: ");
		weight = keyboard.nextDouble();
		
		bmi = (weight * (height * height))*703;
		
		System.out.println("Your BMI is: " + bmi);
		System.out.println("You are " + condition);
	}
	public static void calcCondish()
	{
		if (bmi > 39.9)
			condition = "Morbidly Obese";
		else if (bmi > 35)
			condition = "Very Obese";
		else if (bmi > 29.9)
			condition = "Obese";
		else if (bmi > 25)
			condition = "overweight";
		else if (bmi > 18.5)
			condition = "Normal";
		else 
			condition = "Underweight";
	}
}