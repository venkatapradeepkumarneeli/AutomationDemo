package autodemo.pages;

import java.util.Arrays;

import autodemo.base.Base;

public class CompareArrays extends Base{
	
	
	
	public void arraycompare() {
		String[] ProjectDetails1 = CreateProduct.getArrayelements();
		String[] ProjectDetails2 = ProductDetails.getArrayelements();
		if(Arrays.equals(ProjectDetails1,ProjectDetails2))
			System.out.println("Details matched");
		else
			System.out.println("Details didnot match");
	}

}
