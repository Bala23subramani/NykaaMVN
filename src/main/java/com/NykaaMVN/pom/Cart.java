package com.NykaaMVN.pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart {
	
	WebDriver driver;
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//span[@class='cart-count']")
	WebElement Bag;
	@FindBy (className ="css-acpm4k" )
	WebElement ele;
	@FindBy (xpath = "(//p[@color='#001325'])[4]")
	WebElement drop;
	@FindBy (xpath = "(//div[@label='4'])[1]")
	WebElement drop_options;
	@FindBy (xpath = "//div[@class='css-207d6f e25lf6d6']")
	WebElement proceed;
	
	
	
	public WebElement getBag() {
		return Bag;
	}

	public WebElement getEle() {
		return ele;
	}

	public WebElement getDrop() {
		return drop;
	}

	public WebElement getDrop_options() {
		return drop_options;
	}

	public WebElement getProceed() {
		return proceed;
	}


	public void cart() {
		
		
	    WebElement Bag = driver.findElement(By.xpath("//span[@class='cart-count']"));
		Bag.click();
		
		WebElement ele = driver.findElement(By.className("css-acpm4k"));
		ele.click();
		driver.switchTo().frame(ele);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement drop = driver.findElement(By.xpath("(//p[@color='#001325'])[4]"));
		drop.click();
		WebElement drop_options = driver.findElement(By.xpath("(//div[@label='4'])[1]"));
		drop_options.click();
	
		WebElement proceed = driver.findElement(By.xpath("//div[@class='css-207d6f e25lf6d6']"));
		proceed.click();

	}
}
