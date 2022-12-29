import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MathFunction {
	public static void main(String[] args) {

		int[] arr = new int[] { 2, 3, 7, 6, 9, 4, 5, 7 };
		HashMap<String, ArrayList<Integer>> evenOddresult = new HashMap<String, ArrayList<Integer>>();
		evenOddresult = evenOrOddNumber(arr);
		System.out.println("Even or Odd number method");
		for (String current : evenOddresult.keySet())
			System.out.println(current + evenOddresult.get(current));
		System.out.println("---------------------------------------------------");
		System.out.println("Power method");
		int pow = powerMethod(2, 3);
		System.out.println("result : " + pow);
		System.out.println("---------------------------------------------------");
		System.out.println("Revers method");
		reverse();
		System.out.println("---------------------------------------------------");
		System.out.println("Factorial method");
		int fact = 0;
		fact = factorialMethod(5);
		System.out.println("Factorial of 5 is : " + fact);
		System.out.println("---------------------------------------------------");
		System.out.println("palindrome method");
		boolean check1, check2 = false;
		String w = "madam";
		String w2 = "something";
		check1 = palindrome(w);
		System.out.println("if the word is(" + w + ") result will be: " + check1);
		check2 = palindrome(w2);
		System.out.println("if the word is(" + w2 + ") result will be: " + check2);
	}

	/**
	 * This method will take an array of numbers and search for even or odd numbers
	 * the power number
	 * 
	 * @param x(array of numbers)
	 * @return a hash map with the even and odd number
	 */
	public static HashMap<String, ArrayList<Integer>> evenOrOddNumber(int[] x) {
		HashMap<String, ArrayList<Integer>> evenOddNumber = new HashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> evevNumber = new ArrayList<Integer>();
		ArrayList<Integer> oddNumber = new ArrayList<Integer>();
		for (int index = 0; index < x.length; index++) {
			if (x[index] % 2 == 0)
				evevNumber.add(x[index]);
			else
				oddNumber.add(x[index]);
		}
		evenOddNumber.put("even", evevNumber);
		evenOddNumber.put("odd", oddNumber);

		return evenOddNumber;
	}

	/**
	 * This method will take two numbers and calculate the power number
	 * 
	 * @param base
	 * @param exponent
	 * @return the power number base parameter
	 */
	public static int powerMethod(int base, int exponent) {
		int p = 1;
		for (int index = 1; index <= exponent; index++) {
			p = p * base;
		}

		return p;
	}

	public static void reverse() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your String ");
		String sentence = scan.nextLine();
		for (int index = sentence.length() - 1; index >= 0; index--)
			System.out.print(sentence.charAt(index));
		System.out.println();
	}

	/**
	 * This method will take number and calculate factorial of that number
	 * 
	 * @param number
	 * @return factorial number
	 */
	public static int factorialMethod(int number) {
		int factorial = 1;
		for (int index = 1; index <= number; index++) {
			factorial = factorial * index;
		}
		return factorial;
	}

	/**
	 * This method will take a string and check if the given string is palindrome or
	 * not
	 * 
	 * @param word
	 * @return true if the string is palindrome and false if the string is not
	 *         palindrome
	 */
	public static boolean palindrome(String word) {
		boolean y = false;
		String vString = "";
		for (int j = word.length() - 1; j >= 0; j--)
			vString = vString + word.charAt(j);
		if (word.equalsIgnoreCase(vString)) {
			return true;
		}
		return y;
	}
}// End of MathFunction class
