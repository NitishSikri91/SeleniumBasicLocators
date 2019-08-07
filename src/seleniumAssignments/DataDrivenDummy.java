package seleniumAssignments;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenDummy {

	@Test(dataProvider = "DP2")
	public void TC1(String username , String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@DataProvider
	public Object[][] DP1()
	
	{	Object[][] ob = new Object[2][2];
		ob[0][0]="Username1";
		ob[0][1]="Password1";
		ob[1][0]="Username2";
		ob[1][1]="Password2";		
		return ob;}

	@DataProvider
	public Object[][] DP2() throws BiffException, IOException
	{
		File f = new File("C:\\Users\\Nitish\\Desktop\\Workspace\\Learning Tracker\\InputDDFW.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet(0);
		int r = s.getRows();
		int c = s.getColumns();
		Object[][] ob = new Object[r][c]; // Column Row format
		
		for (int i=0;i<r;i++)
		{
			for (int j=0;j<c;j++)
			{
				Cell C1 = s.getCell(j, i);
				ob[i][j] =C1.getContents();
			}
		}	
		System.out.println(ob);
		return ob;
	}
	
	
	
}
