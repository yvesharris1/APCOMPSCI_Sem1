import java.lang.Math.*;
public class MilesPerHour
{
	private int distance, hours, minutes;
	private double mph;
	
	public MilesPerHour()
	{
		distance = 0;
		hours = 0;
		minutes = 0; 
		mph = 0;
	}
	
	public UserNames(int dist, int heurs, int desminutes, double mph)
	{
		distance = dist;
		heurs = hours;
		desminutes = minutes;
		mph = 0;
	}
	
	public void setValues()
	{
		distance = dist;
		heurs = hours;
		desminutes = minutes;
		mph = 0;
	}
	
	public double getMPH()
	{
		return mph;
		mph = Math.round(distance / (hours + minutes / 60.0));
	}
	
}