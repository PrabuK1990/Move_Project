import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginPageInputs {

	public static String LoginPageInputs_Url;
	public static String LoginPageInputs_EmailID;
	public static String LoginPageInputs_Password;
	public static String LoginPageInputs_ExpectedErrorMsgCombination = "Invalid details. Please check the Email ID - Password combination.";
	public static String LoginPageInputs_ExpectedErrorMsgEmailField = "Please enter your Email ID / Username";
	public static String LoginPageInputs_ExpectedErrorMsgPasswordField = "Please enter your Password";
	
	public void loadNaukriInputs() throws IOException {
		
		 
        FileInputStream file = new FileInputStream(new File("src\\main\\resources\\Inputs\\Naukri_Inputs.xlsx"));
        
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        XSSFSheet sheet = workbook.getSheetAt(0);
        
        Row row = sheet.getRow(1);
		
		LoginPageInputs_Url = row.getCell(0).getStringCellValue();
		
		LoginPageInputs_EmailID = row.getCell(1).getStringCellValue();
		
		LoginPageInputs_Password = row.getCell(2).getStringCellValue();

	}
	
	
}
