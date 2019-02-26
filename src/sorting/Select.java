package sorting;

public class Select {

public static void main(String...s){

int A[]={5,1,2};	
	
for(int i=0;i<A.length-1;i++){
	
System.out.println("Loop i start "+i);	

int Min=i;
for(int j=i+1;j<A.length;j++){
System.out.println("Loop j start "+j);	

if(A[Min]>A[j]){
Min=j;
System.out.println();
}
}
int temp=A[Min];
A[Min]=A[i];
A[i]=temp;
}

for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}




	
}
	
	
}
