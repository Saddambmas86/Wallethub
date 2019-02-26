package WalletHub.InitiateBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;

import WalletHub.Utility.Utility;

public class InitiateBrowser {
	
public static WebDriver driver;	

@BeforeMethod
public void Browser() throws Exception{
if(Utility.fetchValue("Browser").equalsIgnoreCase("Mozilla")){	
System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
driver=new FirefoxDriver();
}

else if(Utility.fetchValue("Browser").equalsIgnoreCase("Chrome")){	
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
driver=new ChromeDriver();
}

else if(Utility.fetchValue("Browser").equalsIgnoreCase("IE")){	
System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
driver=new InternetExplorerDriver();
}

else{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
driver=new ChromeDriver();
}
	
driver.get("https://www.facebook.com/");

}
}