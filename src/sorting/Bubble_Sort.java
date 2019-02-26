package sorting;

public class Bubble_Sort {
	
void bubble(int A[]){

int round, temp;
for(round =1;round<A.length;round++){
for(int i=0;i<A.length-round;i++){//we minus round because value at the right side get fixed
if(A[i]>A[i+1]){
temp=A[i];
A[i]=A[i+1];
A[i+1]=temp;	
}}}
}


public static void main(String...s){

Bubble_Sort T1=new Bubble_Sort();
int A[]={12,14,8,11,435,0,3,56};
int N=A.length;
T1.bubble(A);

	
for(int i=0;i<=N-1;i++){
System.out.println(A[i]+" ");	
}

	
}

	

}
