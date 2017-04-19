import java.util.ArrayList;
import java.util. Arrays;

public class Toyota extends Car
{
	private String s;
	private double coordinatex;
	private double coordinatey;
	
	public Toyota()
	{
		coordinatex = 0;
		coordinatey = 0;
	}
	
	public Toyota(String i)
	{
		super();
		ArrayList<String> coordinatez = new ArrayList<>(Arrays.asList(i.split(", ")));
		double x = Double.parseDouble(coordinatez.get(0));
		double y = Double.parseDouble(coordinatez.get(1));
		Move(x,y);
	}
}