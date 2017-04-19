public class GMC extends Car
{
	private double coordinatex;
	private double coordinatey;
	
	public GMC()
	{
		super();
		coordinatex = 0;
		coordinatey = 0;
	}
	
	public GMC(double x, double y)
	{
		super();
		coordinatex = x;
		coordinatey = y;
		Move(coordinatex, coordinatey);
	}
}