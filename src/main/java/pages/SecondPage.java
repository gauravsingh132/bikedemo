package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondPage {

	public void IsDocumentHolder0(WebDriver driver, String value)
	{
		if(value=="TRUE")
		{
			driver.findElement(By.id("IsDocumentHolder0")).click();
		}
		
	}
	public void IsDocumentHolder1(WebDriver driver, String value)
	{
		if(value=="TRUE")
		{
			driver.findElement(By.id("IsDocumentHolder1")).click();
		}
	}
	public void GenderMale(WebDriver driver, String value)
	{
		if(value=="TRUE")
		{
			driver.findElement(By.id("GenderMale")).click();
		}
	}
	public void GenderFemale(WebDriver driver, String value)
	{
		if(value=="TRUE")
		{
			driver.findElement(By.id("GenderFemale")).click();
		}
	}
	public void FirstName(WebDriver driver, String value)
	{
		driver.findElement(By.id("FirstName")).sendKeys(value);
	}
	public void LastName(WebDriver driver, String value)
	{
		driver.findElement(By.id("LastName")).sendKeys(value);
	}
	public void DateOfBirth_Day(WebDriver driver, String value)
	{
		driver.findElement(By.id("DateOfBirth_Day")).sendKeys(value);
	}
	public void DateOfBirth_Month(WebDriver driver, String value)
	{
		driver.findElement(By.id("DateOfBirth_Month")).sendKeys(value);
	}
	public void DateOfBirth_Year(WebDriver driver, String value)
	{
		driver.findElement(By.id("DateOfBirth_Year")).sendKeys(value);
	}
	public void MaritalStatus(WebDriver driver, String value)
	{
		Select sel = new Select(driver.findElement(By.id("MaritalStatus")));
		sel.selectByVisibleText(value);
	}
	public void LicenseType(WebDriver driver, String value)
	{
		Select sel = new Select(driver.findElement(By.id("LicenseType")));
		sel.selectByVisibleText(value);
	}
	public void BikeLicenseDate_Month(WebDriver driver, String value)
	{
		if(value !="#")
		{
			Select sel = new Select(driver.findElement(By.id("BikeLicenseDate_Month")));
			sel.selectByVisibleText(value);		
		}
	}
	public void BikeLicenseDate_Year(WebDriver driver, String value)
	{
		if(value !="#")
		{
			Select sel = new Select(driver.findElement(By.id("BikeLicenseDate_Year")));
			sel.selectByVisibleText(value);		
		}
	}
	public void BikeSubLicenseType(WebDriver driver, String value)
	{
		Select sel = new Select(driver.findElement(By.id("BikeSubLicenseType")));
		sel.selectByVisibleText(value);		
		
	}
	public void CarLicenseDate_Month(WebDriver driver, String value)
	{
		if(value !="#")
		{
			Select sel = new Select(driver.findElement(By.id("CarLicenseDate_Month")));
			sel.selectByVisibleText(value);		
		}
	}
	public void CarLicenseDate_Year(WebDriver driver, String value)
	{
		if(value !="#")
		{
			Select sel = new Select(driver.findElement(By.id("CarLicenseDate_Year")));
			sel.selectByVisibleText(value);		
		}
	}
	public void IsA2LicObtention(WebDriver driver, String value)
	{
		if(value !="#")
		{
			if(value=="TRUE")
			{
				driver.findElement(By.xpath("//input[@id='IsA2LicObtention' and @value='1' and @type='radio']")).click();
			}
			else
			{
				driver.findElement(By.xpath("//input[@id='IsA2LicObtention' and @value='2' and @type='radio']")).click();

			}
		}
	}
	public void BikeA2LicDate_Month(WebDriver driver, String value)
	{
		if(value !="#")
		{
			Select sel = new Select(driver.findElement(By.id("BikeA2LicDate_Month")));
			sel.selectByVisibleText(value);		
		}
	}
	public void BikeA2LicDate_Year(WebDriver driver, String value)
	{
		if(value !="#")
		{
			Select sel = new Select(driver.findElement(By.id("BikeA2LicDate_Year")));
			sel.selectByVisibleText(value);		
		}
	}
	public void Disclaimer(WebDriver driver, String value)
	{
		driver.findElement(By.id("Disclaimer")).click();
	}
}
