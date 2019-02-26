package Durga;

import java.util.Iterator;
import java.util.TreeSet;

public class MainClass {
	
public static void main(String...s){

TreeSet<Integer> T1=new TreeSet(new ComparatorA());
T1.add(1);
T1.add(2);
T1.add(8);
T1.add(3);
T1.add(4);

TreeSet T2=new TreeSet(new ComparatorB());
T2.add("Saddam");
T2.add("Tarun");
T2.add("Ajay");
T2.add("Shiva");
T2.add("Flash");
T2.add("Arrow");


System.out.println("TreeSet T2 is");
System.out.println(T2);


System.out.println(T1);

Iterator itr=T1.iterator();

while(itr.hasNext()){

Integer T5=(Integer)itr.next();
System.out.println("Value of set is: "+T5);
	
}


	
	
}
	

}
