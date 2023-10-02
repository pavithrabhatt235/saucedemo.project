package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	 public WebDriver driver;
 @BeforeMethod
 public void launchApp() {
	  driver=new EdgeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
 }
@AfterMethod
  public void closeApp() {
	  driver.close();
  }
}
