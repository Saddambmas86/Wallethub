package sorting;

public class StringArraySort {
	
public static void main(String...s){
	
String A[]={"AB","EF","CD","YZ","PQ"};	

for(int i=0;i<=A.length-1;i++){
for(int j=0;j<A.length-i-1;j++){

if(A[j].compareTo(A[j+1])>0){

String Temp=A[j];
A[j]=A[j+1];
A[j+1]=Temp;
	
}
	
	
}
	
}

for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}
	
	
}	
	

}
