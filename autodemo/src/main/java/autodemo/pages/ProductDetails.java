package autodemo.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import autodemo.base.Base;

public class ProductDetails<ProjectDetails1> extends Base{
	
	public ProductDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='search']")WebElement searchbar;
	@FindBy(xpath = "//p[text()='Pradeep New Project']")WebElement pradeepproject;
	
	@FindBy(xpath = "//p[text()='Client Name:']//following-sibling::p")WebElement clientname1;
	@FindBy(xpath = "//p[text()='Delivery Lead']//following-sibling::p")WebElement dlname1;
	@FindBy(xpath = "//p[text()='Delivery Lead Email:']//following-sibling::p")WebElement dlemail1;
	@FindBy(xpath = "//p[text()='Client Engagement Manager:']//following-sibling::p")WebElement cemname1;
	@FindBy(xpath = "//p[text()='Client Engagement Manager Email:']//following-sibling::p")WebElement cememail1;
	@FindBy(xpath = "//p[text()='Pradeep New Project']//preceding-sibling::button")WebElement gobackbutton;
	
	private static String[] arrayelements;
	
	public void Searchproduct() throws InterruptedException {
		searchbar.sendKeys("pradeep");
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		pradeepproject.click();
	}
	
	public static String[] getArrayelements() {
		return arrayelements;
	}
	public void setArrayelements(String[] arrayelements) {
		this.arrayelements = arrayelements;
	}
	
	public AddProduct ap() throws InterruptedException {
		String ClientName1 = clientname1.getText();
		String DLName1 = dlname1.getText();
		String DLEmail1 = dlemail1.getText();
		String CEMName1 = cemname1.getText();
		String CEMEmail1 = cememail1.getText();
		String[] ProjectDetails1 = {ClientName1, DLName1, DLEmail1, CEMName1, CEMEmail1};
		arrayelements = ProjectDetails1;
		this.setArrayelements(ProjectDetails1);
		gobackbutton.click();
		return new AddProduct();
	}
	

}
