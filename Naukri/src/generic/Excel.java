package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements AutoConst
{
	public static int getRowCount(String path, String sheet)
	{
		int rc=0;
		try
		{
			FileInputStream fis=new FileInputStream(INPUT_PATH);
			Workbook wb=WorkbookFactory.create(fis);
		    rc=wb.getSheet(SHEET).getLastRowNum();
		}
		catch(Exception e)
		{
			
		}
		return rc;
	}
	public static String getCellValue(String path,String sheet,int r, int c)
	{
		String v=" ";
		try
		{
			FileInputStream fis=new FileInputStream(INPUT_PATH);
			Workbook wb=WorkbookFactory.create(fis);
			v=wb.getSheet(SHEET).getRow(r).getCell(c).toString();
		}
		catch(Exception e)
		{
			
		}
		return v;
	}
	
}
