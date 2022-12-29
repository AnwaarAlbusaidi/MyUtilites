import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashSet {
	public static void main(String[] args) {
	
		String[]  myarr = {"Mr A", "Mr B", "Mr A", "Mr C", "Mr A", "Mr D", "Mr B", "Mr C"};
		ArrayList<String> noDuplication = new ArrayList<String>();
		
		for (int i = 0;i < myarr.length ; i++) 
		{
			if(!noDuplication.contains(myarr[i]))
				noDuplication.add(myarr[i]);
		}  
		System.out.println("remove duplicate using arrayList");
		System.out.println("---------------------------------------------------------");
		for (int i = 0;i < noDuplication.size(); i++) 
			System.out.print(noDuplication.get(i) + ", " );
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("remove duplicate using hash set");
		//using constructor for the hash set 
		Set<String> noDuplicate = new HashSet<String>( Arrays.asList(myarr) );
        // Duplicate elements are not printed in a set.
        System.out.println(noDuplicate);
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Disply which employees work for both of the restaurants using ArrrayList");

	   
        String[]  res1 = {"Mr A", "Mr B", "Mr C", "Mr Y", "Mr E"};
        String[]  res2 = {"Mr X", "Mr Z", "Mr B", "Mr A", "Mr Y", "Mr S", "Mr T"};
		ArrayList<String> worker = new ArrayList<String>();
		
		for (int i = 0;i < res2.length ; i++) 
		{
			for (int j = 0;j < res1.length ; j++) 
				if(res2[i]== res1[j] )
					worker.add(res2[i]);
		}  
	
		for (int i = 0;i < worker.size(); i++) 
			System.out.print(worker.get(i)+ ",");
		
		System.out.println();
        System.out.println("---------------------------------------------------------");
        System.out.println("Disply which employees work for both of the restaurants using hash Set");
        
        /*
         * Given the names of people working in 2 different restaurants. Figure out which 
         * employees work for both of the restaurants.
         * */
          Set<String> restaurants1 = new HashSet<String>( Arrays.asList(res1) );
          Set<String> restaurants2 = new HashSet<String>( Arrays.asList(res2) );
        
        restaurants2.retainAll(restaurants1);
        System.out.println(restaurants2);
   
		
	}//End of main class

}//End of hashSet class
