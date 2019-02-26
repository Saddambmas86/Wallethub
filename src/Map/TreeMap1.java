package Map;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMap1 {
		
public static void main(String...s){
//==================
//Comparable Example	
//==================	
Set<Car> List1=new TreeSet<Car>();

Car C6=new Car("A123", 70000);
Car C4=new Car("D123", 50000);
Car C5=new Car("E123", 60000);
Car C1=new Car("M123", 20000);
Car C2=new Car("B123", 30000);
Car C3=new Car("C123", 40000);

List1.add(C6);
List1.add(C5);
List1.add(C1);
List1.add(C2);
List1.add(C3);
List1.add(C4);


for(Car m1:List1){
	System.out.println(m1.RegistrationNumber+" ,"+m1.Price);
}
	
}
	

}
