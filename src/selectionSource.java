import javax.imageio.ImageTranscoder;

public class selectionSource {

	/**
	 * @param to swap values inside array written by : Anwaar Al-Busaidi
	 */
	public static void main(String[] args) {

		int[] arr = { 4, 3, 2, 1 };
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		// swap
		int z = arr[0];
		arr[0] = arr[1];
		arr[1] = z;
		System.out.println();
		System.out.println("after swap first and second index");
		for (int index = 0; index < arr.length; index++) {
			System.out.print(arr[index] + " ");
		}
		System.out.println();
		System.out.println("-----------------------------------");
		// sorting
		int[] arr2 = { 50, 12, 8, 10, 1001, 6, 87, 24 };
		System.out.println("Array before swap");
		for (int index = 0; index < arr2.length; index++) {
			System.out.print(arr2[index] + " ");
		}
		// sort using bubble sort
		System.out.println();
		System.out.println("Array after swap");
		int swapArr[] = BubbleSorting(arr2);
		for (int index = 0; index < arr2.length; index++) {
			System.out.print(swapArr[index] + " ");
		}

		// sort using selection sort
		System.out.println();
		System.out.println("Array after swap");
		int swapArr2[] = selectionSorting(arr2);
		for (int index = 0; index < arr2.length; index++) {
			System.out.print(swapArr2[index] + " ");
		}
	}// end of main class

	// method to sort in DES order using Bubble sort
	public static int[] BubbleSorting(int[] x) {
		for (int outerindex = 0; outerindex < x.length; outerindex++) {
			for (int innerindex = outerindex + 1; innerindex < x.length; innerindex++) {
				if (x[outerindex] < x[innerindex]) {
					int temp = x[outerindex];
					x[outerindex] = x[innerindex];
					x[innerindex] = temp;
				}
			}
		}
		return x;
	}

	// method to sort in DES order using Selection sort
	public static int[] selectionSorting(int[] y) {
		for (int outerIndex = 0; outerIndex < y.length; outerIndex++) {
			int maxIndex = 0;
			int maxValue = 0;
			for (int index = outerIndex; index < y.length; index++) {
				if (y[index] > maxValue)// Find the Max value and store it in temp variable
				{
					maxIndex = index;
					maxValue = y[index];
				}
			}
			// swap the max value with the first element
			int tmpVal = y[outerIndex];
			y[outerIndex] = y[maxIndex];
			y[maxIndex] = tmpVal;
		}
		return y;
	}

}// end of selectionSource class
