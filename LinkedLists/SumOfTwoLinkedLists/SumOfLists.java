public class SumOfLists {


	Node result = null;
	Node lastPointer = new Node();
	int carry =0;

	public Node sumInReverse(Node n1, Node n2) {

		if (n1 == null && n2 == null){

			return null;
		}

		while(n1 != null || n2 != null) {

			if ((n1.next == null && n2.next == null) && (n1.data + n2.data + carry> 9)) {

				result.data = (n1.data + n2.data) - 10;
				result.next = lastPointer;
				lastPointer.data = 1;

				if (n2.data + n2.data <=9) {
					n3.data = n2.data + n1.data;
					carry =0;

					n1 = n1.next;
					n2 = n2.next;
					result = result.next;	
				}
				else {
					n3.data = n2.data + n1.data -10;
					carry

					n1 = n1.next;
					n2 = n2.next;
					result = result.next;	
				}

			}

		}

		return result;

	}
	}
}