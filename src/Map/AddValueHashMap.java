package Map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AddValueHashMap {

public static void main(String...s){

HashMap<String, Integer> Map1=new HashMap<String, Integer>();	
HashMap<Integer,String> Map2=new HashMap<Integer,String>();

Map1.put("One", 1);
Map1.put("Two", 2);
Map1.put("Three", 3);
Map1.put("Four", 4);

//Printing Key Value pairs:

Set<Entry<String,Integer>> Entry1=Map1.entrySet();

for(Entry<String, Integer> Ent: Entry1 ){
	System.out.println(Ent.getKey());
	System.out.println(Ent.getValue());
	System.out.println();
}

Map2.put(1, "OneString");

//put value if not present in Map
Map2.putIfAbsent(4, "FourString");


Set<Entry<Integer, String>> Entry2=Map2.entrySet();

for(Entry<Integer,String> Ent2:Entry2){
	System.out.println(Ent2.getKey());
	System.out.println(Ent2.getValue());
	System.out.println();
}

//Insert key Value of another Map:

//Map2.putAll(Map1);

//=============================
//Retrieve value of Map:
int value1=Map1.get("One");
System.out.println(value1);
//=============================

//==================================================
//To Check whether given value and Key is present in HashMap:

System.out.println(Map1.containsKey("One"));
System.out.println(Map1.containsValue(1));
//It return true if present
//==================================================

//===================================================
//To check number of Key value pairs present in HashMap:
System.out.println(Map1.size());
//====================================================

//====================================================
//To clear all key-Pairs from HashMap:
System.out.println(Map1.size());
Map1.clear();
System.out.println(Map1.size());
//====================================================




}
	
}
