public abstract class Car implements Location
{
	int ID;
	double coordinatex;
	double coordinatey;
	double[] location;
	
	public Car()
	{
		ID = (int)(Math.random() * 999999 + 1);
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