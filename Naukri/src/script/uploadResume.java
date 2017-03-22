package script;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import generic.BaseTest;
import generic.Excel;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pom.LoginPage;
import pom.MyNaukriPage;
import pom.ProfilePage;

public class uploadResume extends BaseTest 
{
	@Test
	public void testUploadResumeLogout() throws IOException, InterruptedException
	{
		LoginPage l= new LoginPage(driver);
		driver.get("http://www.naukri.com");
		String parent=driver.getWindowHandle();
		Set<String> allWH = driver.getWindowHandles();
		allWH.remove(parent);
		for(String wh:allWH)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
		driver.switchTo().window(parent);
		//l.verifyTitle("Jobseeker's Login: Search the Best Jobs available in India & Abroad - Naukri.com");
		l.clickLoginLink();
		
		int rc=Excel.getRowCount(INPUT_PATH, SHEET);
		for(int i=0;i<=rc;i++)
		{
			String email=Excel.getCellValue(INPUT_PATH, SHEET, i, 0);
			String pwd=Excel.getCellValue(INPUT_PATH, SHEET, i, 1);
			l.setEmailAddress(email);
			l.setPassword(pwd);
			l.clickLogin();
		}
		/*l.setEmailAddress("qatestbn@gmail.com");
		l.setPassword("barnesandnobles");
		l.clickLogin();*/
	    //l.verifyTitle("Mynaukri");
		
		MyNaukriPage m=new MyNaukriPage(driver);
		/*m.clickMyNaukri();
		driver.switchTo().window("Mynaukri");*/
		m.navigateToProfile();
		   
		ProfilePage p=new ProfilePage(driver);
		//p.verifyTitle("Profile|Mynaukri");
		p.upload();
		String CV = Excel.getCellValue(INPUT_PATH, SHEET, 0, 2);
		p.attachCV(CV);
			
		//Take Screenshot
		TakesScreenshot t =(TakesScreenshot) driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./Screenshot/FileUpload.png");
		FileUtils.copyFile(srcFile, destFile);
		p.uploadSave();
			
		p.logOut();
		Thread.sleep(2000);
		//p.verifyTitle("My Naukri");
			
			
			
		}

}


