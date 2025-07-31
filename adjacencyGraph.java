// Adjacency Matrix
public class adjacencyGraph {
    
    public static void main(String[] args) {

        Graph graph = new Graph(5); // 5 nodes

        // made the addNode() method in Graph.java
        graph.addNode(new Node('A'));   // would have an index of 0
        graph.addNode(new Node('B'));   // would have an index of 1
        graph.addNode(new Node('C'));   // would have an index of 2
        graph.addNode(new Node('D'));   // etc.
        graph.addNode(new Node('E'));
        
        // pass in the index of each node to create an edge
        // matches the picture in the notes
        graph.addEdge(0, 1);    // edge between A and B
        graph.addEdge(1, 2);    // edge between B and C
        graph.addEdge(2, 3);    // edge between C and D
        graph.addEdge(2, 4);    // edge between C and D
        graph.addEdge(4, 0);    // edge between E and A
        graph.addEdge(4, 2);    // edge between E and C

        graph.print();

        System.out.println(graph.checkEdge(0, 1));  // should be true
        System.out.println(graph.checkEdge(3, 2)); // should be false
    }
}
