package com.NykaaMVN.runner;

import com.NykaaMVN.base.Baseclass;
import com.NykaaMVN.pom.Login;
import com.NykaaMVN.pom.Products;

public class Testrunner extends Baseclass {

public static void main(String[] args) {
	
	Testrunner t = new Testrunner();
	t.browser_Launch();
	t.launchUrl("https://www.nykaa.com/");
	Products p = new Products();
	//Login l = new Login();
	t.clickOnElement(p.getCursor());
	//t.clickOnElement(l.getSing_in());
	
}
}
