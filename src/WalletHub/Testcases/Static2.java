package WalletHub.Testcases;

public class Static2 extends Static1{

static void show(){
	System.out.println("Static2 Child");
}
	
public static void main(String...s){
	
Static2 T1=new Static2();
Static1 T2=new Static2();

T1.show();
T2.show();
Static1.show();
Static2.show();
	
	
}
	
	
}
