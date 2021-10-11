package DemoStepDef;

import com.base.Base;
import com.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginStepDef extends Base {
    LoginPage lp;

    @Before("@login")
    public void initial(){
        initialization();
        lp = new LoginPage();
    }

    @Given("^l\\-User enters DemoBlaze url$")
    public void luser_enters_demoblaze_url(){
        getPage("https://www.demoblaze.com/");
    }

    @Given("^l\\-User is on Login Page$")
    public void luser_is_on_login_page(){
        lp.loginPage();
    }

    @When("^l-User enters (.+) and (.+)$")
    public void luser_enters_and(String username, String password){
        lp.enterLoginData(username,password);
    }

    @Then("^l\\-User should be able to navigate to url successfully$")
    public void luser_should_be_able_to_navigate_to_url_successfully(){
        String actualResult = lp.getTitle();
        String expectedResult = "STORE";
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Then("^l\\-User should be able to Login successfully (.+)$")
    public void luser_should_be_able_to_login_successfully(String username){
        String actualResult = lp.validateSuccessLogin();
        String expectedResult = "Welcome "+username;
        System.out.println(expectedResult);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Then("l-User should be not able to Login successfully")
    public void luser_should_not_be_able_to_login_successfully(){
        Assert.assertEquals(lp.validateInvalidLogin(),true);
    }

    @And("^l\\-User clicks on Login Button$")
    public void luser_clicks_on_login_button(){
        lp.clickLogin();
    }

    @After("@login")
    public void finish(){
        tearDown();
    }
}
