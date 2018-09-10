package assignment8_2;
import assignment8_2.MyStringLinkedList;
class Search {
	MyStringLinkedList anArray;

	//anArray is a sorted array
	Search(MyStringLinkedList anArray){
		this.anArray = anArray;
	}
	//search a sorted array
	boolean search(String val) {
		boolean b = recurse(0,anArray.getSize(), val);
		return b;
	}


	boolean recurse(int a, int b, String val) {
		int mid = (a+b)/2;
		if(anArray.getDataAtIndex(mid).equals(val)) return true;
		if(a > b) return false;
		if(val.compareTo(anArray.getDataAtIndex(mid)) > 0) return recurse(mid+1, b, val);
		return recurse(a,mid-1,val);
	}
	
	
}
