import java.util.Scanner;
public class AdventureGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("You are lost in the woods. Your only supplies are: matches, a wool blanket, and an axe.");
		System.out.println("You are trying to get home, but you don't know where you are. Night approaches.");
		System.out.println("You suddenly remember that these woods are supposedly haunted. You suddenly hear a howl near you.");
		System.out.println("What do you do...." +
							"\n 1.	Run in the opposite direction of the noise. " +
							"\n 2.	Run towards the howl with your axe in hand. " + 
							"\n 3.  Start crying and cover your body with your wool blanket. ");
		int choice = kb.nextInt();
		if(choice == 1)
		{
			System.out.println("You run in the opposite direction of the noise and trip almost immediately. ");
			System.out.println("As you lay on the ground with a twisted ankle and absolutely no hope, the howling comes near you.");
			System.out.println("What do you do...." +
								"\n 1.	Stay on the ground and cry and except your ultimate fate. " +
								"\n 2.  Somehow make your axe into a torch with your matches and stand your ground, fiercely! ");
			int outcome1 = kb.nextInt();
			if(outcome1 == 1)
			{
				System.out.println("As the howling nears you and your crying strengthens, it starts to smell like wet dog. ");
				System.out.println("You eventually discover that the howling was just your neighbors dog. It is lost too! ");
				System.out.println("While this doesn't help you find your house, at least you have a cute puppy with you! ");
			}
			else{
				System.out.println("The howling gets closer and your torch starts to brighten significantly. ");
				System.out.println("You start to wave your torch around and eventually the howling stops and you hear something running away from you. ");
				System.out.println("Even though the howling stops, you start to feel strangely lonely. You wish you had a cute dog by your side. ");
			}
		}
		else if(choice == 2)
		{
			System.out.println("You run towards the howl with your axe in hand. You look absolutely fierce. Go you. ");
			System.out.println("As you run, you realize that you haven't ran this much in years. You fatigue easily and stop running after only two seconds. ");
			System.out.println("The howling noise increases, but you are so tired that you do not even care. Your mom would be so proud. ");
			System.out.println("What do you do...." +
								"\n 1.	Sit down and let whatever is making the howling noise end your inner turmoil and fatigue. " +
								"\n 2.  Stand your ground and use your blanket as a weird net. You hope this will work. ");
			int outcome2 = kb.nextInt();
			if(outcome2 == 1)
			{
				System.out.println("As you sit down, the howling gets extremely close to you. ");
				System.out.println("You discover that the noise came from a cute puppy. You loves dogs. This makes you elated! ");
				System.out.println("Even though you are extremely tired, you pet the dog with whatever energy you have left. ");
				System.out.println("You start to realize that this dog doesn't help you get home. Whatever. It's a cute dog and you thrive in this temporary happiness. ");
				System.out.println("You name the dog Skip. ");
			}
			else{
				System.out.println("The howling approaches you and you realize that your 'net' is stupid and will not work. ");
				System.out.println("You decide the light your blanket on fire in the hopes that you will scare the creature away. ");
				System.out.println("It works! The howling stops and you hear the creature's steps running in the opposite direction of you. ");
				System.out.println("As you sit there alone, you start to think about dogs. " );
				System.out.println("You suddenly feel very alone. ");
				System.out.println("You wish you had a cute puppy by your side. ");
				System.out.println("Now you are alone with no puppy. And no blanket. Great. ");
			}
		}
		else if(choice == 3)
		{
			System.out.println("You start to cry and cover your body with your blanket like a wimp. ");
			System.out.println("The howling approaches you you start to shake all over, like a wimp. ");
			System.out.println("What do you do...." +
								"\n 1.	Hold your axe as if it were your only friend. Like. A. Wimp. " +
								"\n 2.  Cry so much in the hopes that you will literally drown in your tears....like a wimp? ");
			int outcome3 = kb.nextInt();
			if(outcome3 == 1)
			{
				System.out.println("You hold onto your axe so much that if your axe were a person, it would call you clingly and break up with you. ");
				System.out.println("The creature creeps you to you, makes a weird sniffing noise, and you hear it run away.  ");
				System.out.println("You are elated to be left alone. Your axe, on the other hand, wishes the creature would come back and kill you. What a rude axe. ");
				System.out.println("As you lay alone with the blanket over you, you become delusional and pretend to date your axe. ");
				System.out.println("What a weirdo. ");
				System.out.println("Your axe hates you. ");
			}
			else
			{
				System.out.println("As you begin to cry, you realize that you cannot physically drown in your tears.  ");
				System.out.println("The howling nears you and you try to run away. You cannot, however, and the creature creeps you to you. ");
				System.out.println("You slowly pull the blanket over your head and start to except your ultimate fate like a courageous wimp. ");
				System.out.println("You discover that the creature is nothing but a cute puppy! You reach to pet the puppy. You love puppies. ");
				System.out.println("The puppy senses your wimpiness, however, and gets weirded out. A lot. ");
				System.out.println("The puppy slowly backs away from you. You become delusional and pretend that the puppy is still there when it really isn't. ");
				System.out.println("You lay alone in your delusions. However, you are happy because, in your delusions, a puppy is by your side. ");
				System.out.println("You name the dog Henry. ");
			}
		}
	}
}	
