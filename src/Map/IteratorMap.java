package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class IteratorMap {
	
public static void main(String...s){

Map map1=new HashMap();
Map map2=new HashMap();

map1.put(1, "A");
map1.put(2, "B");
map1.put(3, "C");
map1.put(4, "D");
map2.putAll(map1);
map2.put(6, "Saddam");


//map1.put(null, null);

System.out.println(map1);

Set S1=map2.entrySet();
Iterator itr=S1.iterator();

while(itr.hasNext()){
Map.Entry m1=(Map.Entry) itr.next();	

System.out.println(m1.getKey()+"......"+m1.getValue());
}
System.out.println(map2);



	
}
	

}
