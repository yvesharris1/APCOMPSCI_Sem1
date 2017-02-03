import java.lang.Math.*;
public class TheUserClass
{
	private String firstname;
	private String lastname;
	private String avatar;
	private int userID;
	
	public TheUserClass()
	{
		firstname = "";
		lastname = "";
		avatar = "";
		userID = 0;
	}
	public TheUserClass(String fn, String ln)
	{
		firstname = fn;
		lastname = ln;
		avatar = "Undefined";
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public TheUserClass(String fn, String ln, String ava)
	{
		firstname = fn;
		lastname = ln;
		avatar = ava;
		userID = (int)(Math.random() * 1000000) + 1;
	}
	public void getAvatar(String ava)
	{
		avatar = ava;
	}
	

	public String toString()
	{
		return "Customer Info...\nFirst Name: " + firstname +
                           "\nLast Name: " + lastname +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}
}