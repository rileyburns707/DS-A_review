import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        
        Stack<String> stack = new Stack<String>(); // declare a stack and instantiate it
        
        // System.out.println(stack.empty());
        // going over .push()
        stack.push("Discoures and Selective Writings");
        stack.push("The Leviathan");
        stack.push("Meditations");
        stack.push("Meditations of the First Philosophy");
        
        // going over .empty()
        /* 
        System.out.println(stack.empty());
        System.out.println(stack);
        */

        System.out.println(stack);  // prints all items in stakc
       
        // Going over .pop()
        /* stack.pop();    // returns popped object
        String myFavBook = stack.pop();
        System.out.println(stack);
        System.out.println(myFavBook);
        */

        // going over .peek()
        /* 
        System.out.println(stack.peek());
        System.out.println(stack);
        */

        // going over .search()
        /* 
        System.out.println(stack.search("Meditations of the First Philosophy"));
        System.out.println(stack.search("Meditations"));
        System.out.println(stack.search("The Leviathan"));
        System.out.println(stack.search("Discoures and Selective Writings"));
        System.out.println(stack.search("The Prince"));     // returns -1 because it is not in stack
        */

    }
    
}
