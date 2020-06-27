import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginPageInputs_Excel {

	public void loadNaukriInputs() throws FileNotFoundException, IOException {
		
 
        FileInputStream file = new FileInputStream(new File("src\\main\\resources\\Inputs\\Naukri_Inputs.xlsx"));
        
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);
        
        Row row = sheet.getRow(1);
		
		String naukriUrl = row.getCell(0).getStringCellValue();
		System.out.println("URL : " + naukriUrl);
		
		String naukriUsername = row.getCell(1).getStringCellValue();
		System.out.println("UserName : " + naukriUsername);
		
		String naukriUPassword= row.getCell(2).getStringCellValue();
		System.out.println("Password : " + naukriUPassword);

	}

}
