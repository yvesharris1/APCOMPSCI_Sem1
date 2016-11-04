import java.util.Scanner;
public class PasswordProgram
{
	static Scanner kb; 
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		passCheck();
	}
	
	public static void passCheck()
	{
	
		System.out.println("Enter your username: ");
		String username = kb.next();
		System.out.println("Enter your password: ");
		String password = kb.next();
		
		if (username.equals("Meninist_Pro") && password.equals("dogs4lyfe"))
			System.out.println("You are granted access!");
		else
			{
				if ((username.equals("Meninist_Pro") && !(password.equals("dogs4lyfe"))))
				System.out.println("Your password is incorrect!");
				else if (!(username.equals("Meninist_Pro") && (password.equals("dogs4lyfe"))))
				System.out.println("Your username is incorrect!");
				else
				System.out.println("Your username and password are incorrect!");
				passCheck();
			}
	}
}