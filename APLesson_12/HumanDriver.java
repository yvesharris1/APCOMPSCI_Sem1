import java.util.Scanner;
public class HumanDriver
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter hair color: ");
		String hair = kb.next();
		System.out.println("Please enter eye color: ");
		String eyes = kb.next();
		System.out.println("Please enter skin color: ");
		String skin = kb.next();
		System.out.println("Please enter your friend's hair color: ");
		String friendhair = kb.next();
		System.out.println("Please enter your friend's eye color: ");
		String friendeyes = kb.next();
		System.out.println("Please enter your friend's skin color: ");
		String friendskin = kb.next();
		
		Human newhuman = new Human(hair, eyes, skin);
		
		System.out.println("------------------");
		System.out.println("My info....");
		System.out.println("Hair:\t" + newhuman.getHair());
		System.out.println("Eyes:\t" + newhuman.getEyes());
		System.out.println("Skin:\t" + newhuman.getSkin());
		
		System.out.println("------------------");
      
		newhuman.setHES(friendhair, friendeyes, friendskin);
		System.out.println("Friend's info....");
		System.out.println("Hair:\t" + newhuman.getHair());
		System.out.println("Eyes:\t" + newhuman.getEyes());
		System.out.println("Skin:\t" + newhuman.getSkin());
	}
}