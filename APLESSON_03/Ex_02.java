import java.util.Scanner;

public class Ex_02
{ 
    public static void main(String[]args)
    {
        //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);

        double weight = 0;
        double height = 0;
        double bmi = 0;

        System.out.print("What is your weight: ");
        weight = keyboard.nextDouble();

        System.out.print("What is your height: ");
        height = keyboard.nextDouble();

        bmi = ((weight * 703)/(height * height));

        System.out.println("Your Body Mass Index is " + bmi);

     }
}