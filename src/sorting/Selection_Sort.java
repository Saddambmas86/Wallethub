package sorting;

public class Selection_Sort {

	
int Min(int A[],int k){
	int LOC, MIN;   //LOC is index and Min is number
	MIN=A[k];
	LOC=k;
	int L=A.length;
	for(int j=k+1;j<=L-1;j++){
	System.out.println("Value of j= "+j);
	System.out.println("Value of j= "+j+" "+A[j]);
	System.out.println("Value of K= "+LOC+" "+A[LOC]);
	System.out.println("Value of MINIMUM"+MIN);
	if(MIN>A[j]){
	MIN=A[j];
	LOC=j;	
	System.out.println("Value of sorting ="+LOC);
	}}
	return LOC;
	
}
	
public static void main(String...s){

Selection_Sort T1=new Selection_Sort();	
	
	int A[]={34,28,25,11,9,0};
	int k,temp,LOC;
	int N=A.length;
	
	
	//Here N-2, because last is set automatically, same as bubble sort.
	for(k=0;k<=N-2;k++){  
	LOC=T1.Min(A, k);
	temp=A[k];
	A[k]=A[LOC];
	A[LOC]=temp;		
	}

for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}
	
}
	
	
}
