import java.util.Scanner; //import Statement

public class Ex_02
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		Ex_02 form = new Ex_02();
		
		System.out.println("Enter your first name: " );
		
		String name1 = keyboard.next();

		System.out.println("Enter your last name: ");
		
		String name2 = keyboard.next();
		
		//prompts for user input
		System.out.println("Enter your title: ");
		
		String title = keyboard.next();
		keyboard.nextLine();
		//prompts for user input
		System.out.println("Enter the school site: ");
		
		String schoolsite = keyboard.nextLine();
		
		//prompts for user input
		System.out.println("Enter the school year: ");
		
		String schoolyear = keyboard.next();
		
		//prompts for user input
		System.out.println("What is your subject? ");
		
		String subject = keyboard.next();
			
		System.out.println("**********************************");
		form.format(schoolsite, schoolyear);
		form.format(name1, name2);
		form.format(title, subject);
		System.out.println("**********************************");
		
	}
	public void format(String ob1, String ob2)
	{
		System.out.printf("* %15s %15s *\n", ob1, ob2);
	}
}