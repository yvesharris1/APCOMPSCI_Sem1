import java.util.Scanner;
public class TheUserClassRunner
{
	public static void main(String[]args) 
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your first name: ");
		String firstname = kb.next();
		System.out.println("Please enter your last name: ");
		String lastname = kb.next();
		System.out.println("Would you like to use a public avatar? (yes or no) ");
		String avatar = kb.next();
		
		if(avatar.equals("yes"))
		{
			System.out.println("Avatar: ");
			String avt = kb.next();
			
			TheUserClass user1 = new TheUserClass(firstname, lastname, avt);
			System.out.println();
			System.out.println(user1);
		}
		else
		{
			TheUserClass user1 = new TheUserClass(firstname, lastname);
			System.out.println();
			System.out.println(user1);
		}
	}
}