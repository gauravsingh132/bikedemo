package Basepack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;

public class Base {
	public static WebDriver driver;
	
	public static void base()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gausing\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://moto.lelynx.fr/assurance-moto/comparateur-moto-vehicule.aspx");
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	}
}
