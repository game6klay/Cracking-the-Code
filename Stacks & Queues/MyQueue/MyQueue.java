public class MyQueue {

	private Stack<Integer> stack1;
	private Stack<Integer> stack2;
	

	public MyQueue(){

		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();

	}

	public void moveStack1ToStack2() {

		while(!stack1.isEmpty()) {
			stack2.push(stack1.pop());
		}
	}

	public boolean isEmpty() {

		return stack1.isEmpty() && stack2.isEmpty();
	}

	public int size() {
        return stack1.size() + stack2.size();     
    }

    public Item peek() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (stack2.isEmpty()) moveStack1ToStack2();
        return stack2.peek();
    }

    public Item dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        if (stack2.isEmpty()) moveStack1ToStack2();
        return stack2.pop();
    }

    public void enqueue(Item item) {
        stack1.push(item);
    }

}

class Queue<T> {

	private static class QueueNode<T> {

		private T data;
		private QueueNode next;

		public QueueNode<T> (T item) {

			this.data = data;
		}
	}

	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T item) {

		QueueNode<T> temp = new QueueNode<T>(item);
		if (last != null) {

			last.next = temp;
		}

		last = temp;

		if (first == null){

			first == last;
		}

	}

	public T remove () {

		if (first == null) return null;
		

			first.data = T item;
			first = first.next;

		if (first == null) {
			last == null;
		}

		return item;
	}

	public T peek() {
		if (first == null) return null;

		return first.data;
	}

	public boolean isEmpty(){

		return first == null;
	}
}
