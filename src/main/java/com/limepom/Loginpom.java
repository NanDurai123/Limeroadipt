package com.limepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iptbase.Baseclass;

public class Loginpom extends Baseclass {
	public WebDriver driver;
	
	@FindBy(xpath = "(//div[@class='pR h48 br8 dTc vM c3 bgL wsN bxs'])[1]")
	private WebElement menlog;
	
	@FindBy(xpath = "(//div[@class='c3 fs10 ttU taC ls5 pt4'])[4]")
	private WebElement loginprofile;
	
	@FindBy(xpath = "//a[@class='br4 cF fs12 ls5 p8 tdN ttU bgRedgrad skpTrSngUp']")
	private WebElement loginbutton;
	
	
	@FindBy(id = "emph")
	private WebElement mobilenumberinput;
	
	@FindBy(xpath = "//input[@value='NEXT']")
	private WebElement submitbutton;

	@FindBy(id = "otp")
	private WebElement otp;
	
	@FindBy(id = "modify_for_ctob")
	private WebElement verifyotp;
	


	public WebElement getMenlog() {
		return menlog;
	}

	public WebElement getLoginprofile() {
		return loginprofile;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getMobilenumberinput() {
		return mobilenumberinput;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}

	public WebElement getOtp() {
		return otp;
	}

	public WebElement getVerifyotp() {
		return verifyotp;
	}
	
	
	public Loginpom(WebDriver dri)
	{
		this.driver=dri;
		PageFactory.initElements(driver, this);
	}
	

}
