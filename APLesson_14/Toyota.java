public class Toyota implements Location
{
	private String s;
	private double coordinatex;
	private double coordinatey;
	
	public Toyota()
	{
		s = "";
	}
	
	public Toyota(String i)
	{
		s = i;
	}
	
	public int getID()
	{
		return (int)(Math.random() * 999999 + 1);
	}
	
	public double[] getLoc()
	{
		String sr = s;
		String [] separate = s. split(", ");
		coordinatex = Double.valueOf(separate[0]).doubleValue();
		coordinatey = Double.valueOf(separate[1]).doubleValue();
		double location[] = new double[2];
		location[0] = coordinatex;
		location[1] = coordinatey;
		return location; 
	}
}