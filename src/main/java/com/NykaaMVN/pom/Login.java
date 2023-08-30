package com.NykaaMVN.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    
	WebDriver driver;
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (className = "css-1gzc5zn")
	WebElement sing;
	@FindBy (className = "css-ejuz3m")
	WebElement sing_in;
	@FindBy (name ="emailMobile")
	WebElement number;
	@FindBy (id ="submitVerification")
	WebElement submit;
	@FindBy (id ="otpField")
	WebElement Otp;
	@FindBy (className="button big fill full ")
	WebElement verify;
	
	public WebElement getSing() {
		return sing;
	}
	public WebElement getSing_in() {
		return sing_in;
	}
	public WebElement getNumber() {
		return number;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getOtp() {
		return Otp;
	}
	public WebElement getVerify() {
		return verify;
	}

}
