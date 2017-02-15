import java.lang.Math;

public abstract class GameSystem
{
	private String platform;
	private int serialNo;
	
	public GameSystem()
	{
		this.platform = "";
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public GameSystem(String p)
	{
		this.platform = "";
		this.serialNo = (int)(Math.random() * 10000000) + 1;
	}
	
	public void setPlatform(String p)
	{
		this.platform = p;
	}
	
	public void setserialNo(int sNo)
	{
		this.serialNo = sNo;
	}
	
	public abstract String getPlatform();
	
	public int getserialNo()
	{
		return serialNo;
	}
	
	public String toString()
	{
		return platform + "\t...\t" + serialNo;
	}
}