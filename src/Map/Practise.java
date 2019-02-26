package Map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Practise {
	
public static void main(String...s){
	
	List<String> list = new ArrayList<>();
    list.add("java2s.com");
    list.add("java2s.com");
    list.add("java2s.com");
    
    System.out.println(list);
    HashSet<String> hs = new HashSet<String>(list);
    hs.add("Saddam");
    System.out.println(hs);
	
}

}
