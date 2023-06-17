package com.limepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iptbase.Baseclass;

public class Homedecpom extends Baseclass {
	WebDriver driver;
	
	@FindBy(id ="shopMen")
	private WebElement men;
	
	
	@FindBy(id = "homedecormen")
	private WebElement homedec;
	
	@FindBy(id = "646a5fd1f38057080f539142")
	private WebElement selectproduct;
	
	@FindBy(id = "19179898")
	private WebElement selectitem;
	
	@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
	private WebElement addtocart;

	
	public WebElement getMen() {
		return men;
	}

	public WebElement getHomedec() {
		return homedec;
	}

	public WebElement getSelectproduct() {
		return selectproduct;
	}

	public WebElement getSelectitem() {
		return selectitem;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	public Homedecpom(WebDriver dri) {
		driver = dri;
		PageFactory.initElements(driver, this);
		
		
	}

}
