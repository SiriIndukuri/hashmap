package pyramidtest;
import java.util.*;  
class hashmap{  
	public static void main(String args[]){  
		HashMap<Integer,String> hm=new HashMap<Integer,String>();    
		System.out.println("Initial list of elements: "+hm);  
		hm.put(100,"Amit");    
		hm.put(101,"Vijay"); 
		hm.put(101, "value");
		hm.put(102,"Rahul");   
		System.out.println("BranchA "); 

		System.out.println("After invoking put() method ");  
		for(Map.Entry m:hm.entrySet()){    
			System.out.println(m.getKey()+" "+m.getValue());    
		}  
	}  
}  
