package WalletHub.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import WalletHub.Utility.Utility;

public class LoginPage {

public WebDriver driver;	
	
public LoginPage(WebDriver driver){
this.driver=driver;	
}

public void UserName(String Uname) throws Exception{
driver.findElement(By.id(Utility.fetchValue("UserName_Id"))).sendKeys(Uname);
}
	
public void Password(String Pass) throws Exception{
driver.findElement(By.id(Utility.fetchValue("Password_Id"))).sendKeys(Pass);	
}

public void LoginButton() throws Exception{
driver.findElement(By.id(Utility.fetchValue("Login_Id"))).click();	
}

public WebElement StatusBox() throws Exception{
return (driver.findElement(By.xpath(Utility.fetchValue("StatusBox_XPath"))));
}

public WebElement Home(){
return (driver.findElement(By.className("_2s25")));	
}


}
