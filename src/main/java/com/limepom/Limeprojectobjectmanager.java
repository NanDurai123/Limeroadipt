package com.limepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import iptbase.Baseclass;

public class Limeprojectobjectmanager extends Baseclass {

	WebDriver driver;
	
	private Loginpom login;
	private Tshirtpom tshirt;
	private Jeanspom jeans;
	private Homedecpom home;
	
	public Loginpom getLogin() {
		if (login==null) {
			login = new Loginpom(driver);
			
		}
		
		return login;
	}
	public Tshirtpom getTshirt() {
		if (tshirt==null) {
			tshirt = new Tshirtpom(driver);
			
		}
		return tshirt;
	}
	public Jeanspom getJeans() {
		if (jeans==null) {
			jeans = new Jeanspom(driver);
		}
		return jeans;
	}
	public Homedecpom getHome() {
		if (home==null) {
			home = new Homedecpom(driver);
			
		}
		return home;
	}
	public Limeprojectobjectmanager(WebDriver dri) {
		driver=dri;
		PageFactory.initElements(driver, this);
		
	}
	
}
