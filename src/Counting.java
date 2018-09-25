/**
 * 
 * @author jeremy
 *
 */
public class Counting
{
	
	public static void main(String[] args)
	{
		TalleyCounter myCounter = new TalleyCounter();
		System.out.println("Count: " + myCounter.getCount());
		myCounter.click();
		myCounter.click();
		System.out.println("Count: " + myCounter.getCount());
		
	}
		
}
