

package Map;

public class Car implements Comparable<Car>{
//==================
//Comparable Example	
//==================	
public String RegistrationNumber;
public int Price;

public int getPrice(){
	return Price;
}
	
public void SetPrice(int Price){
	this.Price=Price;
}

public String getReg(){
	return RegistrationNumber;
}

public void setRegistrationNumber(String RegistrationNumber){
	this.RegistrationNumber=RegistrationNumber;
}

public Car(String RegistrationNumber, int Price){
	this.RegistrationNumber=RegistrationNumber;
	this.Price=Price;
}


@Override
public int compareTo(Car T1) {
//return this.RegistrationNumber.compareTo(T1.RegistrationNumber);

if(this.getReg().compareTo(T1.getReg())>0){
	return 1;
}
else{
	return -1;
	
	
}
	
	
}





	
}
