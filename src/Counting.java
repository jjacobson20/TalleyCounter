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
		TalleyCounter newCounter = new TalleyCounter(5);
		
		System.out.println(myCounter);
		
		for (int i=0; i<100; i++)
		{
			
			myCounter.click();
			
		}
		
		System.out.println(myCounter); // expect: 100
		
		myCounter.unclick();
		System.out.println(myCounter); // expect: 99
		
		myCounter.reset();
		System.out.println(myCounter); // expect: 0
		System.out.println("New counter count: " + newCounter.getCount()); // expect: 5
		
	}
}
