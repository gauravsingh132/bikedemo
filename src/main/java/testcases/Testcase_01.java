package testcases;


import Basepack.Base;
import pages.Firstpage;

public class Testcase_01 extends Base {
	
	
	public static void main(String arg[]) throws Exception
	{
		Base.base();
		Testcase_01 obj= new Testcase_01();
		obj.tc_01();
	}
	
	
	
	public void tc_01() throws Exception
	{
		Firstpage.RegistrationDate_Month(driver, "06- juin");
		Firstpage.RegistrationDate_Year(driver, "2012");
		Thread.sleep(2000);
		
		Firstpage.PurchaseDate_Month(driver, "06- juin");
		Thread.sleep(2000);
		Firstpage.PurchaseDate_Year(driver, "2016");
		Thread.sleep(2000);
		Firstpage.btnFindMyBike(driver, "String");
		Thread.sleep(2000);

		Firstpage.Marque(driver, "String");
		Thread.sleep(2000);

		Firstpage.Modèle(driver, "String");
		Thread.sleep(2000);

		Firstpage.Version(driver, "String");
		Thread.sleep(2000);

		Firstpage.BikeUsage(driver, "Privé exclusivement");
		Thread.sleep(2000);

		Firstpage.NightParkingMode(driver, "Garage fermé individuel");
		Firstpage.iBtnNext(driver, "String");
	}

}
