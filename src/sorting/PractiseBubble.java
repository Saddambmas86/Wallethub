package sorting;

public class PractiseBubble {
	
public static void main(String...s){

int A[]={12,23,11,3,4,34,56,67,1};


for(int i=1;i<A.length;i++){
System.out.println("Loop outside i= "+i);	

for(int j=0;j<A.length-i;j++){
System.out.println("Loop inside j= "+j);	

if(A[j]>A[j+1]){
int temp=A[j];
A[j]=A[j+1];
A[j+1]=temp;
}
}
	
}

for(int i=0;i<A.length-1;i++){
	System.out.println(A[i]);
}
	
	
}
	

}
