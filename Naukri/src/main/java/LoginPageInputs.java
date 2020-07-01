import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LoginPageInputs {

	public static String LoginPageInputs_CorrectCombiation;
	public static String LoginPageInputs_CorrectEmail;
	public static String LoginPageInputs_CorrectPassword;
	public static String LoginPageInputs_IncorrectCombination;
	public static String LoginPageInputs_IncorrectEmail;
	public static String LoginPageInputs_IncorrectPassword;
	public static String LoginPageInputs_LineBreak;
	public static String LoginPageInputs_CombinationExp;
	public static String LoginPageInputs_CombinationAct;
	public static String LoginPageInputs_EmailExp;
	public static String LoginPageInputs_EmailAct;
	public static String LoginPageInputs_PasswordExp;
	public static String LoginPageInputs_PasswordAct;
	public static String LoginPageInputs_HeaderUrl;
	public static String LoginPageInputs_HeaderEmailID;
	public static String LoginPageInputs_HeaderPassword;
	public static String LoginPageInputs_HeaderExpectedErrorMsgCombination;
	public static String LoginPageInputs_HeaderExpectedErrorMsgEmailField;
	public static String LoginPageInputs_HeaderxpectedErrorMsgPasswordField;
	public static String LoginPageInputs_Url;
	public static String LoginPageInputs_EmailID;
	public static String LoginPageInputs_Password;
	public static String LoginPageInputs_ExpectedErrorMsgCombination;
	public static String LoginPageInputs_ExpectedErrorMsgEmailField;
	public static String LoginPageInputs_ExpectedErrorMsgPasswordField;
	
	public void loadNaukriInputs() throws IOException {
		
		 
        FileInputStream naukriExcel = new FileInputStream(new File("src\\main\\resources\\Inputs\\Naukri_Inputs.xlsx"));
        
        XSSFWorkbook naukriWorkbook = new XSSFWorkbook(naukriExcel);

        XSSFSheet sheet1 = naukriWorkbook.getSheetAt(0);
        
        XSSFSheet sheet2 = naukriWorkbook.getSheetAt(1);
        
        Row row0 = sheet1.getRow(0);
        
        Row row1 = sheet1.getRow(1);
        
        Row row1Print = sheet2.getRow(1);
        
        LoginPageInputs_CorrectCombiation = row1Print.getCell(0).getStringCellValue();
        LoginPageInputs_CorrectEmail = row1Print.getCell(1).getStringCellValue();
        LoginPageInputs_CorrectPassword = row1Print.getCell(2).getStringCellValue();
        LoginPageInputs_IncorrectCombination = row1Print.getCell(3).getStringCellValue();
        LoginPageInputs_IncorrectEmail = row1Print.getCell(4).getStringCellValue();
        LoginPageInputs_IncorrectPassword = row1Print.getCell(5).getStringCellValue();
        LoginPageInputs_LineBreak = row1Print.getCell(6).getStringCellValue();
        LoginPageInputs_CombinationExp = row1Print.getCell(7).getStringCellValue();
        LoginPageInputs_CombinationAct = row1Print.getCell(8).getStringCellValue();
        LoginPageInputs_EmailExp = row1Print.getCell(9).getStringCellValue();
        LoginPageInputs_EmailAct = row1Print.getCell(10).getStringCellValue();
        LoginPageInputs_PasswordExp = row1Print.getCell(11).getStringCellValue();
        LoginPageInputs_PasswordAct = row1Print.getCell(12).getStringCellValue();
        
        
		LoginPageInputs_HeaderUrl = row0.getCell(0).getStringCellValue();
		LoginPageInputs_HeaderEmailID = row0.getCell(1).getStringCellValue();
		LoginPageInputs_HeaderPassword = row0.getCell(2).getStringCellValue();
		LoginPageInputs_HeaderExpectedErrorMsgCombination = row0.getCell(3).getStringCellValue();
		LoginPageInputs_HeaderExpectedErrorMsgEmailField = row0.getCell(4).getStringCellValue();
		LoginPageInputs_HeaderxpectedErrorMsgPasswordField = row0.getCell(5).getStringCellValue();
		
		LoginPageInputs_Url = row1.getCell(0).getStringCellValue();
		LoginPageInputs_EmailID = row1.getCell(1).getStringCellValue();
		LoginPageInputs_Password = row1.getCell(2).getStringCellValue();
		LoginPageInputs_ExpectedErrorMsgCombination = row1.getCell(3).getStringCellValue();
		LoginPageInputs_ExpectedErrorMsgEmailField = row1.getCell(4).getStringCellValue();
		LoginPageInputs_ExpectedErrorMsgPasswordField = row1.getCell(5).getStringCellValue();
		
		System.out.println(LoginPageInputs_HeaderUrl + ":" + LoginPageInputs_Url);
		System.out.println(LoginPageInputs_HeaderEmailID + ":" + LoginPageInputs_EmailID);
		System.out.println(LoginPageInputs_HeaderPassword + ":" + LoginPageInputs_Password);
		System.out.println(LoginPageInputs_HeaderExpectedErrorMsgCombination + ":" + LoginPageInputs_ExpectedErrorMsgCombination);
		System.out.println(LoginPageInputs_HeaderExpectedErrorMsgEmailField + ":" + LoginPageInputs_ExpectedErrorMsgEmailField);
		System.out.println(LoginPageInputs_HeaderxpectedErrorMsgPasswordField + ":" + LoginPageInputs_ExpectedErrorMsgPasswordField);
	}
	
	
	
}
