import java.util.*;
public class ToyStore
{
	ArrayList<Toy> toyList = new ArrayList<Toy>();
	public ToyStore()
	{
		toyList = new ArrayList<Toy>();	
	}
	
	public ToyStore(String t)
	{
		loadToys(t);
	}
	
	public  void loadToys(String ts)
	{
		toyList = new ArrayList<Toy>();
		ArrayList<String> toys = new ArrayList<String>(Arrays.asList(ts.split(", ")));
		for (int i = 0; i < toys.size(); i += 2)
		{
			String name = toys.get(i);
			String type = toys.get(i + 1);
			Toy t = getThatToy(name);
			if (t == null)
			{
				if (type.equals("Car")) 
				{
					toyList.add(new Car(name));
				}
				if (type.equals("AF"))
				{
					toyList.add(new AFigure(name));
				}
			}
			else
			{
				t.setCount(t.getCount() + 1);
			}
		}
	}
	
	public  Toy getThatToy(String nm)
	{
		for (Toy x : toyList)
		{
			if (x.getName().equals(nm))
			{
				return x;
			}
		}
		return null;
	}

	public String getMostFrequentToy()
	{
		String name = "";
		int max = Integer.MIN_VALUE;
		for (Toy x: toyList)
		{
			if (max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		
		}
		return name;
	}
	
	public  String getMostFrequentType()
	{
		int cars = 0;
		int figures = 0;
		for(Toy x: toyList)
		{
			if (x.getType().equals("Car"))
			{
				cars = cars + 1;
			}	
			if (x.getType().equals("AF"))
			{
				figures = figures +1;
			}
		}
		if (cars > figures)
		{
			return "Cars";
		}
		if (figures > cars)
		{
			return "Action Figures";
		}
		else
		{
			return "Equal Amounts of Action Figures and Cars!";
		}
	}

	public String toString()
	{
		return ""  + toyList;
	}
}