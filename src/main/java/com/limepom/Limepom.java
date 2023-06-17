package com.limepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iptbase.Baseclass;

public class Limepom extends Baseclass{
	public WebDriver driver;
	@FindBy(xpath="(//div[@class='fs13 fwB taC ttU vM dIb ls1 cuP'])[2]")
	private WebElement men;
	public void pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
