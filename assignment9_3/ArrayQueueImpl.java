package assignment9_3;


import java.util.Arrays;

public class ArrayQueueImpl {
	
	private int[] arr = new int[10];
	 int size = 0;
	private int front = 0;
	private int rear = 0;
	
	
	public boolean isEmpty() {
	return size == 0;
	}
	public int size() {
		return rear-front-1;
	}

	public void enqueue(int val) {
		if(isEmpty()) {
			arr[rear]=val;
			rear++;
			size++;
		}
		if(!isEmpty() && rear<arr.length) {
			arr[rear]=val;
			rear++;
			size++;
		}
		else {
			resize();
			arr[rear]=val;
			rear++;
			size++;
		}
	}
	public int dequeue() {
		if(isEmpty()|| front>arr.length-1) throw new IllegalStateException("Cannot peek because Queue is empty!");
		int item= arr[front];
		front++;
		size--;
		return item;
	}
	public int peek() {
		if(isEmpty()||front>arr.length-1) throw new IllegalStateException("The Queue is Empty");
		int item = arr[front];
		return item;
	}
	public void resize() {
		System.out.println("Resizing...");
		int[] tempArr = new int[2*arr.length];
		System.arraycopy(arr,front,tempArr,front,size);
		arr = tempArr;
	}
	public void printQueue() {
		for(int i=front;i<rear;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		ArrayQueueImpl q = new ArrayQueueImpl();
		
		//uncomment when ready
		for(int i = 0; i < 15; i ++) {
			q.enqueue(i);
			}
	
		for(int i = 0; i < 14; i ++) {
			q.dequeue();
	}
		
		System.out.println(q.size());
		
		System.out.println(q.peek());
	}
	

}
