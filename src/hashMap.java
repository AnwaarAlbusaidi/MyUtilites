import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Anwaar Al-Busaidi
 *
 */
public class hashMap {
	public static void main(String[] args) {
      
	//variable declaration
      Scanner scan = new Scanner(System.in);
      String userInput;
      int aCount = 0;
      int eCount = 0;
      int iCount = 0;
      int oCount = 0;
      int uCount = 0;
      int vowelsCount = 0;
      
      System.out.println("Please Enter a sentence : ");
      userInput = scan.nextLine();
      
       for(int i = 0; i< userInput.length(); i++)
       {
    	   if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'A')
    		   aCount = aCount + 1;  
    	   else if (userInput.charAt(i) == 'i' ||  userInput.charAt(i) == 'I')  
    		   iCount = iCount + 1; 
    	   else if (userInput.charAt(i) == 'o'  ||  userInput.charAt(i) == 'O')
    		   oCount = oCount + 1; 
    	   else if(userInput.charAt(i) == 'u'||  userInput.charAt(i) == 'U')
    		   uCount = uCount + 1; 
    	   else if(userInput.charAt(i) == 'e' ||  userInput.charAt(i) == 'E')
    		   eCount = eCount + 1; 
       }
       vowelsCount =  aCount + eCount +iCount + uCount+ oCount;
       System.out.println("Number of vowels  : " + vowelsCount);
       System.out.println("a is present  : " + aCount  + " times.");
       System.out.println("i is present  : " + iCount  + " times.");
       System.out.println("o is present  : " + oCount  + " times.");
       System.out.println("u is present  : " + uCount  + " times.");
       System.out.println("e is present  : " + eCount  + " times.");
       
       
       
       //Solve the same problem by using the Hash map
      
       HashMap<String, Integer> sentenceOfHashMap = new HashMap<String, Integer>();
       sentenceOfHashMap.put("aCount",0);
       sentenceOfHashMap.put("iCount",0);
       sentenceOfHashMap.put("oCount",0);
       sentenceOfHashMap.put("uCount",0);
       sentenceOfHashMap.put("eCount",0);
       
       vowelsCount = 0;
       System.out.println("Please Enter a sentence : ");
       userInput = scan.nextLine();
       
       for(int current = 0 ; current < userInput.length() ; current++)
       {
    	   if(userInput.charAt(current) == 'a' || userInput.charAt(current) == 'A')
    	   {
                  sentenceOfHashMap.put("aCount" ,sentenceOfHashMap.get("aCount")+1);
                   vowelsCount++;
    	   }
    	   else if (userInput.charAt(current) == 'i' ||  userInput.charAt(current) == 'I')
    	   {
    		   sentenceOfHashMap.put("iCount" ,sentenceOfHashMap.get("iCount")+1);
    		   vowelsCount++;
    	   }
    	   else if (userInput.charAt(current) == 'o'  ||  userInput.charAt(current) == 'O')
    	   {
    		   sentenceOfHashMap.put("oCount" ,sentenceOfHashMap.get("oCount")+1); 
    		   vowelsCount++;
    	   }
    	   else if(userInput.charAt(current) == 'u'||  userInput.charAt(current) == 'U')
    	   {
    		   sentenceOfHashMap.put("uCount" ,sentenceOfHashMap.get("uCount")+1); 
    		   vowelsCount++;
    	   }
    	   else if(userInput.charAt(current) == 'e' ||  userInput.charAt(current) == 'E')
    	   {
    		   sentenceOfHashMap.put("eCount" ,sentenceOfHashMap.get("eCount")+1);
    		   vowelsCount++;
    	   }
       }
       
        System.out.println("Number of vowels  : " + vowelsCount);
     	System.out.println("a is present  : " + sentenceOfHashMap.get("aCount")  + " times.");
     	System.out.println("i is present  : " + sentenceOfHashMap.get("iCount")   + " times.");
     	System.out.println("o is present  : " + sentenceOfHashMap.get("oCount")   + " times.");
     	System.out.println("u is present  : " + sentenceOfHashMap.get("uCount")   + " times.");
     	System.out.println("e is present  : " + sentenceOfHashMap.get("eCount")   + " times.");
  	    
	}//End of Main class
} //End of hashMap class
