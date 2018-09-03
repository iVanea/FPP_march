package assignment2_2;

import java.util.Date;

public class RandomNumbers {
	private int nrInitial, nrFinal;
	private int seed = 2;

	public RandomNumbers(int nrInitial, int nrFinal) {
		this.nrInitial = nrInitial;
		this.nrFinal = nrFinal;
	}
	
	public int stupidGenerator() {
		Date date = new Date();
		long bigNumber = date.getTime();
		
		return (int)(bigNumber % 10);
	}
	
	public int generateNumber()
	{
		seed = (nrInitial * seed + 4) % nrFinal;
		
		return seed;
	}
	
}
