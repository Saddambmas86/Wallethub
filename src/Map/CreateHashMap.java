package Map;

import java.util.HashMap;

public class CreateHashMap {
	
public static void main(String...s){

//Creating HashMap with default initial capacity	
HashMap<String, Integer> T1=new HashMap<String, Integer>();	

//Creating HashMap with 30 initial capacity
HashMap<String, Integer> T2=new HashMap<String, Integer>(30);	

//Creating HashMap with 30 initial capacity and 0.5 as load factor
HashMap<String, Integer> T3=new HashMap<String, Integer>(30,0.5f);

//Default Load factor is 0.75, i.e capacity increases once the 75% filled.
//2^4: default size:
//Increase by 2^5, 2^6 and so on.

//Creating HashMap by copying another HashMap:
HashMap<String, Integer> T4=new HashMap<String, Integer>(T1);
}
	

}
