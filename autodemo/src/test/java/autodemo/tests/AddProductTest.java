package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.pages.AddProduct;
import autodemo.pages.loginpage;

public class AddProductTest extends Base{
	
	loginpage lp;
	
	@Test
	public void addproduct() {
		AddProduct ap = new AddProduct();
		ap.createproduct();
	}

}
