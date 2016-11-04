public class Exercise_5_01
{
	static int player;
	static int computer; 
	static String winner; 
	
	public static void main(String[]args)
	{
		player = (int)(Math.random()*7)+1;
		computer = (int)(Math.random()*7)+1;
		diceRoll();
		System.out.println("You rolled a " + player + ".");
		System.out.println("The computer rolled a " + computer + ".");
		System.out.println("The winner is the " + winner + "!");
	}
	public static void diceRoll()
	{
	if(player > computer)
		winner = "player";
		
	if(computer > player)
		winner = "computer";
	}
}