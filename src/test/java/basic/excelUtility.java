package basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class excelUtility {
	
	
	@DataProvider(name = "readFromExcel")
	public Object[][] readExcelData()
	{
		Object[][] edata =null;
		File file = new File("./src/test/java/testDataManagement/userData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(file);
			try {
				XSSFWorkbook wb =new XSSFWorkbook(fis);
				XSSFSheet sheet = wb.getSheet("Sheet1");
				int numberOfRows =sheet.getLastRowNum();
				int noRows= sheet.getPhysicalNumberOfRows();
			int columns=sheet.getRow(0).getPhysicalNumberOfCells();
			edata= new Object[noRows-1][columns];
				
				for(int i=1;i<=numberOfRows;i++)
				{
					int numberOfcells =sheet.getRow(i).getLastCellNum();
					for(int j=0;j<numberOfcells;j++)
					{
						edata[i-1][j]=(getcellValue(sheet.getRow(i).getCell(j))+" ");
					}
					System.out.println();
				}
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return edata;
	}
	
	
	public Object getcellValue(Cell cell) {
		if(cell==null) {
			return "";
		}
		switch(cell.getCellType()) {
		case STRING:
			return cell.getStringCellValue();
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				return cell.getDateCellValue();
			}
			return cell.getNumericCellValue();
		case BOOLEAN:
			return cell.getBooleanCellValue();
		case BLANK:
			return "";
			default:
				return "";
	}
		
		
	}

}
