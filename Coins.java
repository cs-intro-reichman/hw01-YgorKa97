/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// User input of coins amount
		int coins =  Integer.parseInt(args[0]);
		//Function that counts how many quarters in coins
		int quarters = coins / 25;
		//Function that count cents 
		int cents = coins % 25;
		//Print out
		System.out.println("Use " + quarters + " quarters and " + cents + " cents");
	}
}
