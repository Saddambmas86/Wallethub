package Collection;

import java.util.*;

public class ArraytoColl {

public static void main(String...s){
	
String A[]=	{"Red","white","Green"};

List<String>Z=Arrays.asList(A);
List<String>B=new ArrayList<String>(Z);
System.out.println(B);
B.add("QA");
B.add("Automate");


System.out.println(B);
	
}
	
}
