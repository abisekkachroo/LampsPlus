package TestPackageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public enum CreatingBrowser {
	INSTANCE;
	public static  WebDriver driver;
	@BeforeTest
	public static  WebDriver setBrowser()// double checked login using synchronized keyword will increase the time by 100
	{
		if(driver==null){
			synchronized(Singleton.class){
				System.setProperty("webdriver.chrome.driver","/home/user/Downloads/driver/chromedriver");
				 driver = new ChromeDriver();	
			}
		}
		driver.manage().window().maximize();
		return driver;
	}
}
