import java.util.Scanner;
public class GPACalculator
{
	static String math;
	static String science;
	static String language;
	static String history;
	static String english; 
	static String drama;
	static String band; 
	static double gpa;
	static double A;
	static double B;
	static double C;
	static double D;
	static double F;
	
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter your letter grade for math: " );
		math = keyboard.next();
		System.out.println("Enter your letter grade for science: " );
		science = keyboard.next();
		System.out.println("Enter your letter grade for language: " );
		language = keyboard.next();
		System.out.println("Enter your letter grade for history: " );
		history = keyboard.next();
		System.out.println("Enter your letter grade for english: " );
		english = keyboard.next();
		System.out.println("Enter your letter grade for drama: " );
		drama = keyboard.next();
		System.out.println("Enter your letter grade for band: " );
		band = keyboard.next();
		
		gpa = (calcPoints(math) + calcPoints(science) + calcPoints(language) + calcPoints(history) + calcPoints(english) + calcPoints(drama) + calcPoints(band))/7;
	
		System.out.println("Your GPA is " + gpa + "!");
	}
	public static double calcPoints(String grade)
	{
		if (grade.equals("A"))
			return 4.0;
		else if (grade.equals("B"))
			return 3.0;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("D"))
			return 1.0;
		else 
			return 0.0;
	}
	
	
}