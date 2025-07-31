
public class binarySearchTree {
    
    nodeBST root;

    // using a lot of helper methods because it is easier to use recurrsion 
    
    public void insert(nodeBST node) {
        root = insertHelper(root, node);
    }
    private nodeBST insertHelper(nodeBST root, nodeBST node) {
        int data = node.data;

        if(root == null) {
            root = node;
            return root;
        }
        else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        }
        else {
            root.right = insertHelper(root.right, node);
        }
        
        return root;
    }

    public void display() {
        displayHelper(root);
    }
    private void displayHelper(nodeBST root) {
        // in order traversial. Uses recursion. All nodes displayed in nondecreasing order
        if(root != null) {
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }
    private boolean searchHelper(nodeBST root, int data) {
        
        if(root == null) {
            return false;
        }
        else if(root.data == data) {
            return true;
        }
        else if(root.data > data) {
            return searchHelper(root.left, data);
        }
        else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {

        if(search(data)) {
            removeHelper(root, data);
        }
        else {
            System.out.println(data + " could not be found");
        }
    }
    private nodeBST removeHelper(nodeBST root, int data) {
        
        if(root == null) {
            return root;
        }
        else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data) {
            root.right = removeHelper(root.right, data);
        }
        else { // node found
            if(root.left == null && root.right == null) {
                root = null;
            }
            else if(root.right != null) {   // find a successor to replace this node
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else {  // find a predecessor to replace this node
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
            return root;
        }

        return null;
    }

    // find the least value below the right child of this root node
    private int successor(nodeBST root) {   
        root = root.right;
        while(root.left != null) {  // left because lower numbers are left
            root = root.left;
        }
        return root.data;
    }

    // find the greatest value below the left child of this root node
    private int predecessor(nodeBST root) {
        root = root.left;
        while(root.right != null) {  // left because lower numbers are left
            root = root.right;
        }
        return root.data;
    }

}
