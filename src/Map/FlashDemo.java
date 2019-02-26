package Map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class FlashDemo {
	
public static void main(String...s){
//==================
//Comparator Example	
//==================
	
Set <ArrowComparator> Set1=new TreeSet<ArrowComparator>(new SortByName());	

ArrowComparator A1=new ArrowComparator("ABC",60000);
ArrowComparator A2=new ArrowComparator("XYZ",30000);
ArrowComparator A3=new ArrowComparator("EFG",20000);
ArrowComparator A4=new ArrowComparator("IJK",70000);
ArrowComparator A5=new ArrowComparator("PLU",80000);
ArrowComparator A6=new ArrowComparator("GTJ",10000);

Set1.add(A2);
Set1.add(A1);
Set1.add(A6);
Set1.add(A5);
Set1.add(A4);
Set1.add(A3);


for(ArrowComparator M1:Set1){
	System.out.println(M1.Name+" ,"+M1.Price);
}



}
	

}
