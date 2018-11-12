package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;


public class Testcase_02 {
	
	@Test
	public void tc_02() throws Exception
	{
		File file= new File("C:\\Users\\gausing\\Downloads\\selenium-java-3.141.0\\Testing\\Sanity.xlsx");
		FileInputStream is= new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(is);
        XSSFSheet sheet= wb.getSheet("Sheet1");
        XSSFRow row0=sheet.getRow(0);

       for(int k=1;k<sheet.getPhysicalNumberOfRows();k++)
       {
           XSSFRow row=sheet.getRow(k);

    	   
    	   for(int i=0;i<=row.getPhysicalNumberOfCells();i++)
    	   {
      		 String cell0= row0.getCell(i).getStringCellValue();
    		 String cell1= row.getCell(i).getStringCellValue();
    		  
    		 
    	   }
    	   
       }
        
	}

	
	
}
	
