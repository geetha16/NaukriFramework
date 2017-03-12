package script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import pom.ProfilePage;
import generic.BaseTest;

public class UploadResumeAndLogout extends BaseTest
{
	/*@Test
	public void verifyLogin()
	{
		LoginPage l= new LoginPage(driver);
		l.clickLoginLink();
		l.setEmailAddress("qatestbn@gmail.com");
		l.setPassword("barnesandnobles");
		l.clickLogin();
		//l.verifyTitle("Mynaukri");
	}*/
	@Test
	public void upload() throws IOException
	{
		Login l=new Login();
		l.verifyLogin();
		
		ProfilePage p=new ProfilePage(driver);
		//p.verifyTitle("Profile|Mynaukri");
		p.upload();
		p.attachCV();
		
		//Take Screenshot
		TakesScreenshot t =(TakesScreenshot) driver;
		File srcFile=t.getScreenshotAs(OutputType.FILE);
		File destFile= new File("./Screenshot/FileUpload.png");
		FileUtils.copyFile(srcFile, destFile);
		p.uploadSave();
		
		p.logOut();
		//p.verifyTitle("My Naukri");
		
		
		
	}

	
	
	

}
