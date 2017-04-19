public class Honda extends Car
{
	private double coordinatex;
	private double coordinatey;
	
	public Honda()
	{
		coordinatex = 0;
		coordinatey = 0;
	}
	
	public Honda(double[] coord)
	{
		super();
		coordinatex = coord[0];
		coordinatey = coord[1];
		Move(coordinatex, coordinatey);
	}
}