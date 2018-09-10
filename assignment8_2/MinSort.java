package assignment8_2;

import java.util.Arrays;

import assignment8_2.Search;
import assignment8_2.MyStringLinkedList;
import assignment8_2.MyStringLinkedList.Node;

public class MinSort {
	MyStringLinkedList list;

	MinSort(MyStringLinkedList list){
		this.list = list;
	}
	public MyStringLinkedList sort(){
		if(list == null || list.getSize() <= 1) return null;
		int len = list.getSize()+1;
		for(int i = 1; i < len; ++i){
			int nextMinPos = minpos(i,len);
			if (i != nextMinPos) {
				swap(i,nextMinPos); 
			}
		}

		return list;
	}
	void swap(int i, int j){
		
		if (i > list.getSize() || j > list.getSize()) {
	        throw new IndexOutOfBoundsException();
	    }
	    if (i == j) {
	        return;
	    }
	    if (j < i) {
	        swap(j, i);
	        return;
	    }

	    // i < j

	    Node ithPredecessor = null;
	    Node ithNode = list.header;
	    for (int z = 0; z < i; z++) {
	        ithPredecessor = ithNode;
	        ithNode = ithNode.next;
	    }

	    Node jthPredecessor = ithNode;
	    Node jthNode = ithNode.next;
	    for (int q = i + 1; q < j; q++) {
	        jthPredecessor = jthNode;
	        jthNode = jthNode.next;
	    }

	    // Relink both nodes in the list:

	    // - The jthNode:
	    if (ithPredecessor == null) {
	        list.header = jthNode;
	    } else {
	        ithPredecessor.next = jthNode;
	    }
	    Node jNext = jthNode.next;
	    //if (ithNode.next == jthNode) {
	    if (jthPredecessor == ithNode) {
	        jthNode.next = ithNode;
	    } else {
	        jthNode.next = ithNode.next;
	    }

	    // - The ithNode:
	    if (jthPredecessor == ithNode) {
	    } else {
	        jthPredecessor.next = ithNode;
	    }
	    ithNode.next = jNext;
		
	}
	
	//TODO: aici trebuia de adaugat altceva Node minNode(Node n)
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){
		String minimal = list.getDataAtIndex(bottom);
		int index = bottom;
		for(int i = bottom+1; i < top; ++i){
			String temp = list.getDataAtIndex(i);
			if(temp.compareTo(minimal) < 0){ 
				minimal = temp;
				index = i; 	 
			}
		}
		return index;
	}
	
	public static void main(String[] args){

		String [] arr = {"big", "small", "tall", "short", "round", "square",
                "enormous", "tiny","gargantuan", "lilliputian",
                "numberless", "none", "vast", "miniscule"};
		System.out.println("Arr: "+ Arrays.toString(arr)+ "  length:"+arr.length);
		
		
		MyStringLinkedList list = new MyStringLinkedList(arr);
		
		System.out.println("Introducem in Link List:");
		System.out.print("Unsorted LL: ");
		list.printNodes();
		System.out.println(list.getSize());
		
		MinSort minSort = new MinSort(list);
		minSort.sort();
		System.out.print("  Sorted LL: ");
		list.printNodes();
		System.out.println(list.getSize());
		
		Search mySearch = new Search(list);
		System.out.println("Contain word 'number': " + mySearch.search("number"));
		System.out.println("Contain word 'tiny': " + mySearch.search("tiny"));
	}
}
