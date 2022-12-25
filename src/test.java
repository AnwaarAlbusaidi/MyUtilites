
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrOfInteger = new int[] { 101, 88, 3, 65, 6, 3, 0, 0, 88, 88};
		int count = 0;

		// solve the problem using array
		System.out.println("solve the problem using array");
		System.out.println("--------------------------------------------------------------");
		for (int outrIndex = 0; outrIndex < arrOfInteger.length; outrIndex++) {
			for (int innerIndex = 1; innerIndex < arrOfInteger.length; innerIndex++) 
			{
				if (arrOfInteger[outrIndex] == arrOfInteger[innerIndex])
					count += 1;
			}
			if (count > 1) 
			{
				boolean matchFound = false;
				for (int x = outrIndex - 1; x >= 0; x--) 
				{
					if (arrOfInteger[x] == arrOfInteger[outrIndex]) 
						matchFound = true;
				}
				if(!matchFound)
					System.out.println( arrOfInteger[outrIndex] +" appeared " + count + " times.");
					count = 0;
			}
		}
	}//End of main class

}//End of test class
