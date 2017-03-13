public class Honda implements Location
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
		coordinatex = coord[0];
		coordinatey = coord[1];
	}
	public int getID()
	{
		return (int)(Math.random() * 999999 + 1);
	}
	
	public double[] getLoc()
	{
		double location[] = new double[2];
		location[0] = coordinatex;
		location[1] = coordinatey;
		return location; 
	}
}