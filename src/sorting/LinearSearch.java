package sorting;

public class LinearSearch {

public static void main(String...s){

//Numeric	
	
int A[]={2,3,4,2,4,1,67,8};

int Item=77;
int Temp=0;

for(int i=0;i<A.length;i++){

if(A[i]==Item){
	System.out.println("Item is Present at postion "+i);
	Temp=Temp+1;
}
}

if(Temp==0){
	System.out.println("Item not found in the Array");
}
//=================================================================

//String:

String B[]={"Apple","Zebra","Tiger","Flash"};
String Item1="Arrow";
int flag=0;
for(int i=0;i<B.length;i++){
	if(B[i].equals(Item1)){
		System.out.println("Item1 is present at= "+i);
		flag=flag+1;
	}
}

if(flag==0){
	System.out.println("Item1 is not found");
}







}
	
	
}
