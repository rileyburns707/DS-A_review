import java.util.*;
// Adjacency List
public class graphAL {
    
    // create an arraylist of LinkedLists
    ArrayList<LinkedList<nodeAL>> aList;

    graphAL() {
        aList = new ArrayList<>();
    }

    public void addNode(nodeAL node) {
        LinkedList<nodeAL> currentList = new LinkedList<>();
        currentList.add(node);
        aList.add(currentList);
    }

    public void addEdge(int src, int dst) {
        LinkedList<nodeAL> currentList = aList.get(src);    // returns linkedList
        nodeAL dstNode = aList.get(dst).get(0); // address of the node we want to link to
        currentList.add(dstNode);   // add dstNode to the tail of the currentList
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<nodeAL> currentList = aList.get(src);  
        nodeAL dstNode = aList.get(dst).get(0); 

        for(nodeAL node : currentList) {
            if(node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for(LinkedList<nodeAL> currentList : aList) {
            for(nodeAL node : currentList) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }

}
