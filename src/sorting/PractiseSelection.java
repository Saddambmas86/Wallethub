package sorting;

public class PractiseSelection {
	
public static void main(String...s){

int A[]={12,11,43,2,34,4,5,78,89,8};


for(int i=0;i<A.length;i++){
int min=i;

for(int j=i+1;j<A.length;j++){

if(A[i]>A[j]){

int temp=A[i];
A[i]=A[j];
A[j]=temp;
	
}
	
}
	
	
}
	
for(int i=0;i<A.length;i++){
	System.out.println(A[i]);
}


}
	
	

}
