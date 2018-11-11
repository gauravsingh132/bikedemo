package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Firstpage {
	
	public static void RegistrationDate_Month(WebDriver driver,String value)
	{
		Select sel=new Select(driver.findElement(By.id("RegistrationDate_Month")));
		sel.selectByVisibleText(value);
		
	}
	
	public static void RegistrationDate_Year(WebDriver driver,String value)
	{
		Select sel1=new Select(driver.findElement(By.id("RegistrationDate_Year")));
		sel1.selectByVisibleText(value);
	}
	public static void PurchaseDate_Month(WebDriver driver,String value)
	{
		List<WebElement> ele= driver.findElements(By.xpath("//select[@id='PurchaseDate_Month']//option"));
		for(WebElement arr: ele)
		{
			System.out.println(arr);
		}
		/*
		WebDriverWait wait= new WebDriverWait(driver, 5000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='PurchaseDate_Month']//option[text()='12- décembre']")));
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		*/
		Select sel2=new Select(driver.findElement(By.id("PurchaseDate_Month")));
		sel2.selectByVisibleText(value);
		
	}
	public static void PurchaseDate_Year(WebDriver driver,String value)
	{
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).build().perform();
		//Select sel3=new Select(driver.findElement(By.id("PurchaseDate_Year")));
		//sel3.selectByVisibleText(value);
	}
	public static void btnFindMyBike(WebDriver driver,String value)
	{
		driver.findElement(By.id("btnFindMyBike")).click();
	}
	public static void Marque(WebDriver driver,String value)
	{
		//driver.findElement(By.id("AP")).click();
		driver.findElement(By.xpath("//img[@title='APRILIA']")).click();
	}
	public static void Modèle(WebDriver driver,String value)
	{
		driver.findElement(By.id("3")).click();
	}
	public static void Version(WebDriver driver,String value)
	{
		driver.findElement(By.xpath("//div[@id='tableau']//tr[2]")).click();
	}
	
	
	public static void BikeUsage(WebDriver driver,String value)
	{
		Select sel=new Select(driver.findElement(By.id("BikeUsage")));
		sel.selectByVisibleText(value);
	}
	public static void NightParkingMode(WebDriver driver,String value)
	{
		Select sel=new Select(driver.findElement(By.id("NightParkingMode")));
		sel.selectByVisibleText(value);
	}
	public static void iBtnNext(WebDriver driver,String value)
	{
		driver.findElement(By.id("iBtnNext")).click();
	}

}
