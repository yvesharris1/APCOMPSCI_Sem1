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
	}
	
	public void Move(double x, double y)
	{
		coordinatex += x;
		coordinatey += y;
	}
	
	public int getID()
	{
		return ID;
	}

	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = coordinatex;
		location[1] = coordinatey;
		return location; 
	}
}