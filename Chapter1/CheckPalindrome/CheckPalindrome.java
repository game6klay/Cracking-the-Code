/*
Given a linked list , write a function to check its a palindrome or not
*/



public class CheckPalindrome {

	public boolean isPalindrome(Node node) {

		Node current;
		Node runner;
		Stack <Integer> stack = new Stack<Integer> ();


		while (runner != null && runner.next != null) {

			stack.push(current.value);
			current = current.next;
			runner = runner.next.next;

		}

		if (current != null) {

			current = current.next;
		}

		while(current.next != null){

			if (stack.pop().intValue() != current.value){

				return false;
			}

			else {
				current = current.next;
			}

			return true;
		}
	}
	

}

private class Node {

	private int value;
	private Node next;
}