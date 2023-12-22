/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		//put your code here
		// User input
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		//calculation
		int ans = a + b;
		//print the answer with calculation
		System.out.println(a + " + " + b + " = " + ans);
	}
}
