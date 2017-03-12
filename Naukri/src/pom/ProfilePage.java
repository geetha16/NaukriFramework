package pom;

import generic.BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePage extends BasePage
{
	@FindBy(id="uploadLink")
	private WebElement clickUploadLink;
    
	@FindBy(id="attachCV")
	private WebElement clickAttachCV;
	
	public ProfilePage(WebDriver driver) 
	{
		super(driver);
	}

	public void upload()
	{
		clickUploadLink.click();
	}
	
	public void attachCV()
	{
		clickAttachCV.sendKeys("./data/MyCV.docx");
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
		logout.click();
	}
}
