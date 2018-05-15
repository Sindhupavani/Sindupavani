package mavenproj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Google1 {
	WebDriver driver;

	public void search(String brname) throws Exception
	{
		if(brname.matches("firefox"))
		{
			System.setProperty("WebDriver.gecko.driver", "D://geckodriver.exe");
		}
	driver=new FirefoxDriver();
	
	driver.manage().window().maximize();
	driver.get("http://www.google.com");
	
	driver.findElement(By.name("q")).sendKeys("selenium");
	driver.findElement(By.name("btnK")).click();
	
}
}