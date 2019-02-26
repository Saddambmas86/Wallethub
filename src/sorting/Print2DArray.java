package sorting;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Print2DArray {
	
public static void main(String...s){

	
//Print 2D Array:
	
int A[][]={{12,12,23},{23,34,56},{45,67,778}};	

for(int i=0;i<A.length;i++){
	for(int j=0;j<A[i].length;j++){
		System.out.println(A[i][j]);
	}
}
//===================================================


//Print 3D Array:

int B[][][]={{{12,23,34},{34,3,2}},{{23,4,5},{5,6,5}}};


for(int i=0;i<B.length;i++){
	for(int j=0;j<B[i].length;j++){
		for(int k=0;k<B[i][j].length;k++){
			System.out.println(B[i][j][k]);
		}
	}
}



	
}

}
