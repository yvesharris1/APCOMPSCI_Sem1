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