public class ToyRunner
{
	public static void main(String[]args)
	{
		ToyStore memes = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println(memes);
		System.out.println(memes.getMostFrequentToy());
		System.out.println(memes.getMostFrequentType());
	}
}