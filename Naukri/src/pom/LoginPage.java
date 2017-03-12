package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import generic.BasePage;

public class LoginPage extends BasePage
{
	@FindBy(xpath="//div[@class='mTxt' and contains(text(),'Login')]")
	private WebElement loginLink;
	
	public void clickLoginLink()
	{
		loginLink.click();
	}
	@FindBy(id="eLogin")
	private WebElement un;
	
	@FindBy(id="pLogin")
	private WebElement pw;
	
	@FindBy(xpath ="//button[@value='Login']")
	private WebElement loginBtn;
	
	@FindBy(xpath = "//div[contains(.='Invalid')]")
	private WebElement errMsg;
		 
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	public void setEmailAddress(String email)
	{
		un.sendKeys(email);
	}
	
	public void setPassword(String pwd)
	{
		pw.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}
	
	public void verifyErrMsgPresent(SoftAssert s)
	{
		WebDriverWait wait = new WebDriverWait(driver,10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			Reporter.log("Error Message is displayed", true);
		}
		
		catch (Exception e)
		{
			Reporter.log("Error message is not displayed", true);
		}
	}
}