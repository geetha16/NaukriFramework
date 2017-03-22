package pom;


import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BasePage
{
	
	
	@FindBy(id="uploadLink")
	private WebElement clickUploadLink;
    
	@FindBy(id="attachCV")
	private WebElement clickAttachCV;
	
	public ProfilePage(WebDriver driver) 
	{
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void upload()
	{
		clickUploadLink.click();
	}
	
	public void attachCV(String CV)
	{
		clickAttachCV.sendKeys(CV);
	}
	
	@FindBy(xpath=("//button[@type='button']"))
	private WebElement save;
	
	public void uploadSave()
	{
		save.click();
	}
	
	//logout
	@FindBy(xpath="//a[@class='logout']")
	private WebElement logout;
	
	public void logOut()
	{
		Actions action = new Actions(driver);
        action.moveToElement(logout).click();
       
	}
}
