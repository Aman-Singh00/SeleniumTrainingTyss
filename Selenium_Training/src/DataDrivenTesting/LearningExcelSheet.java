package DataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LearningExcelSheet {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Register("Register");
		objectArray("Register");
		
	}
	public static void Register(String sheetname) throws EncryptedDocumentException, IOException
	{
		File file = new File("./TestData/RegisterData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<row;i++)
		{
			for(int j =0;j<cell;j++)
			{
				System.out.println(sheet.getRow(i).getCell(j).toString());
				
			}
		}
	}
	
	public static String[][] objectArray(String sheetname) throws IOException
	{
		File file = new File("./Testdata/AmazonRegsiterData.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sheet = book.getSheet(sheetname);
		int row = sheet.getPhysicalNumberOfRows();
		int col = sheet.getRow(1).getPhysicalNumberOfCells();
		String[][] data = new String[row-1][col];
		for(int i=1;i<row;i++)//<--row iteration
		{
			for(int j=0;j<col;j++)//<--col-iteration
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		//for(int i=0;i<row-1;i++)//<--row iteration
//		{
//			for(int j=0;j<col;j++)//<--col-iteration
//			{
//				System.out.println(data[i][j]);
//			}
//		}
		return data;
}
}
