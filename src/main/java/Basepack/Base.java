package Basepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;


public class Base {
	public static WebDriver driver;
	
	@BeforeTest
	public static void base()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://moto.lelynx.fr/assurance-moto/comparateur-moto-vehicule.aspx");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
}
