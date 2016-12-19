public class DeleteDuplicates {

	public Node head;
	
	public void deleteDups (Node head) {

		if (head == null) {
			return;
		}
		HashSet<Integer> set = new HashSet<Integer>();
		Node previous = null;

		while(head != null) {
			if (set.contains(head.data)){
				previous.next = head.next;
			}
			else {

				set.add(head.data);
				previous = head;
			}
			head = head.next;
		}
	}

	// how to delete the dulplicates when no buffers are allowed to use 
	public void followUp (Node head) {

		if (head == null) {
			return;
		}
		Node current = head;
		Node runner = head;

		while (current != null){

			int temp = current.data;

			while (runner.next != null) {
				if (temp == runner.next.data) {

					runner.next = runner.next.next;
				}

				else {
					runner = runner.next;

				}


			}
			current = current.next;
		}
	}
}

class Node {

	public int data;
	public Node next;

	Node (int data){

		data = data;
		next = null;
	}
}