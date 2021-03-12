package autodemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autodemo.base.Base;

public class AddProduct extends Base{
	
	@FindBy(xpath = "//button[@id='add-new-project']")
	WebElement addnewproductbutton;
	
	public AddProduct() {
		PageFactory.initElements(driver, this);
	}
	
	public CreateProduct createproduct() {
		addnewproductbutton.click();
		
		return new CreateProduct();
	}

}
