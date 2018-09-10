package assignment8_2;

public class MyStringLinkedList {
	public Node header;

	MyStringLinkedList() {
		header = new Node(null, null, null);
	}
	public MyStringLinkedList(String[] arr) {
		header = new Node(null, null, null);
		for (String a : arr)
			addFirst(a);
		
	}

	public int getSize() {
		Node theNext = header.next;
		int contor = 0;
		while (theNext != null) {
			contor++;
			theNext = theNext.next;
		}
		return contor;
	}

	public void addFirst(String item) {
		Node n = new Node(header.next, header, item);
		if (header.next != null) {
			header.next.previous = n;
		}
		header.next = n;

	}

	public void addLast(String item) {
		Node n = new Node(null, null, item);
		Node theHeader = header.next;
		while (theHeader.next != null) {
			theHeader = theHeader.next;
		}
		theHeader.next = n;
//		theHeader.previous = n;
//		n.previous = theHeader;
	}

	public void insert(String data, int pos) {
		if (!haveThisPosition(pos))
			throw new IndexOutOfBoundsException();
		Node nodeToInsert = new Node(null, null, data);
		Node theNode = header;
		for(int i = 0; i< pos; i++) {
			theNode= theNode.next;
		}
		
	    nodeToInsert.next = theNode.next;
	    theNode.next = nodeToInsert;

	}
	
	public boolean haveThisPosition(int position) {
		int length = getSize();
		if (position < 0 || position > length) {		
			return false;
		}else {
			return true;
		}
	}
	
	
	public String getDataAtIndex(int index) {
		if (!haveThisPosition(index))
			throw new IndexOutOfBoundsException();
		Node lNode = header;
		for (int i = 0; i < index; i++) {
			lNode= lNode.next;
		}
		
		return lNode.value;
	}
	
	
	public boolean removeNodeWithData(String data) {
		boolean isDeleted = false;
		Node temp = header.next;
		Node prev = header;

		do {
			if (temp.value.compareTo(data) == 0) {
				if (prev.next == null) {
					prev.next = null;
					isDeleted = true;
					
				} else {
					prev.next = prev.next.next;
					isDeleted = true;
					
				}
			}
			prev = temp;
			temp = temp.next;
		} while (temp != null);

		return isDeleted;
	}
	
	boolean removeNodeAtPosition(int position) {
		if (!haveThisPosition(position))
			throw new IndexOutOfBoundsException();
		Node lNode = header;
		for (int i = 0; i < position; i++) {
			lNode= lNode.next;
		}
		lNode.next = lNode.next.next;
		return true;
	}
	
	boolean search(String searchedStr) {
		Node lNode = header;
		int middlePosition = getSize()/2;
		for (int i = 0; i < middlePosition; i++) {
			lNode= lNode.next;
		}
		//System.out.println(lNode.value + " = "+ searchedStr);
	if(searchedStr.compareTo(lNode.value)==0)
		return true;
	return false;
	}
	
	
	public void printNodes() {
		Node next = header.next;
		if (next == null)
			System.out.println("");
		else {
			String s = next.toString();
			System.out.println(s);
		}
	}

	public class Node {
		public String value;
		public Node next;
		public Node previous;

		public Node(Node next, Node previous, String value) {
			this.next = next;
			this.previous = previous;
			this.value = value;
		}

		@Override
		public String toString() {
			if (value == null)
				return "";
			StringBuilder sb = new StringBuilder(value + " ");
			sb = toString(sb, next);
			return sb.toString();
		}

		private StringBuilder toString(StringBuilder sb, Node n) {
			if (n == null)
				return sb;
			sb.append(n.value + " ");
			return toString(sb, n.next);
		}

	}

	public static void main(String[] args) {
		MyStringLinkedList list = new MyStringLinkedList();
		list.addFirst("A");
		list.addFirst("B");
		list.addLast("B");
		list.insert("OnFirstJustInsertED", 1);
		list.printNodes();
		System.out.println("Size of list is: "+list.getSize());
		System.out.println("Is OnFirstJustInsertED at middle position?: "
						+(list.search("OnFirstJustInsertED")?"YES":"NO"));
		
		boolean delete = list.removeNodeAtPosition(1);
		System.out.println("Is deleted? "+delete);
		list.printNodes();
		
		list.addLast("C");
		list.addLast("C");
		list.addFirst("C");
		delete = list.removeNodeWithData("E");
		System.out.println("Is 'E' deleted? "+delete);
		list.printNodes();
		
		delete = list.removeNodeWithData("C");
		System.out.println("Is 'C' deleted? "+delete);
		list.printNodes();
		
//		list.getNodeWithData("C");

	}
}
