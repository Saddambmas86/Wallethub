package TreeMapComparator;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class NokiaMain {

public static void main(String...s){

Nokia N1=new Nokia("Nokia6",15000);
Nokia N2=new Nokia("Nokia7",25000);
Nokia N3=new Nokia("Nokia3",10000);
Nokia N4=new Nokia("Nokia2",8000);
Nokia N5=new Nokia("Nokia8",30000);
Nokia N6=new Nokia("Nokia9",45000);

Map <Nokia,Integer>Map1=new TreeMap<Nokia,Integer>();

Map1.put(N1,1);
Map1.put(N2,2);
Map1.put(N4,4);
Map1.put(N3,3);
Map1.put(N5,5);
Map1.put(N4,4);


Set<Nokia> Set1=Map1.keySet();

for(Nokia M1:Set1){
	System.out.println(M1.Price+", "+M1.ModelNumber+", "+Map1.get(M1));
}






	
}
	
	
}
