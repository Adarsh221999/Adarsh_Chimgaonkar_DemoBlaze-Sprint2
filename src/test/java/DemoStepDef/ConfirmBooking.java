package DemoStepDef;

import com.base.Base;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConfirmBooking extends Base {
	  String URL = "https://www.demoblaze.com/";
	   ConfirmBooking cb;
	    @Before("@confirm")
	    public void initial() {
	        initialization();
	        cb = new ConfirmBooking();
	    }
	@Given("User is into confirm booking")
	public void user_is_into_confirm_booking() {
	   
	}

	@When("User clicks Confirm Booking Button")
	public void user_clicks_confirm_booking_button() {
	   
	}

	@Then("User Gets Popup shows order is booked")
	public void user_gets_popup_shows_order_is_booked() {
	    
	}

}