package sorting;

public class Insert {
	
public static void main(String...s){
	
int A[]={1,4,5,3,8,6,2};



for(int i=1;i<A.length;i++){
	
int temp=A[i];
int j;

for(j=i-1;j>0 && A[j]>temp;j--){
A[j+1]=A[j];
}
A[j+1]=temp;
}
for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}


	
}
	

}
