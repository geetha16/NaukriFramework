package script;

import org.testng.annotations.Test;

import pom.MyNaukriPage;
import generic.BaseTest;

public class MyNaukri extends BaseTest
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
	public void navigateToMyNaukri()
	{
		Login l=new Login();
		l.verifyLogin();
		MyNaukriPage m=new MyNaukriPage(driver);
		m.clickMyNaukri();
		m.navigateToProfile();
	}

}
