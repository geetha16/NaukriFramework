package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class MyNaukriPage extends BasePage
{
	
	@FindBy(xpath="//div[.='My Naukri']")
	private WebElement linkMyNaukri;
	
	//view profile button
    //@FindBy(xpath=("//b[contains(text(),'Complete Your Profile')]"))
	@FindBy(xpath=("//b[contains(text(),'View and Update Profile')]"))
	private WebElement viewBtn;
	
	
	public MyNaukriPage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickMyNaukri()
	{
		
		linkMyNaukri.click();
		linkMyNaukri.sendKeys(Keys.CONTROL +"\t");
	}
	
	public void navigateToProfile()
	{
		viewBtn.click();
	}

}
