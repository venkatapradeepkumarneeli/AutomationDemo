package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.pages.AddProduct;
import autodemo.pages.CreateProduct;
import autodemo.pages.loginpage;

public class createproducttest extends Base{
	
	loginpage lp;
	AddProduct ap;
	
	@Test
	public void createproduct() throws InterruptedException {
		CreateProduct cp = new CreateProduct();
		cp.addproduct();
		cp.saveelements();
		cp.epd();
	}

}
