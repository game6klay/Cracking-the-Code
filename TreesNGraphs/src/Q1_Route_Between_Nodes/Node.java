package Q1_Route_Between_Nodes;

public class Node {

    private Node[] adjacent;
    private String vertex;
    public int adjacentCount;
    public Question.State state;

    public Node (String vertex, int adjacentLength) {
        this.vertex = vertex;
        adjacentCount = 0;
        adjacent = new Node[adjacentLength];

    }

    public void addAdjacent (Node x) {

        if (adjacentCount < adjacent.length) {

            this.adjacent[adjacentCount] = x;
            adjacentCount ++;
        }

        else {
            System.out.println("No new nodes to be added");
        }
    }

    public Node[] getAdjacent() {

        return adjacent;
    }

    public String getVertex() {
        return vertex;
    }
}