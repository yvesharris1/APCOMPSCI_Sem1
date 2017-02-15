public class StudentAdvance extends Advance
{
	public StudentAdvance(int dL)
	{
		super(dL);
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice() + "\nSTUDENT ID REQUIRED";
	}
}