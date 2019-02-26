package WalletHub.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class QA1 {

//Enter your username and Password	
	
String UserName="Demo";
String Password="Demo123";
	
@Test	
public void assignment1() throws Exception{
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("https://www.facebook.com/");
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys(UserName);
driver.findElement(By.id("pass")).sendKeys(Password);
driver.findElement(By.xpath("//input[@value='Log In']")).click();
Thread.sleep(4000);

WebElement home=driver.findElement(By.xpath("//a[text()='Home']"));


//if login successfull, then only 'home' is appearing else login failed.

if(home.isDisplayed()){
System.out.println("Login Successfully");

//Element is taking time to load, so explicit wait applied:
WebDriverWait wait=new WebDriverWait(driver,40);
WebElement A=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_1mwp _5bu_ _17nh navigationFocus']")));
//Here 'A' is first Status box at the home page
A.click();
Thread.sleep(10000);
//Once the pop-up window appear, then click once to write the status
driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).click();
//Below is to write the status on box
driver.findElement(By.xpath("//div[@class='_1mf _1mj']")).sendKeys("Hello World");
Thread.sleep(3000);
//Below is to click on the share button
//driver.findElement(By.xpath("_1mf7 _4r1q _4jy0 _4jy3 _4jy1 _51sy selected _42ft")).click();
driver.close();
}

else{
	System.out.println("Login Failed");
}

}
	

}
