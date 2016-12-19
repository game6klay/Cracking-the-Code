public class MyStack {
	
	private static class StackNode<T> {

		private T data;
		private StackNode<T> next;

		public StackNode(T data){

			this.data = data;
		}
	}

	private StackNode<t> top;

	public T pop() {

		if (top == null) throw new EmptyStackException();
		T item = top.data;

		top = top.next;

		return item;
		
	}

	public void push(T item) {

		if (top == null) {

			top.data = item;
		}

		else {

			StackNode<t> node = new StackNode<T>(item);
			node.next = top;
			top = node;
		}
	}

	public T peek() {

		if (top == null) throw new EmptyStackException();
		return top.data;
	}

	public boolean isEmpty() {

		return top == null ;
	}

}
