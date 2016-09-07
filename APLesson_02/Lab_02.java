public class Lab_02
{
	public static void main(String[]args)
	{
		int firstNumber = 4;
		int secondNumber = 5;
		int answer = 4 * 5;
		
		System.out.println("4 multiplied by 5 is " + answer);
		
		String name = "Yves ";
		String address = "13363 Benchley Road ";
		String city = "San Diego ";
		String zip = "92130 ";
		
		System.out.println(name + address + "\n" + city + zip);
		
		int w = 10;
		int l = 15;
		int h = 26;
		double recArea = 2*(w * l + h * l + h * w);
		
		System.out.println("The surface area of a rectangular prism is " + recArea);
		
	}
}