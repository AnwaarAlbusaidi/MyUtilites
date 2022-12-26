import java.util.Scanner;

public class recursion {
	public static void main(String[] args) {
		System.out.println("Power method using recursion");
		int pow = powerMethodRecursion(2, 3);
		System.out.println("result : " + pow);
		System.out.println("---------------------------------------------------");
		System.out.println("Factorial method using recursion");
		int p = factorialMethodRecursion(5);
		System.out.println("result : " + p);
		System.out.println("---------------------------------------------------");
		System.out.println("revers method using recursion for the word {anwaar)");
		reverse("anwaar", 5);
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("increment and decrement method using recursion");
		number(0, 4);
		System.out.println();
		number(0, 5);
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("Fabonacci method using recursion");
		for (int i = 0; i < 8; i++)
			System.out.print(Fabonacci(i) + " ");
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("Palindrome method using recursion");
	    System.out.println( "madam is Palindrome or not : " + isPalindrome("madam" , 0));
	    System.out.println("something is Palindrome or not : " + isPalindrome("something" , 0));
	}// End of main method
    
	/**
	 * This method generate the power number for a given number
	 * @param base
	 * @param exponent
	 * Input = 2,3 // output is 8
	 * @return call to the same function to calculate the result
	 */
	public static int powerMethodRecursion(int base, int exponent) {
		if (exponent == 0)
			return 1;
		else
			return base * powerMethodRecursion(base, exponent - 1);
	}
    /**
     * This method calculate the factorial for specific number
     * @param number
     * Input 5 // output 120
     * @return call to the same function to generate the second number in the factorial series
     */
	public static int factorialMethodRecursion(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorialMethodRecursion(number - 1);
	}
	/**
	 * This method will reveres a given string and print it 
	 * @param word
	 * @param length
	 * Input anwaar // output raawna
	 */
	public static void reverse(String word, int length) {
		if (length < 0)
			System.out.print("");
		else {
			System.out.print(word.charAt(length));
			reverse(word, length - 1);
		}
	}
	/**
	 * This method generate a series of increment and decrement for a given number
	 * @param num
	 * @param count
	 * Input 4 // output  0 1 2 3 3 2 1 0
	 * Input 5 // output  0 1 2 3 4 4 3 2 1 0
	 */
	public static void number(int num, int count) {
		if (num == count)
			return;
		else {
			System.out.print(" " + (num));
			number(num + 1, count);
			System.out.print(" " + (num));
		}
	}
	/**
	 * This method generate a series of Fabonacci for a given number 
	 * @param n
	 * Input 8 /output is  0 1 1 2 3 5 8 13
     * Input 9 / output is 0 1 1 2 3 5 8 13 21
	 * @return call to the same function to generate the second number in the Fabonacci series
	 */
	public static int Fabonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return Fabonacci(n - 1) + Fabonacci(n - 2);
	}
    
	/**
	  * This method will take a string and check if the given string is palindrome or not using recursion
	  * @param word
	  * Input madam // output true
	  * Input something // output false
	  * @return true if the string is palindrome and false if the string is not palindrome
	  */
	public static boolean isPalindrome(String word, int index) {
		if(index > word.length()/2) {
			 return true;
		 }
		 return (word.charAt(index) == word.charAt(word.length()-(1+index)))&&
				 isPalindrome(word,index+1);
	}
}// End of recursion class
