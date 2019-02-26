package WalletHub.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Utility {
	
public static String fetchValue(Object key) throws Exception{

FileInputStream Fin=new FileInputStream("./PropertyFile/FileA");
Properties property= new Properties();
property.load(Fin);
return property.get(key).toString();
}

public static void wait1(int n){
try{
	Thread.sleep(n);
}
catch(Exception E){
	System.out.println("Wait Exception Handled");
}

}



}
