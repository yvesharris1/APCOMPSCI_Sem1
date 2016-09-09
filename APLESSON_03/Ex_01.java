import java.util.Scanner; //import Statement

public class Ex_01 
{
	public static void main(String[]args)
	{
		//instantiates the new Scanner object "keyboard"
		Scanner keyboard = new Scanner(System.in);
		
		//prompts for user input
		System.out.println("What is your name? " );
		
		String name = keyboard.next();
		
		System.out.println("Wow! " + name + " sounds like some dietary disease! ");
		
		//prompts for user input
		System.out.println("How old are you? ");
		
		String age = keyboard.next();
		
		System.out.println("And I thought my grandmother was old! ");
		
		//prompts for user input
		System.out.println("What do you do for fun?");
		
		String activity = keyboard.next();
		
		System.out.println(activity + "?! Man, and I thought you were cool! ");
		
		//prompts for user input
		System.out.println("What kind of music do you like? ");
		
		String music = keyboard.next();
		
		System.out.println("You listen to " + music + "?! And I thought my grandmother's taste in music was bad! ");
		
		//prompts for user input
		System.out.println("How many siblings do you have?");
		
		String numb = keyboard.next();
		
		System.out.println(numb + "? No I asked you how many siblings do you have, not how many people in this world that actually tolerate you." );
		
		//prompts for user input
		System.out.println("What do you want to be when you grow up?");
		
		String resp = keyboard.next();
		
		System.out.println(resp + "? Well to be a " + resp + " you actually have to be good at doing things, sooooo, good luck with that...");
	}
}