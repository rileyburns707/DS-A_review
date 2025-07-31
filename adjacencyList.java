public class adjacencyList {

    public static void main(String[] args) {
        
        graphAL graph = new graphAL();

        graph.addNode(new nodeAL('A'));
        graph.addNode(new nodeAL('B'));
        graph.addNode(new nodeAL('C'));
        graph.addNode(new nodeAL('D'));
        graph.addNode(new nodeAL('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();

    }
    
}
