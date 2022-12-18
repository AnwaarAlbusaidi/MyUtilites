public class myFirstUtility {

	/**
	 * in the main method we declare an array of integer and pass it to a methods
	 * that return the largest and 2ns largest and 3rd largest number
	 */
	public static void main(String[] args) {

		int number[] = { 50, 12, 8, 10, 1001, 87, 24 };
		// find the largest number
		int maxNumb1 = maxNumber(number);
		System.out.println("This is the Max number " + maxNumb1);
		// find the largest number and 2nd largest number
		int[] maxNumb = new int[2];
		maxNumb = maxNumber2(number);
		System.out.print("[" + maxNumb[0] + "," + maxNumb[1] + "]");
		System.out.println();
		// find the largest ,2nd largest and 3rd largest number
		int[] maxNumb3 = new int[3];
		maxNumb3 = maxNumber3(number);
		System.out.print("[" + maxNumb3[0] + "," + maxNumb3[1] + "," + maxNumb3[2] + "]");
	}

	// Search from an array of integer and return the Max number
	public static int maxNumber(int[] intrgerArr) {
		int maxNumber = intrgerArr[0];
		for (int i = 0; i < intrgerArr.length; i++)// Search for the largest number
		{
			if (intrgerArr[i] > maxNumber)
				maxNumber = intrgerArr[i];
		}
		return maxNumber;
	}

	// Search from an array of integer for largest and 2nd largest number
	public static int[] maxNumber2(int[] intrgerArr) {
		int[] maxArray = new int[2];
		int max = intrgerArr[0];
		int max2 = 0;
		for (int i = 0; i < intrgerArr.length; i++)// Search for the largest number
		{
			if (intrgerArr[i] > max) {
				max = intrgerArr[i];
			}
		}
		maxArray[0] = max;// store largest number in first index in the array

		for (int i = 0; i < intrgerArr.length; i++) {
			if (intrgerArr[i] < maxArray[0] && intrgerArr[i] != maxArray[0])// Search for 2nd largest number
			{
				if (intrgerArr[i] > max2)
					max2 = intrgerArr[i];// store 2nd largest number in second index in the array
			}
		}
		maxArray[1] = max2;
		return maxArray;
	}

	//// Search from an array of integer for largest ,2nd largest and 3rd largest
	//// number
	public static int[] maxNumber3(int[] intrgerArr) {
		int[] maxArray = new int[3];
		int max = intrgerArr[0];
		int max2 = 0;
		int max3 = 0;
		for (int i = 0; i < intrgerArr.length; i++) // Search for the largest number
		{
			if (intrgerArr[i] > max) {
				max = intrgerArr[i];
			}
		}
		maxArray[0] = max; // store largest number in first index in the array

		for (int i = 0; i < intrgerArr.length; i++) {
			if (intrgerArr[i] < maxArray[0] && intrgerArr[i] != maxArray[0])// Search for 2nd largest number
			{
				if (intrgerArr[i] > max2)
					max2 = intrgerArr[i];
			}
		}
		maxArray[1] = max2;// store 2nd largest number in second index in the array

		for (int i = 0; i < intrgerArr.length; i++) {
			if (intrgerArr[i] < maxArray[1] && intrgerArr[i] != maxArray[1])// Search for 3rd largest number
			{
				if (intrgerArr[i] > max3)
					max3 = intrgerArr[i];
			}
		}
		maxArray[2] = max3;// store 3rd largest number in third index in the array
		return maxArray;
	}
}// End of myFirstUtility