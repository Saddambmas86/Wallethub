package WalletHub.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment2 {

@Test	

public void assignment2() throws InterruptedException{
System.out.println("Start the Testcase");
	
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
WebDriver driver=new FirefoxDriver();

driver.get("https://wallethub.com/profile/test_insurance_company/");	
Thread.sleep(10000);
driver.findElement(By.className("login")).click();
Thread.sleep(4000);
driver.findElement(By.name("em")).sendKeys("Sameer9761047286@gmail.com");
driver.findElement(By.name("pw")).sendKeys("Password@12");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='btn blue touch-element-cl']")).click();
Thread.sleep(8000);
driver.navigate().to("https://wallethub.com/profile/test_insurance_company/");
//driver.findElement(By.xpath("//i[@class='af-icon-cross']")).click();
Thread.sleep(3000);
Actions action=new Actions(driver);
WebElement StarRating=driver.findElement(By.xpath("//div[@class='wh-rating-notes']"));
action.moveToElement(StarRating).perform();
Thread.sleep(3000);
WebElement Star5=driver.findElement(By.xpath("//a[@class='hover'][text()='4']"));
Star5.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class='dropdown-title']")).click();
driver.findElement(By.xpath("//a[text()='Health']")).click();
WebElement B=driver.findElement(By.xpath("//a[@class='bf-icon-star-empty star bstar bf-icon-star'][4]"));
action.moveToElement(B);
Thread.sleep(2000);
String A="QA Can't say how the days will unfold, Can't change what the future may hold, But, I want you in it, Every hour, every minute. This world can race by far too fastHard to see while it's all flying past But, it's clear now, When you're standing here now, I am meant to be wherever you are next to me";
driver.findElement(By.id("review-content")).sendKeys(A);
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@class='btn blue']")).click();
Thread.sleep(4000);

WebElement ReviewSubmitted=driver.findElement(By.xpath("//*[text()='Awesome!']"));

if(ReviewSubmitted.isDisplayed()){
	System.out.println("Reviews submitted successfully");
}

driver.navigate().to("https://wallethub.com/profile/sameer9761047286/");

String TextMatch=driver.findElement(By.xpath("//p[@class='feeddesc']")).getText();


if(A.equals(TextMatch)){
	System.out.println("Successfully loaded the review and appearing in page");
}




}
	
	

}
