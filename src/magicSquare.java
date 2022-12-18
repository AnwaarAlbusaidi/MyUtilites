import java.util.Scanner;
/**
 * @author Anwaar Al-Busaidi
 *
 */
public class magicSquare {
	public static void main(String[] args) {
		//Variable declaration
		    Scanner scan = new Scanner (System.in);
	        int userinput;
	        int row,coulm;
	        System.out.println("Enter the Magic Square size ");
	        userinput = scan.nextInt();
	        int[][] magic = new int[userinput][userinput];
	        
	        System.out.println("The Magic Square for order " + userinput + ",");
	        System.out.println("Magic constant: " + userinput * (userinput * userinput + 1) / 2);
	        System.out.println("Matrix: ");
	       
	        for(row = 0;row < userinput ;row++)
	        {
	        	for(coulm = 0; coulm < userinput ;coulm++)
	        	{
	        		magic[(userinput % 2)- 1][userinput/2]= 1;
	        	}
	        }

	} //End of main class

}// end of magicSquare class
