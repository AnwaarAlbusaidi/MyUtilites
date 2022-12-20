import java.util.HashMap;

/**
 * @author Anwaar Al-Busaidi
 *
 */
public class hashMap1 {

	public static void main(String[] args) {

		int[] arrOfInteger = new int[] { 101, 88, 3, 65, 6, 3, 0, 0, 88, 88 };
		int count = 1;

		// solve the problem using array
		System.out.println("solve the problem using array");
		System.out.println("--------------------------------------------------------------");
		for (int outrIndex = 0; outrIndex < arrOfInteger.length; outrIndex++) {
			for (int innerIndex = 1; innerIndex < arrOfInteger.length; innerIndex++) {
				if (arrOfInteger[outrIndex] == arrOfInteger[innerIndex])
					count += 1;
			}
			if (count > 1) {
				boolean matchFound = false;
				for (int x = outrIndex - 1; x >= 0; x--) {
					if (arrOfInteger[x] == arrOfInteger[outrIndex]) {
						matchFound = true;
					}
				}
				if (!matchFound)
					System.out.println(arrOfInteger[outrIndex] + " appeared " + count + " times.");
			}
			count = 0;
		}

		System.out.println("--------------------------------------------------------------");
		// solve the problem using hash map
		System.out.println("solve the problem using hash map");
		System.out.println("--------------------------------------------------------------");
		HashMap<Integer, Integer> repatedNum = new HashMap<Integer, Integer>();
		for (int index = 0; index < arrOfInteger.length; index++) {
			if (repatedNum.containsKey(arrOfInteger[index]))
				repatedNum.put(arrOfInteger[index], repatedNum.get(arrOfInteger[index]) + 1);
			else
				repatedNum.put(arrOfInteger[index], 1);
		}
		for (int current : repatedNum.keySet()) {
			if (repatedNum.get(current) > 1)
				System.out.println(current + " appeared " + repatedNum.get(current) + " times.");

		}
	}// End of Main class

}// End of hashMap1 class