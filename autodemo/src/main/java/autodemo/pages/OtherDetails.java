package autodemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autodemo.base.Base;

public class OtherDetails extends Base{
	
	public OtherDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='isEhiPhcExempted' and @value='yes']")
	WebElement radio1;
	
	@FindBy(xpath = "//input[@name='ehiExemptionReason']")
	WebElement exemptionreason;
	
	@FindBy(xpath = "//input[@name='engagementTerm' and @value='1']")
	WebElement shorttermradio;
	
	@FindBy(xpath = "//div[text()='Date* ']//child::div")
	WebElement date;
	
	@FindBy(xpath = "//span[text()='4']")
	WebElement todaydate;
	
	@FindBy(xpath = "//span[text()='CANCEL']")
	WebElement cancelbutton;
	
	@FindBy(xpath = "//span[text()='ADD']")
	WebElement addbutton;
	
	@FindBy(xpath = "//span[text()='Leave']")
	WebElement leavebutton;
	
	@FindBy(xpath = "//span[text()='OK']")
	WebElement calendarok;
	
	@FindBy(xpath = "//button[@id='button-confirmation-positive']")
	WebElement confirmbutton;
	
	public AddProduct ap() {
		radio1.click();
		exemptionreason.sendKeys("nothing");
		shorttermradio.click();
		date.click();
		todaydate.click();
		calendarok.click();
		addbutton.click();
		confirmbutton.click();
		cancelbutton.click();
		leavebutton.click();
		
		return new AddProduct();
	}
	


}
