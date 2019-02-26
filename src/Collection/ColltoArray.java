package Collection;

import java.util.*;

public class ColltoArray {
	
	
public static void main(String...s){	
	
List<String>A=new ArrayList<String>();	
A.add("This");
A.add("is");
A.add("a");
A.add("good");
A.add("boy");


System.out.println(A);

String Str[]=A.toArray(new String[0]);

for(int i=0;i<Str.length;i++){
	System.out.println(Str[i]);
}

/*List<String>A=new ArrayList<String>();	
A.add("This");
A.add("is");
A.add("a");
A.add("good");
A.add("boy");


System.out.println(A);

String Str[]=A.toArray(new String[0]);

for(int i=0;i<Str.length;i++){
	System.out.println(Str[i]);
}*/

}
}
