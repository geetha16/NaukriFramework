package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic.BasePage;

public class MyNaukriPage extends BasePage
{
	
	@FindBy(xpath="//div[.='My Naukri']")
	private WebElement linkMyNaukri;
	
	//view profile button
	@FindBy(xpath=("//button[@class='w205']"))
	private WebElement viewBtn;
	
	
	public MyNaukriPage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void clickMyNaukri()
	{
		linkMyNaukri.click();
	}
	
	public void navigateToProfile()
	{
		viewBtn.click();
	}

}
