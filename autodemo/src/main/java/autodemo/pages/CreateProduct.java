package autodemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import autodemo.base.Base;

public class CreateProduct extends Base{
	
	public CreateProduct() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class=' css-1wa3eu0-placeholder']")
	WebElement projectname;
	
	@FindBy(xpath = "//input[@name='client']")
	WebElement clientname;
	
	@FindBy(xpath = "//input[@name='dlName']")
	WebElement dlname;
	
	@FindBy(xpath = "//input[@name='dlEmail']")
	WebElement dlemail;
	
	@FindBy(xpath = "//input[@name='cemName']")
	WebElement cemname;
	@FindBy(xpath = "//input[@name='cemEmail']")
	WebElement cememail;
	
	@FindBy(xpath = "//span[text()='NEXT']")
	WebElement nextbutton;
	
	private static String[] arrayelements;
	 
	
	public void addproduct() throws InterruptedException {
		Thread.sleep(3000);
		projectname.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@autocapitalize='none']")).sendKeys("sow1");
		driver.findElement(By.xpath("//input[@autocapitalize='none']")).sendKeys(Keys.ENTER);
	}
	public static String[] getArrayelements() {
		return arrayelements;
	}
	public void setArrayelements(String[] arrayelements) {
		this.arrayelements = arrayelements;
	}
	public void saveelements() throws InterruptedException {
		Thread.sleep(3000);
		String ClientName = clientname.getAttribute("value");
		String DLName = dlname.getAttribute("value");
		String DLEmail = dlemail.getAttribute("value");
		String CEMName = cemname.getAttribute("value");
		String CEMEmail = cememail.getAttribute("value");
		String[] ProjectDetails = {ClientName, DLName, DLEmail, CEMName, CEMEmail};
		arrayelements = ProjectDetails;
		this.setArrayelements(ProjectDetails);
	}
	

	public EngageProductDetails epd() {
		nextbutton.click();
		
		return new EngageProductDetails();
	}

}
