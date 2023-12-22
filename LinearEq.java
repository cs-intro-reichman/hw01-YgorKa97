/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	 public static void main(String[] args) {
	        // User input of a,b,c
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        // Print out the equation
        System.out.println(a + " * x + " + b + " = " + c);
        //assume that a is not 0
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("x = " + x);
            // if a = 0, print Error
        } else {
            System.out.println("ERROR");
        }
}

}
