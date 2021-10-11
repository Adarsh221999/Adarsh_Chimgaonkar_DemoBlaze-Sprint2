package DemoStepDef;

import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.pages.BuyPage;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyItem {
	WebDriver driver;
	BuyPage bp=new BuyPage();
	String url="https://www.demoblaze.com/";
	@Given("User is on HomePage")
	
	public void user_is_on_home_page() {
	   bp.initialization(); 
	}

	@When("User Selects Product")
	public void user_selects_product() throws InterruptedException {

	  bp.selectItem();
	}

	@Then("User Clicks AddCart Button")
	public void user_clicks_add_cart_button() throws InterruptedException {
	  bp.Addcart();
	}

	@Given("User is into cart")
	public void user_is_into_cart() throws InterruptedException {
	 bp.userintocart();
	}

	@When("User clicks PlaceOrder")
	public void user_clicks_place_order() throws InterruptedException {
	 bp.PlaceOrder();
	}

	@Then("User Gets Popup For Details")
	public void user_gets_popup_for_details() throws InterruptedException {
	 bp.getpopup_for_details();  
	}

	@Given("User is on cart and Clicks PlaceOrder")
	public void user_is_on_cart_and_clicks_purchase1() throws InterruptedException {
		bp.userintocart();
		bp.PlaceOrder();
	  
	}

	@When("User is on Popup Details of buy item")
	public void user_is_on_popup_details_of_buy_item() {
	    
	}

	@When("User Enters Name")
	public void user_enters_name() throws InterruptedException {
	   bp.name();
	}

	@When("User Enters Country")
	public void user_enters_country() throws InterruptedException {
	   bp.country();
	}

	@When("User Enters City")
	public void user_enters_city() throws InterruptedException {
	bp.city();
	}

	@When("User Enters CreditCard")
	public void user_enters_credit_card() throws InterruptedException {
	    bp.card();
	}

	@When("User Enters Month")
	public void user_enters_month() {
	    bp.month();
	}

	@When("User Enters Year")
	public void user_enters_year() {
	    bp.year();
	}

	@Then("User Clicks Purchase")
	public void user_clicks_purchase() {
	   bp.purchase();
	}


	@When("User Enters Invalid CreditCard")
	public void user_enters_invalid_credit_card() {
		bp.invalidcard();
	   
	}


	@When("User Enters  Invalid Country")
	public void user_enters_invalid_country() {
	    bp.invalidcountry();
	}

	@When("User Enters Invalid City")
	public void user_enters_invalid_city() {
	   bp.invalidcity();
	}


	
	
	
}
	
