package autodemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autodemo.base.Base;

public class EngageProductDetails extends Base{
	
	public EngageProductDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='projectName']")
	WebElement projectName;
	
	@FindBy(xpath = "//input[@name='sponsorName']")
	WebElement sponsorName;
	
	@FindBy(xpath = "//input[@name='sponsorEmail']")
	WebElement sponsorEmail;
	
	@FindBy(xpath = "//span[text()='NEXT']")
	WebElement nextbutton;
	
	public void fillDetails() {
		projectName.sendKeys("PradeepNewProject");
		sponsorName.sendKeys("Virendar");
		sponsorEmail.sendKeys("virendar@3pillarglobal.com");
	}
	
	public OtherDetails od() {
		nextbutton.click();
		
		return new OtherDetails();
	}

}
