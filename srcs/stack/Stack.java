package srcs.stack;

public class Stack<T> {
	
	private class Node {
		T info;
		Node next;
		
		public Node(T info) {
			this.info = info;
			this.next = null;
		}
	}
	
	private Node top;
	
	public Stack() {
		top = null;
	}
	
	public void push(T info) {
		Node n = new Node(info);
		if (top == null)
			top = n;
		else {
			n.next = top;
			top = n;
		}
	}
	
	public T top() throws IllegalAccessError {
		if (top == null)
			throw new IllegalAccessError();
		
		return top.info;
	}
	
	public T pop() throws IllegalAccessError {
		if (top == null)
			throw new IllegalAccessError();
		
		T v = top.info;
		top = top.next;
		
		return v;
	}
}
