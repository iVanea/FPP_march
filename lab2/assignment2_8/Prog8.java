package assignment2_8;
/*
 * 
 */
public class Prog8 {
	/*public static void main(String [] args) {
		int [] a = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		System.out.println("min= "+min(a));
	}*/
	
	static int min(int[] arrayOfInts) {
		if (arrayOfInts.length ==0 || arrayOfInts == null)
			return 0;
			
		int minim = arrayOfInts[0];
			
		for (int i = 1; i<arrayOfInts.length; i++) 
			if(arrayOfInts[i]<minim)
				minim = arrayOfInts[i];
	
		return minim;
	}
}
