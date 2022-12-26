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
//	    String example = "madam";
//	    isPalindrome(example , 0);

	}// End of main method

	public static int powerMethodRecursion(int base, int exponent) {
		if (exponent == 0)
			return 1;
		else
			return base * powerMethodRecursion(base, exponent - 1);
	}

	public static int factorialMethodRecursion(int number) {
		if (number == 1)
			return 1;
		else
			return number * factorialMethodRecursion(number - 1);
	}

	public static void reverse(String word, int length) {
		if (length < 0)
			System.out.print("");
		else {
			System.out.print(word.charAt(length));
			reverse(word, length - 1);
		}
	}

	public static void number(int num, int count) {
		if (num == count)
			return;
		else {
			System.out.print(" " + (num));
			number(num + 1, count--);
			System.out.print(" " + (num));
		}
	}

	public static int Fabonacci(int n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return Fabonacci(n - 1) + Fabonacci(n - 2);
	}

	public static boolean isPalindrome() {
		return true;
	}
}// End of recursion class
