package seleniumAssignments;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Dummy {

	public static void main(String[] args) throws BiffException, IOException {
		

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
				System.out.println(C1.getContents());
				ob[i][j] =C1.getContents();
			}
		}	
	
		
	}
	
	
}
