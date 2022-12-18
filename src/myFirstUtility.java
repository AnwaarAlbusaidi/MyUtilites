import javax.imageio.ImageTranscoder;

public class myFirstUtility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

      int number [] = {5,6,10,1,101};
      int maxNumb = maxNumber(number);
      System.out.println("This is the Max number " + maxNumb);

	}
	
	public static int maxNumber(int [] intrgerArr)
	{
	      int maxNumber = 0;
	      for(int i=0;i<intrgerArr.length;i++)
	      {
	    	  if (intrgerArr[i]> maxNumber )
	    		  maxNumber = intrgerArr[i];
	      }
	      return maxNumber;
	}

}