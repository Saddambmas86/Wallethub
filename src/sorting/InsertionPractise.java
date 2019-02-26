package sorting;

public class InsertionPractise {

public static void main(String...s){

int A[]={4,3,2,5,6,1};	

for(int i=1;i<A.length;i++){

int Temp=A[i];

int j=i;

while(j>0 && Temp<A[j-1]){
A[j]=A[j-1];
j=j-1;	

}

A[j]=Temp;

}

for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}

	
}
	
	
}
