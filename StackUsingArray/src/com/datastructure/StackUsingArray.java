package com.datastructure;

public class StackUsingArray {
	
	private int arr[];
	private int capacity;
	private int top;
	
	StackUsingArray(int size){
		
		arr = new int[size];
		capacity = size;
		top=-1;
	    
		
	}
	
	//method to insert element
	public void push(int data) {
		
		if(isFull()) {
			
			System.out.println("Stack Overflow");
			System.exit(-1);
		}else {
			
			arr[++top]=data;
		}
	}
	
	//method to delete data
	public int pop() {
		
		if(isEmpty()) {
			
			System.out.println("Stack under flow");
			System.exit(-1);
		} 
		
		return arr[top--];
		
		
		
	}
	
	//method to peek data return top element
		public int peek() {
			
			if(!isEmpty()) {
			
				return arr[top];
			}else {
				System.exit(-1);
			}
			
			return -1;                
		}
	
	//boolean method to return if stack is empty or not
	private boolean isEmpty() {
		
		return top==-1;
	}
	
	// boolean method to return if stack is full or not
	private boolean isFull() {
		
		return top == capacity -1;
	}
	
	//method to return array size
	private int size() {
		return top+1;
	}


	

	public static void main(String[] args) {
	
		StackUsingArray sua = new StackUsingArray(6);
		
		sua.push(1);
		sua.push(2);
		sua.push(3);
		sua.push(4);
		sua.push(5);
		sua.push(6);
		//sua.push(7);  check stack over flow condition
		
		sua.pop();
		sua.pop();
		
		System.out.println("element at top of stack"+ " "+sua.peek());
		
		
		
		for (int i=0;i<sua.size();i++) {
			
			System.out.print(sua.arr[i]+" ");
		}
		
		

	}

}
