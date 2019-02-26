package comparator;

import java.util.Comparator;

public class SortByName implements Comparator<ArrowComparator>{

	@Override
public int compare(ArrowComparator O1, ArrowComparator O2) {

if(O1.Name.compareTo(O2.Name)>0){
	return 1;
}
else
	return -1;
		
}

}
