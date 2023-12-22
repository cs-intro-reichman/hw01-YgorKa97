/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		//user input for lower and upper bound.
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        // Three random numbers
        int rand1 = a + (int) (Math.random() * (b-a));
        int rand2 = a + (int) (Math.random() * (b-a));
        int rand3 = a + (int) (Math.random() * (b-a));
        // print random numbers
        System.out.println("First random number is: " + rand1);
        System.out.println("Second random number is: " + rand2);
        System.out.println("Third random number is: " + rand3);
        // find the minimal number
        int min = Math.min(Math.min(rand1,rand2),rand3);
        System.out.println("The minimal generated number was: " + min);	
	}
}
