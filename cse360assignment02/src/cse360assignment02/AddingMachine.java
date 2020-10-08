package cse360assignment02;

/**
 * The AddingMachine program implements an application that simply adds and
 * subtracts an int value, the program then prints out all of the arithmetic
 * history.
 *
 * @author Cody Currie
 * @version 1.1
 * @since 2020-10-7
 */

public class AddingMachine {
	/**
	 * Total value at any given time.
	 */
	private int total;
	
	/**
	 * String representing arithmetic history.
	 */
	private String history = "";

	/**
	 * This class creates an AddingMachine object that can add and subtract an int
	 * value.
	 */
	public AddingMachine() {
		total = 0; // not needed - included for clarity
		history += "0";
	}

	/**
	 * Returns the current total.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Adds an int value to the current total.
	 * @param value
	 */
	public void add(int value) {
		total += value;
		history += " + " + value;
	}

	/**
	 * Subtracts a value from the current total.
	 * @param value
	 */
	public void subtract(int value) {
		total -= value;
		history += " - " + value;
	}

	/**
	 * Prints out a formatted String representation of the operations and
	 * values.
	 */
	public String toString() {
		return history;
	}

	/**
	 * Clears all of the current operations from the String, and resets the total.
	 */
	public void clear() {
		total = 0;
		history = "";
	}
}