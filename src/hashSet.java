import java.util.ArrayList;
import java.util.HashSet;

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
		HashSet<String> noDuplicate = new HashSet<String>();
		
		noDuplicate.add("Mr A");
		noDuplicate.add("Mr B");
		noDuplicate.add("Mr A");
		noDuplicate.add("Mr C");
		noDuplicate.add("Mr A");
		noDuplicate.add("Mr D");
		noDuplicate.add("Mr B");
		noDuplicate.add("Mr C");
        // Duplicate elements are not printed in a set.
        System.out.println(noDuplicate);
        System.out.println("---------------------------------------------------------");
        System.out.println("Disply which employees work for both of the restaurants using hashSet");
        
        /*
         * Given the names of people working in 2 different restaurants. Figure out which 
         * employees work for both of the restaurants.
         * */
        HashSet<String> restaurants1 = new HashSet<String>();
        HashSet<String> restaurants2 = new HashSet<String>();
        
        restaurants1.add("Mr A");
        restaurants1.add("Mr B");
        restaurants1.add("Mr C");
        restaurants1.add("Mr Y");
        restaurants1.add("Mr E");
        
        restaurants2.add("Mr X");
        restaurants2.add("Mr Z");
        restaurants2.add("Mr B");
        restaurants2.add("Mr A");
        restaurants2.add("Mr Y");
        restaurants2.add("Mr S");
        restaurants2.add("Mr T");
        
        restaurants2.retainAll(restaurants1);
        System.out.println(restaurants2);
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
		
	}//End of main class

}//End of hashSet class
