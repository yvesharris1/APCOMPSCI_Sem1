public class Advance extends Ticket
{
	private int daysLeft;
	
	public Advance(int dL)
	{
		super();
		daysLeft = dL;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}