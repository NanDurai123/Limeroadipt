package com.limepom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import iptbase.Baseclass;

public class Tshirtpom extends Baseclass {
		public WebDriver driver;
		
		@FindBy(id = "shopMen")
		private WebElement menstab;
		
		@FindBy(id = "tshirt")
		private WebElement tshirt;
		
		@FindBy(id = "646df12913cb38083784809e")
		private WebElement modelsselect;
		
		@FindBy(id = "18414556")
		private WebElement selectitem;
		
		
		@FindBy(id = "size_29554152")
		private WebElement selectsize;
		
		@FindBy(xpath = "//div[@data-pgn='Add to Cart']")
		private WebElement addtocart;
		

		public WebElement getMenstab() {
			return menstab;
		}

		public WebElement getTshirt() {
			return tshirt;
		}

		public WebElement getModelsselect() {
			return modelsselect;
		}

		public WebElement getSelectitem() {
			return selectitem;
		}

		public WebElement getSelectsize() {
			return selectsize;
		}

		public WebElement getAddtocart() {
			return addtocart;
		}
		public Tshirtpom(WebDriver dri) {
		this.driver=dri;
			PageFactory.initElements(driver, this);
		}

}
