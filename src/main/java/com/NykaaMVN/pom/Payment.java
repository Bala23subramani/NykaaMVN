package com.NykaaMVN.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	
	WebDriver driver;
	
	public Payment() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@label='Card Number']")
	WebElement card;
	@FindBy (xpath ="//input[@label='Expiry (MM/YY)']")
	WebElement date;
	@FindBy (xpath ="//input[@placeholder='CVV']")
	WebElement cvv;
	@FindBy (className ="css-v61n2j e8tshxd0")
	WebElement proceed;
	@FindBy (className ="css-v61n2j e8tshxd0")
	WebElement pay;
	@FindBy (className ="checkmark")
	WebElement currency;
	@FindBy (className ="pay-btn")
	WebElement paynow;
	@FindBy (className ="css-1iwzqhf emgaj5l0")
	WebElement payment_failed;
	
	public WebElement getCard() {
		return card;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getProceed() {
		return proceed;
	}

	public WebElement getPay() {
		return pay;
	}

	public WebElement getCurrency() {
		return currency;
	}

	public WebElement getPaynow() {
		return paynow;
	}

	public WebElement getPayment_failed() {
		return payment_failed;
	}

	public void payment() {
		WebElement card = driver.findElement(By.xpath("//input[@label='Card Number']"));
		card.sendKeys("5425233430109903");
		WebElement date = driver.findElement(By.xpath("//input[@label='Expiry (MM/YY)']"));
		date.sendKeys("05/12");
		WebElement cvv = driver.findElement(By.xpath("//input[@placeholder='CVV']"));
		cvv.sendKeys("564");
		WebElement proceed = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		proceed.click();
		WebElement pay = driver.findElement(By.className("css-v61n2j e8tshxd0"));
		pay.click();
		WebElement currency = driver.findElement(By.className("checkmark"));
		currency.click();
		WebElement paynow = driver.findElement(By.className("pay-btn"));
		paynow.click();
		WebElement payment_failed = driver.findElement(By.className("css-1iwzqhf emgaj5l0"));
		payment_failed.click();
		
		
	}
}
