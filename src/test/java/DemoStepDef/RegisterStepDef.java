package DemoStepDef;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.base.Base;
import com.pages.RegistrationPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef extends Base {
    String URL = "https://www.demoblaze.com/";
    RegistrationPage rp;
    @Before("@register")
    public void initial() {
        initialization();
        rp = new RegistrationPage();
    }

    @Given("^r\\-User enters DemoBlaze url$")
    public void user_enters_demo_blaze_url() {
        getPage(URL);
    }

    @Then("^r\\-User should be able to navigate to url successfully$")
    public void user_should_be_able_to_navigate_to_url_successfully() {
        String expectedTitle = "STORE";
        String actualTitle = rp.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Given("^r\\-User is on Registration Page$")
    public void user_is_on_registration_page() {
        //rp.initialization(URL);
        getPage(URL);
    }


    @When("^r\\-User enters (.+) and (.+)$")
    public void user_enters_and(String username, String password) throws Throwable {
        System.out.println(username+" "+password);
        rp.Registration(username, password);
    }

    @When("^r\\-User clicks on Signup Button$")
    public void user_clicks_on_signup_button() {
        rp.clickSignUp();
    }

    @Then("^r\\-User should be able to Register successfully$")
    public void user_should_be_able_to_register_successfully() {
        String actualResult = rp.validateSignUp();
        String expectedResult1 = "This user already exist.";
        String expectedResult2 = "Sign up successful.";

        if(actualResult.equals(expectedResult1) ) {
            Assert.assertTrue(true);
        }
        else if(actualResult.equals(expectedResult2) ){
            Assert.assertTrue(true);
        }else {
            Assert.assertTrue(false);
        }

    }

    @After("@register")
    public void finish(){
        tearDown();
    }

}
