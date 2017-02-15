public class Xbox extends Console
{
	public Xbox()
	{
		super();
	}
	
	public Xbox(String n)
	{
		super(n);
	}
	
	public String getController()
	{
		return "Xbox Wireless Controller";
	}
	
	public String getPlatform()
	{
		return "Xbox";
	}
}