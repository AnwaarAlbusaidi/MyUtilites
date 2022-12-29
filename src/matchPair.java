import java.util.HashMap;

public class matchPair {
	public static void main(String[] args) {

		// int[] number = new int[] { 2, 1, 3, 8, 4, 6, 3};
		int[] number1 = new int[] { 6, 6, 6, 4, 4, 4, 4 }; // output {(6,4),(6,4),(6,4)}
		int[] number2 = new int[] { 6, 6, 6, 4, 4, 4, 5 };// output {(6,4),(6,4),(6,4)}
		int[] number3 = new int[] { 3, 7, 5, 5, 2, 8, 9 };// output {(3,7),(5,54),(8,8)}
		int[] number4 = new int[] { 6, 7, 4, 3, 4, 5, 6 };// output {(6,4),(3,7),(6,4)}

//		System.out.println("--------------------------------------------------------------");
//		System.out.println("solve the problem of finding the match pair that equal 10 using array");
//		System.out.println("--------------------------------------------------------------");
//		matchPair1(number);
		matchPairHashMap(number1);
		System.out.println();
		matchPairHashMap(number2);
		System.out.println();
		matchPairHashMap(number3);
		System.out.println();
		matchPairHashMap(number4);

	}// End of main class

	public static void matchPair1(int[] num) {
		int[] pair = new int[2];
		boolean match = false;
		int x = 0, y = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 1; j < num.length; j++) {
				if (num[i] + num[j] == 5) {
					if (pair[0] == num[i] && pair[1] == num[j])
						match = true;
					if (!match) {
						pair[0] = num[i];
						pair[1] = num[j];
						x = pair[0];
						y = pair[1];
					}
					if (x == pair[0] && y == pair[1]) {
						System.out.println(pair[0] + ", " + pair[1]);
						break;
					}
				}
			}
		}
	}// End of matchPair method

	// solve the problem using hash map
	public static void matchPairHashMap(int[] num) {
		// 6,7,4,3,6,4,9,1,6,4,8
		int y;
		int target = 10;
//		System.out.println("--------------------------------------------------------------");
//		System.out.println("solve the problem using hash map of finding the match pair that equal 10");
//		System.out.println("--------------------------------------------------------------");
		HashMap<Integer, Integer> pairMatch = new HashMap<Integer, Integer>();
		for (int i = 0; i < num.length; i++) {
			y = target - num[i];
			if (pairMatch.containsKey(y) && pairMatch.get(y) == 1) {
				pairMatch.put(num[i], 1);
				pairMatch.put(y, 1);
			} else
				pairMatch.put(num[i], 0);
			// System.out.println( num[i]+ " , " + y);
		}
	}// End of matchPairHashMap method
}// End of matchPair class
