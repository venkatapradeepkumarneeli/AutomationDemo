package autodemo.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import autodemo.base.Base;

public class loginpage extends Base{
	
	@FindBy(xpath = "//span[text()='Google Sign in']")
	WebElement loginbutton;
	
	@FindBy(xpath = "//input[@type='email']")
	WebElement emailtext;
	
	@FindBy(xpath = "//span[text()='Next']//following-sibling::div")
	WebElement nextbutton;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement passwordtext;
	
	
	public loginpage() {
		PageFactory.initElements(driver, this);
	}
	
	public AddProduct addproduct() throws InterruptedException {
		String firstwindow = driver.getWindowHandle();
		loginbutton.click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		while(itr.hasNext()) {
			String window = itr.next();
			driver.switchTo().window(window);
			if(driver.getTitle().equals("Sign in – Google accounts")) {
				break;
			}
		}
		emailtext.sendKeys("pradeep.kumar@3pillarglobal.com");
		nextbutton.click();
		Thread.sleep(3000);
		passwordtext.click();
		passwordtext.sendKeys("Nvpk_959");
		nextbutton.click();
		driver.switchTo().window(firstwindow);

		Thread.sleep(3000);
		
		return new AddProduct();
	}

}
