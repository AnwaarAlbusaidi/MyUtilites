public class myFirstUtility {

	/**
	 * in the main method we declare an array of integer and pass it to a method that return the max number
	 */
	public static void main(String[] args) {

       int number [] = {50,12,8,10,1001,87,24};
      //find the largest number
      int maxNumb1 = maxNumber(number);
      System.out.println("This is the Max number " + maxNumb1);
      //find the largest number and second largest number
      int [] maxNumb = new int [2];
      maxNumb = maxNumber2(number);
    	  System.out.print("[" + maxNumb[0] + "," + maxNumb[1]+ "]" );
	}
	
	//Search from an array of integer and return the Max number
	public static int maxNumber(int[] intrgerArr)
	{
	      int maxNumber = intrgerArr[0];
	      for(int i=0;i < intrgerArr.length;i++)
	      {
	    		  if (intrgerArr[i] > maxNumber )
	    		   maxNumber = intrgerArr[i];
	      }
	      return maxNumber;
	}
	//Search from an array of integer for largest and 2nd largest number
	public static int[] maxNumber2(int[] intrgerArr)
	{
	      int [] maxArray = new int[2];
	      int max = intrgerArr[0];
	      int max2 = 0;
	      for(int i= 0;i < intrgerArr.length;i++)
	      {
	    		  if (intrgerArr[i] > max )
	    		  {
	    			   max = intrgerArr[i];
	    		  }
	      }
	      maxArray[0] = max;
	      
	      for(int i= 0;i < intrgerArr.length;i++)
	      {
					if(intrgerArr[i] < maxArray[0] && intrgerArr[i] != maxArray[0] )
					{
						if (intrgerArr[i] > max2)
							max2 = intrgerArr[i] ;
					}	
	      }
	      maxArray[1] = max2;
	      return maxArray;
	}
}//End of myFirstUtility 