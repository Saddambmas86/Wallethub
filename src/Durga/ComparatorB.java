package Durga;

import java.util.Comparator;

public class ComparatorB implements Comparator {

	@Override
public int compare(Object o1, Object o2) {
		
String S1=(String)o1;
String S2=(String)o2;

if(S1.compareTo(S2)>0){
	return -1;
}
else if(S1.compareTo(S2)<0){
	return +1;
}
else{
		return 0;
	}

	
	
	
}
}