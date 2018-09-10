package assignment9_1;

public class MyStack {
	MyStringLinkedList stack;
	
	MyStack(){
		stack = new MyStringLinkedList();
	}
	
	public void push(String item) {
		stack.addFirst(item);
	}
	public String pop() {
		return stack.removeForStack();
	}
	public String peek() {
		return stack.getFirstElement();
	}

	public static void main(String[] args) {
				
		MyStack stack = new MyStack();
		stack.push("Bob");
		stack.push("Harry");
		stack.push("Alice");
		System.out.println("Popping..."+stack.pop());
		System.out.println("Peeking..."+stack.peek());
		System.out.println("Popping..."+stack.pop());

	}

}
