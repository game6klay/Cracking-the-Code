public class Partition {

    private Node point;
    public void partitionLinkedList (Node head, int partitionData){

        Node current = head;
        Node follower = null;


        while (current.next != null) {

            if (current.data < partitionData) {

                follower = current;

                System.out.println("New Linked list is" + follower.data);
                if (current.next.data < partitionData) {

                    follower.next = current.next;
                    current = current.next;
                }

            }else {current = current.next;}


        }

        current = head;

        while (current.next != null) {

            if (current.data >= partitionData) {

                follower.next = current;
                current = current.next;
            }else {current = current.next;}
        }


    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main (String[] args){

        Partition newList = new Partition();

        Node node = new Node(3);
        node.next = new Node(5);
        node.next.next = new Node(8);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(10);
        node.next.next.next.next.next = new Node(2);
        node.next.next.next.next.next.next = new Node(1);

        newList.partitionLinkedList(node,5);

    }


}

class Node {

    public Node next;
    public int data;

    public Node (int data){

        next = null;
        this.data = data;
    }

}