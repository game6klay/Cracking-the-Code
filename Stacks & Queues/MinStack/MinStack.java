public class MinStack {

	private Node top;

	public void push (int x) {
		if (top == null) {

			top = new Node(x);
		}

		else {

			Node temp = new Node(x);
			temp.next = top;
			temp.min = Math.min(top.min , x);
			top =temp;

		}

	}

	public void pop() {

		if(top == null)
		{
			System.out.println("Stack empty!");
			return;
		}

		top = top.next;
	}

	public int top()
	{
		if(top == null)
		{
			System.out.println("Stack empty!");
			return Integer.MAX_VALUE;
		}
		
		return top.value;
	}

	public int min()
	{
		if(top == null)
		{
			System.out.println("Stack empty!");
			return Integer.MAX_VALUE;
		}
		
		return top.min;
			
	}

	public static void main(String args[])
	{


		MinStack stack = new MinStack();
		stack.push(7);
		stack.push(5);
		System.out.println(mStack.min());
		stack.push(3);
		stack.push(9);
		System.out.println(mStack.min());
		stack.push(11);
		stack.push(8);
		System.out.println(mStack.min());
		mStack.pop();
		mStack.pop();
		System.out.println(mStack.min());

	}
	

}

class Node {

	private Node next;
	private int value;
	private int min;

	public Node (int x) {

		value = x;
		next = null;
		min = x;
	}
}