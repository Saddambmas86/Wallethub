package TreeMapComparator;

import java.util.Comparator;

public class SortbyPrice implements Comparator<Nokia> {

	@Override
public int compare(Nokia O1, Nokia O2) {

if(O1.Price>O2.Price){
	return 1;
}
else if(O1.Price<O2.Price){
	return -1;
}
	
else 
	return 0;

}


}
