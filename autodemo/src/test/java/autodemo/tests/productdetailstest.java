package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.pages.AddProduct;
import autodemo.pages.CreateProduct;
import autodemo.pages.EngageProductDetails;
import autodemo.pages.OtherDetails;
import autodemo.pages.ProductDetails;
import autodemo.pages.loginpage;

public class productdetailstest extends Base{
	
	loginpage lp;
	AddProduct ap;
	CreateProduct cp;
	EngageProductDetails epd;
	OtherDetails od;
	
	@Test
	public void productdetails() throws InterruptedException {
//		od.pd();
		ProductDetails pd = new ProductDetails();
		pd.Searchproduct();
		pd.ap();
	}

}
