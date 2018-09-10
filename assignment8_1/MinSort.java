package assignment8_1;

import java.util.Arrays;

public class MinSort {
	String [] arr;

	MinSort(String[] arr){
		this.arr = arr;
	}
	public String[] sort(){
		if(arr == null || arr.length <=1) return null;
		int len = arr.length;
		for(int i = 0; i < len; ++i){
			int nextMinPos = minpos(i,len);
			if (i != nextMinPos) {
				//System.out.println(i+" -> "+nextMinPos );
				swap(i,nextMinPos); 
			}
		}

		return arr;
	}
	void swap(int i, int j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		String minimal = arr[bottom];
		int index = bottom;
		for(int i = bottom+1; i < top; ++i){

			if(arr[i].compareTo(minimal) < 0){ 
				minimal = arr[i];
				index = i; 	 
			}
		}
		return index;
	}
	public static void main(String[] args){

		String [] arr = {"big", "small", "tall", "short", "round", "square",
                "enormous", "tiny","gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule"};
		System.out.println("Unsorted: "+ Arrays.toString(arr));
		MyStringList list = new MyStringList(arr);
		MinSort minSort = new MinSort(arr);
		minSort.sort();
		System.out.println("Sorted: "+Arrays.toString(minSort.arr));
		
	}
}