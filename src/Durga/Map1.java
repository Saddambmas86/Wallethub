package Durga;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {
	
public static void main(String...s){

Map M1=new HashMap();
M1.put(1, "A");
M1.put(2, "Z");
M1.put(3, "F");

System.out.println(M1);

Set T1=M1.entrySet();

Iterator itr=T1.iterator();

while(itr.hasNext()){
Map.Entry T5=(Map.Entry)itr.next();
System.out.println("Keys are: "+T5.getKey());
System.out.println("Values are: "+T5.getValue());
}



	
	
}
	

}
