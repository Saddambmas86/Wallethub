package WalletHub.Testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import WalletHub.InitiateBrowser.InitiateBrowser;
import WalletHub.Pages.LoginPage;
import WalletHub.Utility.Utility;

public class TC01_LoginPage extends InitiateBrowser{
	
//WebDriver driver;	

String Uname="Saddambmas86@gmail.com";	
String Pass="Saddam786@";
String Status="Hello WalletHub";

@Test
public void tc_LoginPage() throws Exception{
LoginPage TC1=new LoginPage(driver);
TC1.UserName(Uname);
Utility.wait1(2000);
TC1.Password(Pass);
Utility.wait1(2000);
TC1.LoginButton();
Utility.wait1(2000);	

WebElement Home1=TC1.Home();
WebElement Stats=TC1.StatusBox();
//WebElement Stats2=TC1.StatusBox2();

if(Home1.isDisplayed()){
Utility.wait1(3000);	
Stats.click();
//Stats2.sendKeys(Status);

}
else{
	System.out.println("Login Failed");
}
	
	
}
}