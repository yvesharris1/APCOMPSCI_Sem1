import java.lang.Math.*;
public class DistanceBetween2Points
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public DistanceBetween2Points()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0; 
		yTwo = 0;
		distance = 0;
	}
	
	public DistanceBetween2Points(int xE1, int yE1, int xE2, int yE2)
	{
		xOne = xE1;
		yOne = yE1;
		xTwo = xE2;
		yTwo = yE2;
		distance = 0;
	}
	
	public void setValues(int xE1, int yE1, int xE2, int yE2)
	{
		xOne = xE1;
		yOne = yE1;
		xTwo = xE2;
		yTwo = yE2;
	}
	
	public double getDist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
	
}