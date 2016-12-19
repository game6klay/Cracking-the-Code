public class LoopDetection {

	public class static Node {

		private int value;
		private Node next;

		public Node (int value) {

			this.value = value;
		}
	}

	Node head;
	Node tail;

	public LoopDetection(){};

	public LoopDetection(int value) {

		Node n1 = new Node(value);
		this.head = n1;
		this.tail = n1;

	}

	public void introduceLoop (int length) {

		if (this.head == null) {

			return 
		}

		Node p1 = this.head;
		Node p2 = this.head;

		int count =0;

		while (count < length) {

			if(p2 == null) {
				break;
			}

			p2 = p2.next;
			count++;
		}

		Node prev2 = p2;

		while (p2 != null)
        {
        	    prevP2 = p2;
	            p2 = p2.next;
	            p1 = p1.next;
	        }

	        prevP2.next = p1;
		}


}