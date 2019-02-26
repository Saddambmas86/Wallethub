package Map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RetriveMapKeys {
	
public static void main(String...s){
	
HashMap<Integer, String> Map1=new HashMap<Integer, String>();	
	
Map1.put(1, "One");
Map1.put(2, "Two");
Map1.put(3, "Three");
Map1.put(4, "Four");


//Retrieve all Keys:
Set<Integer> Set1=Map1.keySet();

for(Integer M1:Set1){
	System.out.println(M1);
}

//=============================================
//Retrieve Key value pairs:
Set<Entry<Integer, String>> Set2=Map1.entrySet();

for(Entry<Integer,String> M2:Set2){
	System.out.println(M2.getKey());
	System.out.println(M2.getValue());
	System.out.println();
}

//=============================================
//Retrieve all Values
Collection<String> C1=Map1.values();

for(String Value1:C1){
	System.out.println(Value1);
}

//===============================================
//Remove key-Value pairs:
Map1.remove(2);
System.out.println(Map1.containsKey(2));

//===============================================
//Replace value Maps:
Map1.replace(2, "Green Arrow");

for(Entry<Integer,String> M2:Set2){
	System.out.println(M2.getKey());
	System.out.println(M2.getValue());
	System.out.println();
}

//===============================================
//synchronized HashMap in Java:

HashMap<Integer, String> H1=new HashMap<Integer, String>();
Map<Integer, String> SyncMap=Collections.synchronizedMap(H1);
//===============================================


//===============================================
//Convert Map to List
List<Integer> Key1=new ArrayList(Map1.keySet());
List<String> Value1=new ArrayList(Map1.values());

System.out.println(Key1);
System.out.println(Value1);
//===============================================




}
	

}
