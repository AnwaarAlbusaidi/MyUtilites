import java.util.HashMap;

public class duplicateCharInArray {
	public static void main(String[] args) {
		char[] arr = new char[] { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' };

		System.out.println("array before remove duplicaion");
		System.out.println("{'c', 'a', 'c', 't', 'r', 'a', 't', 'z'}");
		System.out.println();
		System.out.println("solve the problem using array");
		System.out.println("--------------------------------------------------------------");
		duplicateCharInArray(arr);
		System.out.println();
		char[] arr2 = new char[] { 'c', 'a', 'c', 't', 'r', 'a', 't', 'z' };
		System.out.println("--------------------------------------------------------------");
		System.out.println("solve the problem using Hash map");
		duplicateCharInArrayHaspMap(arr2);
	}// End of main class

	public static void duplicateCharInArray(char[] y) {
		int count = 1;
		boolean matchFound = false;
		for (int i = 0; i < y.length; i++) {
			for (int j = 1; j < y.length; j++) {
				if (y[i] == y[j])
					count += 1;
			}
			matchFound = false;
			{
				for (int x = i - 1; x >= 0; x--) {
					if (y[x] == y[i])
						matchFound = true;
				}
				if (!matchFound)
					System.out.print(y[i] + " ");
			}
			count = 1;
		}
	}

	public static void duplicateCharInArrayHaspMap(char[] y) {

		HashMap<Character, Integer> repatedChar = new HashMap<Character, Integer>();
		for (int index = 0; index < y.length; index++) {
			if (repatedChar.containsKey(y[index]))
				repatedChar.put(y[index], repatedChar.get(y[index]) + 1);
			else
				repatedChar.put(y[index], 1);
		}
		for (char current : repatedChar.keySet()) {
			System.out.print(current + " ");

		}
	}

}// End of duplicateCharInArray
