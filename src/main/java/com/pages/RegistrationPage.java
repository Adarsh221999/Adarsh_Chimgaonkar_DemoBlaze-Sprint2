package com.pages;

import com.base.Base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegistrationPage extends Base {
    @FindBy(xpath="//*[@id=\"sign-username\"]")
    WebElement username;


    @FindBy(xpath = "//*[@id=\"sign-password\"]")
    WebElement password;

    @FindBy(xpath="//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")
    WebElement btn;

    @FindBy(xpath="//div[@class='navbar-collapse']/ul/li[8]/a")
    WebElement signinBtn;


    JavascriptExecutor executor;


    public RegistrationPage() {
        this.executor = (JavascriptExecutor) this.driver;
        PageFactory.initElements(driver, this);
    }

    public String getTitle() {
        return driver.getTitle();
    }


    public void Registration (String uName,String pass){
        executor.executeScript("arguments[0].click();", signinBtn);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(username));
        username.sendKeys(uName);
        password.sendKeys(pass);

    }

    public void clickSignUp() {
        btn.click();
    }

    public String validateSignUp() {
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String text = alert.getText();
        System.out.println(text);
        alert.accept();
        return text;
    }

    /*public static void main(String[] args) {
        RegistrationPage r = new RegistrationPage();
        r.initialization();
        r.Registration("admin", "admin123");
        r.clickSignUp();
        r.validateSignUp();
    }*/



}
