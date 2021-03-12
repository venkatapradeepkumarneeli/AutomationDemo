package autodemo.tests;

import org.testng.annotations.Test;

import autodemo.base.Base;
import autodemo.pages.CompareArrays;

public class comparearraystest extends Base{
	
	CompareArrays ca;
	
	@Test
	public void comparearray() {
		ca = new CompareArrays();
		ca.arraycompare();
	}

}
