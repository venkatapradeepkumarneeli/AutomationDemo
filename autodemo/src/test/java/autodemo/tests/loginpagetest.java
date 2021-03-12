package autodemo.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.pages.loginpage;

public class loginpagetest extends Base{
	
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@Test
	public void login() throws InterruptedException {
		loginpage lp = new loginpage();
		lp.addproduct();
	}

}
