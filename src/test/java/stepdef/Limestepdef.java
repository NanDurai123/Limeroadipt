package stepdef;

import com.limepom.Limeprojectobjectmanager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iptbase.Baseclass;

public class Limestepdef extends Baseclass {
	

	Limeprojectobjectmanager pom = new Limeprojectobjectmanager(driver);

	
	@Given("launch browser")
	public void launch_browser() {
	  browserlaunch("chrome");
	 
	}
	@When("launch url")
	public void launch_url() {
	   urlLaunch("https://www.limeroad.com/?occasion=tshirt");
	}




	@When("click th element to select men option go for men page")
	public void click_th_element_to_select_men_option_go_for_men_page() {
	    scrollAndClick(pom.getLogin().getMenlog());
	}
@When("user to login profile then login to the option is given below")
public void user_to_login_profile_then_login_to_the_option_is_given_below() {
	explicitWaitVisibility(pom.getLogin().getLoginbutton(), 5);
	mouseHover(pom.getLogin().getLoginbutton());
	
}

@When("user to click the login page")
public void user_to_click_the_login_page() {
    explicitWaitVisibility(pom.getLogin().getLoginbutton(), 5);
    mouseClick(pom.getLogin().getLoginbutton());
    
}

@When("user to login for mobile number to given")
public void user_to_login_for_mobile_number_to_given() {
    explicitWaitVisibility(pom.getLogin().getMobilenumberinput(), 5);
    inputValues(pom.getLogin().getMobilenumberinput(), "6380274102");
}

@When("to click next button mobile to get opt for login")
public void to_click_next_button_mobile_to_get_opt_for_login() {
	scrollAndClick(pom.getLogin().getSubmitbutton());
   
}

@When("after given in opt to certain feild")
public void after_given_in_opt_to_certain_feild() {
   inputValues(pom.getLogin().getOtp(), getCurrentUrl());
}

@Then("after the opt to verify bouuton to click")
public void after_the_opt_to_verify_bouuton_to_click() {
    System.out.println("sucess");
}

@When("user to click the icon for tshirt")
public void user_to_click_the_icon_for_tshirt() {
    clickOnElement(pom.getTshirt().getTshirt());
}

@When("after click the model and select the product")
public void after_click_the_model_and_select_the_product() {
 scrollAndClick(pom.getTshirt().getModelsselect());
}

@When("after click the perticular product size m")
public void after_click_the_perticular_product_size_m() {
    scrollAndClick(pom.getTshirt().getSelectsize());
}

@When("after to product in add to cart")
public void after_to_product_in_add_to_cart() {
    clickOnElement(pom.getTshirt().getAddtocart());
}

@When("close the browser")
public void close_the_browser() {
    close();
}
//
//@When("user to click product in jeans")
//public void user_to_click_product_in_jeans() {
//   clickOnElement(pom.getJeans().getMensjean());
//}
//
//@When("to select the model for jeans")
//public void to_select_the_model_for_jeans() {
//   scrollAndClick(pom.getJeans().getSelectproduct());
//}
//
//@When("user to select perticular brand to choose")
//public void user_to_select_perticular_brand_to_choose() {
//  scrollAndClick(pom.getJeans().getSelectbrand());
//}
//
//@When("user want to select after size is mentioned {int}")
//public void user_want_to_select_after_size_is_mentioned(Integer int1) {
//    clickOnElement(pom.getJeans().getSelectsize());
//}
//
//@When("finally user want to click add to cart")
//public void finally_user_want_to_click_add_to_cart() {
//    clickOnElement(pom.getJeans().getAddtocart());
//}
//
//@When("after to save browser close")
//public void after_to_save_browser_close() {
//	close();
//}
//
//@When("user to click the home all items to displayed")
//public void user_to_click_the_home_all_items_to_displayed() {
//    clickOnElement(pom.getHome().getHomedec());
//}
//
//@When("ater user to choose from the bedsheet")
//public void ater_user_to_choose_from_the_bedsheet() {
//    scrollAndClick(pom.getHome().getSelectitem());
//}
//
//@When("user to click add to cart and save product")
//public void user_to_click_add_to_cart_and_save_product() {
//    clickOnElement(pom.getHome().getAddtocart());
//}
//
//@When("finally exit to browser")
//public void finally_exit_to_browser() {
//  close();
//}

}
