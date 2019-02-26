package sorting;

public class QA12 {
	
	
public static void main(String...s){

int A[]={34,31,23,56,2,57,89,4,4546,342,223};

for(int i=0;i<A.length;i++){

for(int j=0;j<A.length-i-1;j++){

if(A[j]>A[j+1]){
//Swap the numbers:
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
