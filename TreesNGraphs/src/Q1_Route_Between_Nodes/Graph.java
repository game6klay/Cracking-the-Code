package Q1_Route_Between_Nodes;

/**
 * Created by jay on 12/21/16.
 */
public class Graph {
    public static int MAX_VERTICES = 6;

    private Node[] vertices;
    public int count;

    public Graph () {

        vertices = new Node[MAX_VERTICES];
        count =0;
    }

    public void addNode (Node x) {

        if (count < vertices.length) {

            this.vertices[count] = x;
        }
        else {
            System.out.println("Graph is full");
        }
    }

    public Node[] getNodes () {

        return vertices;
    }
}
