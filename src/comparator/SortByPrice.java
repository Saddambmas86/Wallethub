package comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator<ArrowComparator> {

	//==================
	//Comparator Example	
	//==================	
	
	
	@Override
	public int compare(ArrowComparator O1, ArrowComparator O2) {
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
