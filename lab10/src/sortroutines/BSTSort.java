package sortroutines;

import runtime.Sorter; 

public class BSTSort extends Sorter {
	MyBST btree = new MyBST();
	

	
	public void insertAll(int[] array) {
		for (int i = 0; i < array.length; i++) {
			btree.insert(array[i]);
		}
	}


	public int[] readIntoArray() {
		return  btree.getArray();
	}

	@Override
	public int[] sort(int[] arr) {
		int[] sArr = new int[arr.length];
		insertAll(arr);
		sArr = readIntoArray();

		return sArr;
	}
}