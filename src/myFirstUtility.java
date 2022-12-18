import javax.imageio.ImageTranscoder;

public class myFirstUtility {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

      int number [] = {5,6,10,1};
      int maxNumber = 0;
      
      for(int i=0;i<number.length;i++)
      {
    	  if (number[i]> maxNumber )
    		  maxNumber = number[i];
      }
      
      System.out.println("This is the Max number " + maxNumber);

	}

}