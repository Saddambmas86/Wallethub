package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMap1 {
	
	
public static void main(String...s){

LinkedHashMap<Integer, String> LH1=new LinkedHashMap<Integer, String>();

LH1.put(1, "one");
LH1.put(5, "Five");
LH1.put(3, "Three");
LH1.put(2, "Two");

Set<Entry<Integer,String>> Entry1=LH1.entrySet();


//Linked HashMap maintain insertion order
for(Entry<Integer, String> M1:Entry1){
	System.out.println(M1);
}


HashMap<Integer, String> Map1=new HashMap<Integer, String>();

Map1.put(6, "Six");
Map1.put(1, "one");
Map1.put(5, "Five");
Map1.put(3, "Three");
Map1.put(2, "Two");

Set<Entry<Integer,String>> Entry2=Map1.entrySet();


//HashMap not maintain insertion order
for(Entry<Integer, String> M2:Entry2){
	System.out.println(M2);
}




	
}
	

}
