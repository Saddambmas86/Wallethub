package sorting;

public class SelectionPractise {
	
public static void main(String...s){

//int A[]={12,23,34,23,21,1,2,4,56,6,78,90,87,56,445,7};
int A[]={5,3,2,7,8,6};	

for(int i=0;i<A.length;i++){

int Min=i;

//Here we cannot write in A.length-i, because i is already inside the j and is automatically decrease each round,
//But in Bubble sort, we have to write A.length-i, because j is initiate from '0' in each round.

for(int j=i+1;j<A.length;j++){

if(A[j]<A[Min]){
Min=j;		
}
	
int temp=A[Min];
A[Min]=A[i];
A[i]=temp;
	
}	
}

for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}




	
}
	

}
