// Depth First Search
import java.util.ArrayList;

public class graphDfs {
    
    ArrayList<Node> nodes;
    int[][] matrix;

    graphDfs(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];   // this is why the space complexity is O(v^2)

    }

    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        // source is row. destination is column
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        if(matrix[src][dst] == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void print() {


        // not necesarry but I added it for style
        System.out.print("  ");
        for(Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        // need to print the 2D array
        for (int i =0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void depthFirstSearch(int src) {
        // Created an array of booleans with a size equal to the size of matrix
        boolean[] visited = new boolean[matrix.length];

        // helper function
        dFSHelper(src, visited);
    }

    private void dFSHelper(int src, boolean[] visited) {
        // using recursion
        if(visited[src]) {
            return;
        }
        else {
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }

        for(int i = 0; i < matrix[src].length; i++) {
            if(matrix[src][i] == 1) {
                dFSHelper(i, visited);
            }
        }
    }

}
