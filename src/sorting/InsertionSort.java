package sorting;

public class InsertionSort {
	
void Insertion_Sort(int A[]){

System.out.println("Start Test");	
int temp,j;


for(int i=0;i<A.length;i++){
	temp=A[i];
	
for( j=i-1;j>=0 && temp<A[j];j--){ //there is 2 condition because: if 1,2,3 is already sort in A[]={1,2,3,4} and if we check the value greater than 4
	//then there is not need to check the value with greater than 3, 2, 1.
	A[j+1]=A[j];
}
A[j+1]=temp;       //if no swapping then we want same value, so we do it.
}}

//In best case time complexity is O(n), because J loop is not running if array is already sorted.

public static void main(String...s){

InsertionSort T1=new InsertionSort();	
	
int A[]={5,4,3,2,1};

T1.Insertion_Sort(A);

for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}






	
}


}
