/**
 * 
 * @author jeremy
 *
 */
public class TalleyCounter
{
	//fields
	private int count;
	
	//constructors
	public TalleyCounter()
	{
		count = 0;
	}
	
	public TalleyCounter(int startingCount)
	{
		count = startingCount;
	}
	
	//methods
	public void click()
	{
		count++; // count = count + 1
		// another option count += 1
	}
	
	public void unclick()
	{
		count--;
	}
	
	public String toString()
	{
		return "count: " + count;
	}
	
	public int getCount() //accessor
	{
		return count;
	}
	
	public void reset()
	{
		count = 0;
	}
	
	

}
