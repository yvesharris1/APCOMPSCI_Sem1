public class GMC implements Location
{
	private int coordinatex;
	private int coordinatey;
	
	public GMC()
	{
		coordinatex = 0;
		coordinatey = 0;
	}
	
	public GMC(int x, int y)
	{
		coordinatex = x;
		coordinatey = y;
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