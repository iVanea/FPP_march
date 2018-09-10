package assignment8_1;

import java.util.Arrays;

public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public MyStringList(String[] arr) {
		strArray = new String[arr.length];
		size = 0;
		for (String a : arr)
			add(a);
		
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	
	
	private void resize(){
//		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		return sb.toString();
	}
	public int size() {
		return size;
	}

	public static void main(String[] args){
//		MyStringList l = new MyStringList();
//		l.add("Bob");
//		l.add("Steve");
//		l.add("Susan");
//		l.add("Mark");
//		l.add("Dave");
//		System.out.println("The list of size "+l.size()+" is "+l);
//		l.remove("Mark");
//		l.remove("Bob");
//		System.out.println("The list of size "+l.size()+" is "+l);
//		l.insert("Richard",3);
//		System.out.println("The list of size "+l.size()+" after inserting Richard into pos 3 is "+l);
//		l.insert("Tonya",0);
//		System.out.println("The list of size "+l.size()+" after inserting Tonya into pos 0 is "+l);	
		String[] test = {"big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule"};
		System.out.println("Unsorted: "+Arrays.toString(test));
		MinSort mySort = new MinSort(test);
		
		String sortedTest[] = mySort.sort();
		System.out.println("Sorted: "+Arrays.toString(sortedTest)+"\n");
		
		Search mySearch = new Search(sortedTest);
		System.out.println("Contain word 'number': " + mySearch.search("number"));
		System.out.println("Contain word 'tiny': " + mySearch.search("tiny"));
	}

}
