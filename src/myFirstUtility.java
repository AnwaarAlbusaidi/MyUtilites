public class myFirstUtility {

	/**
	 * in the main method we declare an array of integer and pass it to a method that return the max number
	 */
	public static void main(String[] args) {

      int number [] = {5,6,10,1,101};
      int maxNumb = maxNumber(number);
      System.out.println("This is the Max number " + maxNumb);

	}
	//Search from an array of integer and return the Max number
	public static int maxNumber(int[] intrgerArr)
	{
	      int maxNumber = 0;
	      for(int i=0;i<intrgerArr.length;i++)
	      {
	    	  if (intrgerArr[i]> maxNumber )
	    		  maxNumber = intrgerArr[i];
	      }
	      return maxNumber;
	}
}//End of myFirstUtility