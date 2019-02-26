package sorting;

public class QuickSort {

//It is Divide and conquer type.
	

int partition(int A[],int low, int high){

	int pivot=A[(low+high)/2];
	
	while(low<=high){
	
	while(A[low]<pivot){
		low=low+1;
	}
	while(A[high]>pivot){
		high=high-1;
	}
	if(low<=high){
		int temp=A[low];
		A[low]=A[high];
		A[high]=temp;
		
		low=low+1;
		high=high-1;
	}	
	}
	return low;
}
	

void quickRecursion(int A[], int low, int high){
	QuickSort T1=new QuickSort();
	int pie=T1.partition(A,low,high);
	if(low<pie-1){
		T1.quickRecursion(A, low, pie-1);
	}
	if(pie<high){
		T1.quickRecursion(A, pie, high);
	}
}
	
void printArray(int A[]){
for(int i=0;i<A.length-1;i++){
	System.out.println(A[i]);
}
}

public static void main(String...s){

int A[]={23,34,11,22,3,4,56,78,76,1,11};
int L=A.length-1;	
QuickSort T2=new QuickSort();

T2.quickRecursion(A, 0, L);
T2.printArray(A);	
}


}	

