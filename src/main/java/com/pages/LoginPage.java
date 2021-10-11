package com.pages;

import com.base.Base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends Base {
    @FindBy(xpath = "//div[@class='navbar-collapse']/ul/li[5]/a")
    WebElement getLoginBtn;

    @FindBy(id = "loginusername")
    WebElement username;

    @FindBy(id = "loginpassword")
    WebElement password;

    @FindBy(id="nameofuser")
    WebElement name;

    @FindBy(xpath = "//div[@id='logInModal']/div/div/div[3]/button[2]")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void loginPage(){
        getPage("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//div[@class='navbar-collapse']/ul/li[5]/a")).click();
        getLoginBtn.click();
    }

    public void enterLoginData(String uname,String pass){
        WebDriverWait wait = new WebDriverWait(driver,10);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername"))).sendKeys(uname);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginpassword"))).sendKeys(pass);
        wait.until(ExpectedConditions.visibilityOf(username)).sendKeys(uname);
        wait.until(ExpectedConditions.visibilityOf(password)).sendKeys(pass);
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String validateSuccessLogin(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        //return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))).getText();
        return wait.until(ExpectedConditions.visibilityOf(name)).getText();
    }

    public boolean validateInvalidLogin(){
        boolean result;
        WebDriverWait wait = new WebDriverWait(driver,5);
        try {
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            String actualResult = alert.getText();
            String expectedResult = "Wrong password.";
            System.out.println(actualResult);
            result = actualResult.equals(expectedResult);
        }catch(Exception e){
            result = false;
        }
        return result;
    }

    public void clickLogin(){
        loginBtn.click();
    }
}
