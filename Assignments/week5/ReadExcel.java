package Assignments.week5;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	
	
		public static String[][] readexcel() throws IOException

		{
			
		XSSFWorkbook wbook =new XSSFWorkbook("C:\\Rahul\\MemberData.xlsx");
		
		XSSFSheet sheet = wbook.getSheet("CCDatadetails");
		
		int rowCount = sheet.getLastRowNum();
		
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String[][] data = new String[rowCount][colCount];
		for(int i=1; i<=rowCount; i++)
		{
			for(int j=0;j<colCount; j++)
			{
				
				String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
				
				data[i-1][j]=stringCellValue;
			}
		}
		wbook.close();
		
		return data;
	}

		}
