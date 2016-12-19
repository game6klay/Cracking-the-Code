/*
1. Run through each of the linked lists to find out the length of the lists
2. Compare the tails of both, if they are different then are not intersecting
3. Set two pointer to the start of the linked lists 
4. On the longer list advance the pointer by the length of the difference
5. Traverse through the pointer untill one of them is the same, return the pointer

*/

public class FindIntersection {
	
	public Node getIntersection (Node list1, Node list2){

		if (list1 == null || list2 == null) {

			return null;
		}

		Result result1 = getTailandSize(list1);
		Result result2 = getTailandSize(list2);

		if (result1.tail != result2.tail) {

			return null;
		}

		Node shorter = result1.size < result2.size ? list1 : list2;
		Node shorter = result1.size < result2.size ? list2 : list1;

		longer = getKthNode(longer, Math.abs(result1.size - result2.size));

		while ( longer != shorter) {

			shorter = shorter.next;
			longer = longer.next;
		}

		return longer;

	}
}

class Result {

	public Node tail;
	public int size;
	public Result(Node tail, int size) {

		this.tail = tail;
		this.size = size;
	}
}

Result getTailandSize(Node list) {

	if (list == null) {
		return null;
	}

	int size =1;
	Node current = list;

	while (current.next != null) {

		current = current.next;
		size++;
	}

	return new Result(current,size);
}

Node getKthNode (Node list, int k) {

	Node current = head;
	while(k>0 && current != null) {
		current = current.next;
		k--;
	}

	return current;

}

class Node {

	public Node next;
	public int value;

	public Node (int value) {

		this.value = value;
	}
}

