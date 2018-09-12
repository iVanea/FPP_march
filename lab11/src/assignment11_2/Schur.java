package assignment11_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Schur {
	int counter;
	int sum;
	private HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

	public boolean checkForSum(List<Integer> a, int sum) {
		counter = 0;
		this.sum = sum;
		a.forEach(e -> countMe(e));

		return counter > 1 ? true : false;
	}

	public void countMe(int element) {

		if (h.containsKey(element)) {
			System.out.println("key: " + element + " value: " + h.get(element) + " = " + sum + "; contor = " + counter);
			counter++;
			h.remove(element);
		} else {
			int key = sum-element;
			h.put(key, element); 
		}
	}
	
	public static void main(String[] args) {
		Schur z = new Schur();
		int[] aa = {1,2,3,3,4,5,6,7,8,9,10};
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(1,2,3,3,4,5,6,7,8,9,10));
		System.out.println("Sum 10 for this list"+Arrays.toString(aa));
		System.out.println(z.checkForSum(a,10));//exista
		z = new Schur();
		
		System.out.println("\nSum 20 for this list"+Arrays.toString(aa));
		System.out.println(z.checkForSum(a,20));//nui
	}

}
