public class recursion {
    
    /* Walking simulation example
    public static void main(String[] args) {
        
        // iterative walk 
        walk(5);
        
        // recursive walk 
        walking(5);
    }
    // iterative walk method
    private static void walk(int steps) {
        for(int i = 0; i < steps; i++) {
            System.out.println("You take an iterative step");
        }
    }
    // recursive walk method
    private static void walking(int steps) {
        // base case
        if(steps < 1) {
            return;
        }
        System.out.println("You take a recursive step");

        // recursive case
        walking(steps - 1);
    }
    */

    /*  Factorial example
    public static void main(String[] args) {
        // recursive method 
        System.out.println(factorial(7));
        
    }
    
    private static int factorial(int num) {
        // base case
        if(num < 1) {
            return 1;
        }

        // recursive case
        return num * factorial(num - 1);
        
    }
    */

    // Exponent example
    public static void main(String[] args) {
        System.out.println(power(2, 8));
    }
    
    private static int power(int base, int exponent) {
        // base case
        if(exponent < 1) {
            return 1;
        }

        // recursive case
        return base * power(base, exponent - 1);
        
    }

}
