package assignment3_3;

public class MyStringList {
	
	private static int size ;
	private static String[] arrStr;
//	private static int counter = 0, removed=0;

	MyStringList() {
		MyStringList.size = 0;
		MyStringList.arrStr = new String[2];
	}
	
	public MyStringList(int size) {
		
		String[] futureStr = new String[size*2];
		System.arraycopy(MyStringList.arrStr, 0, futureStr, 0, size);
		MyStringList.arrStr = futureStr;
		
		resize();
	}

	public void add(String s) {
		if (MyStringList.arrStr.length <= MyStringList.size) 
			new MyStringList(size);
			
		int position = size();
		arrStr[position] = s;
		size++;
		
	}

	public String get(int i) {
		return arrStr[i];
	}

	public boolean find(String s) {
		// returns true if String s is found in the array, false otherwise
		for (String word:arrStr)
			if(s == word)
				return true;
		return false;
	}

	public boolean remove(String s) {
		// - removes first occurrence of String s if it is found in the underlying array
		// if found, returns true; if not found returns false
		for(int i = 0; i < size(); i++) {
			if(s == get(i)) {
				boolean b = swap(i);
				size--;
				return b;
			}
		}
		return false;
	}

	public boolean swap(int pos) {
			arrStr[pos] = arrStr[size()];
			arrStr[size()]=null;
			return true;
	}
	
	public String toString() {
		//format [Bob, Steve, Susan, Mark, Dave]
		String s = "[";
		for (String s1 : arrStr) {
			if (s1 != null)
				s +=s1 + ",";		
		}
		s = s.substring(0, s.length()-1) +"]";
		return s;
	}

	public int size() {
		// - returns the next open position in the underlying array – this is precisely
		// the number of Strings that have been added minus the number of String that have
		// been removed.
		return MyStringList.size;
	}
	public void resize() {
		System.out.println("Resizing...");
		//MyStringList.size = MyStringList.size*2;
	}
}
