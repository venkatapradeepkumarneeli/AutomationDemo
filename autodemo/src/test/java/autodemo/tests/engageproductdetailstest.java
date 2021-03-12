package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.pages.AddProduct;
import autodemo.pages.CreateProduct;
import autodemo.pages.EngageProductDetails;
import autodemo.pages.loginpage;

public class engageproductdetailstest extends Base{
	
	loginpage lp;
	AddProduct ap;
	CreateProduct cp;
	
	@Test
	public void engageproductdetails() {
		EngageProductDetails edp = new EngageProductDetails();
		edp.fillDetails();
		edp.od();
	}

}
