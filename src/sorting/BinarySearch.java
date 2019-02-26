package sorting;

public class BinarySearch {
	
public static void main(String...s){

int A[]={1,2,3,5,6,8,18,20};	

int Item=18;

int li=0;
int hi=A.length-1;
int mi=(li+hi)/2;
System.out.println("Binary Search");


while(li<=hi){

if(A[mi]==Item){
	System.out.println("Item present at index = "+mi);
	break;
}
else if(A[mi]<Item){
	li=mi+1;
}
else{
	hi=mi-1;
}
mi=(li+hi)/2;
}
if(li>hi){
	System.out.println("No Element found");
} 




}

}
