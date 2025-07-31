// Binary Search Tree
public class mainBST {
    
    public static void main(String[] args) {
        
        binarySearchTree tree = new binarySearchTree();

        tree.insert(new nodeBST(5));    // Anonymous node 
        tree.insert(new nodeBST(1));
        tree.insert(new nodeBST(9));
        tree.insert(new nodeBST(2));
        tree.insert(new nodeBST(7));
        tree.insert(new nodeBST(3));
        tree.insert(new nodeBST(6));
        tree.insert(new nodeBST(4));
        tree.insert(new nodeBST(8));

        tree.remove(1);
        // tree.remove(5);
        tree.remove(0);
        tree.display();

        // System.out.println(tree.search(0)); // false
        // System.out.println(tree.search(1)); // true
        
        
    }
}
