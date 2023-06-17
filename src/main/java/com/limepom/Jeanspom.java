package com.limepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iptbase.Baseclass;

public class Jeanspom extends Baseclass {

	WebDriver driver;
	
	@FindBy(id = "shopMen")
	private WebElement menstab;
	
	@FindBy(id = "menjeans" )
	private WebElement mensjean;
	
	@FindBy(id = "//span[@class=' h321  dB vT pR bgF wp100']")
	private WebElement selectbrand;
	
	@FindBy(id = "18462546")
	private WebElement selectproduct;
	
	
	@FindBy(id = "size_29712432")
	private WebElement selectsize;
	
	@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
	private WebElement addtocart;
	
	

	public WebElement getMenstab() {
		return menstab;
	}

	public WebElement getMensjean() {
		return mensjean;
	}

	public WebElement getSelectbrand() {
		return selectbrand;
	}

	public WebElement getSelectproduct() {
		return selectproduct;
	}

	public WebElement getSelectsize() {
		return selectsize;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}
	public Jeanspom(WebDriver dri) {
		this.driver=dri;
		PageFactory.initElements(driver, this);
		
	}
	
}
