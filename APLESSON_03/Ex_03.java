import java.util.Scanner;

public class Ex_03
{ 
    public static void main(String[]args)
    {
        //instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);

        double length = 0;
        double width = 0;
        double height = 0;
		double volume = 0;

        System.out.print("What is the length of the pyramid?  ");
        length = keyboard.nextDouble();

        System.out.print("What is the width of the pyramid? ");
        width = keyboard.nextDouble();
		
		System.out.print("What is the height of the pyramid?  ");
        height = keyboard.nextDouble();

        volume = (length*width*height)/(3);

        System.out.println("The volume of the pyramid is " + volume);

     }
}