package Collection;

import java.util.*;

public class PrintMap {

public static void main(String...s){
	
	
TreeMap<Integer, String> Map1=new TreeMap();	
Map1.put(1, "QA1");
Map1.put(2, "QA2");
Map1.put(3, "QA3");
Map1.put(4, "QA4");

System.out.println(Map1);
System.out.println("Values of TreeMap"+Map1.values());
System.out.println("Keys of Map ="+Map1.keySet());
System.out.println("Value of key 2 ="+Map1.get(2));
System.out.println("First Key ="+Map1.firstKey());
System.out.println("Value of Ist Key ="+Map1.get(Map1.firstKey()));
System.out.println("Last Key= "+Map1.lastKey());
System.out.println("Value of Last Key= "+Map1.get(Map1.lastKey()));
System.out.println("Remove 1st key= "+Map1.remove(Map1.firstKey()));
System.out.println("Key set become"+Map1.keySet());
System.out.println("Key Values "+Map1.values());
System.out.println("Remove LastKey ="+Map1.remove(Map1.lastKey()));
System.out.println("Key set become"+Map1.keySet());

}

}
