import java.util.HashMap;
import java.util.concurrent.CountDownLatch;

import javax.sql.rowset.spi.SyncResolver;

/**
 * @author LAP-8
 *
 */
public class hashMap1 {

	public static void main(String[] args) {
		
     int [] arrOfInteger = new int [] {101,88,3,65,6,3,0,0,88,88};
     int count = 1;
     int num ;
   //solve the problem using array
     for (int outrIndex = 0 ; outrIndex <arrOfInteger.length ; outrIndex++ )
     {
    	 for (int innerIndex = 1 ; innerIndex <arrOfInteger.length ; innerIndex++ )
    	 {
    		 if(arrOfInteger[outrIndex] == arrOfInteger[innerIndex])
    			 count += 1; 
    	 }
    	 System.out.println( arrOfInteger[outrIndex] +" appeared " + count + " times."); 
    	 System.out.println();
    	 count = 0;
     }
     
     System.out.println("--------------------------------------------------------------");
     //solve the problem using hash map
     
     HashMap<Integer, Integer> repatedNum = new HashMap<Integer, Integer>();
     for (int index = 0 ;index < arrOfInteger.length ; index++ )
     {
    	 if(repatedNum.containsKey(arrOfInteger[index]))
    		 repatedNum.put(arrOfInteger[index],repatedNum.get(arrOfInteger[index])+1 );
    	 else 
    		 repatedNum.put(arrOfInteger[index], 1);
     }
     for (int current :repatedNum.keySet())
     {
    	 if(repatedNum.get(current) > 1)
    		 System.out.println(current+" appeared " + repatedNum.get(current )+ " times.");
    		 
     }  
	}//End of Main class

}//End of hashMap1 class