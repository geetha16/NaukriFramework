package script;

import java.util.Set;

import generic.BaseTest;
import generic.Excel;

import org.testng.annotations.Test;

import pom.LoginPage;

public class Login extends BaseTest
{
	@Test
	public void verifyLogin()
	{
		LoginPage l= new LoginPage(driver);
		//l.verifyTitle("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
	    l.clickLoginLink();
	    
/*	    int rc=Excel.getRowCount(INPUT_PATH, SHEET);
	    for(int i=1;i<=rc;i++)
	    {
	    	String email=Excel.getCellValue(INPUT_PATH,SHEET, i, 0);
	    	String pwd=Excel.getCellValue(INPUT_PATH,SHEET, i, 1);
	    	l.setEmailAddress(email);
			l.setPassword(pwd);
			l.clickLogin();
	    }
		
*/		
	    l.setEmailAddress("qatestbn@gmail.com");
		l.setPassword("barnesandnobles");
		l.clickLogin();
	    //l.verifyTitle("Mynaukri");

}
}