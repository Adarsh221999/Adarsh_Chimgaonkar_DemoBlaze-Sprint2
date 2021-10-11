package DemoStepDef;

import org.testng.Assert;

import com.base.Base;
import com.pages.SearchFunction;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef extends Base {
    SearchFunction s;
    String URL = "https://www.demoblaze.com/";


    @Before("@search")
    public void initial(){
        initialization();
        s =  new SearchFunction();

    }


    @Given("User is on homepage")
    public void user_is_on_homepage() {
        getPage(URL);
    }

    @When("User clicks on Phone category")
    public void user_clicks_on_phone_category() {
        s.clickCategory("PHONE");
    }

    @Then("User should be able to successfully filter products by PHONE category.")
    public void user_should_be_able_to_successfully_filter_products_by_phone_category() {
        String expectedResult = "Samsung galaxy s6";
        String actualResult = s.validateSearch("PHONE") ;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @When("User clicks on LAPTOP category")
    public void user_clicks_on_laptop_category() {
        s.clickCategory("LAPTOP");
    }

    @Then("User should be able to successfully filter products by LAPTOP category.")
    public void user_should_be_able_to_successfully_filter_products_by_laptop_category() {
        String expectedResult = "Sony vaio i5";
        String actualResult = s.validateSearch("LAPTOP") ;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @When("User clicks on MONITOR category")
    public void user_clicks_on_monitor_category() {
        s.clickCategory("MONITOR");
    }

    @Then("User should be able to successfully filter products by MONITORS category.")
    public void user_should_be_able_to_successfully_filter_products_by_monitors_category() {
        String expectedResult = "Apple monitor 24";
        String actualResult = s.validateSearch("MONITOR") ;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @When("User clicks on a product")
    public void user_clicks_on_a_product() {
        s.clickProduct();
    }

    @When("User clicks on add to cart button")
    public void user_clicks_on_add_to_cart_button() {
        s.clickAddCart();
    }

    @When("User clicks on cart button")
    public void user_clicks_on_cart_button() {
        s.clickCart();
    }

    @Then("User should be able to successfully see the product in their cart.")
    public void user_should_be_able_to_successfully_see_the_product_in_their_cart() {
        String actualResult = s.validateAddCart();
        String expectedResult = s.product;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @After("@search")
    public void finish() {
        s.tearDown();
    }

}
