package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Base;

public class BuyPage extends Base {
	JavascriptExecutor executor;
	@FindBy(xpath="//*[@id=\\\"tbodyid\\\"]/div[1]/div/a/img")
	WebElement product_Select;
	
	@FindBy(id="//*[@id=\\\"tbodyid\\\"]/div[2]/div/a")
	WebElement Add_Cart;
	
	@FindBy(xpath="//*[@id=\\\"page-wrapper\\\"]/div/div[2]/button")
	WebElement Place_Order ;
	
	@FindBy(xpath="//*[@id=\"navbarExample\"]/ul/li[4]/a")
	WebElement Cart;
	
	@FindBy(id="name")
	WebElement name;
	
	@FindBy(id="country")
	WebElement country;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="card")
	WebElement Card;
	
	@FindBy(id="month")
	WebElement Month;
	
	@FindBy(id="year")
	WebElement year;
	
	@FindBy(xpath="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	WebElement Purchase_btn;
	
	
	public BuyPage() { 
		this.executor = (JavascriptExecutor) this.driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void selectItem() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		
	}
	
	public void Addcart() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click();
        Thread.sleep(1000);    
		System.out.println("product is added");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		//Alert alert = wait.until(ExpectedConditions.alertIsPresent(By.xpath("//*[@id=\\\"tbodyid\\\"]/div[2]/div/a")));
		 Alert alert= driver.switchTo().alert();
		 System.out.println("alert closed");
		 alert.accept();
		 driver.findElement(By.xpath("//*[@id=\"cartur\"]")).click();
		 
	}
	
	public void userintocart() throws InterruptedException {
		 Thread.sleep(2000);
			driver.get("https://www.demoblaze.com/cart.html");
			 //driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );	   
	}
	
	public void PlaceOrder() throws InterruptedException {
		 Thread.sleep(1000);
			WebElement Button1= driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button"));
			//driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
			executor.executeScript("arguments[0].click();", Button1);
			Thread.sleep(1000);
			System.out.println("clicked on button");
			
			 
	}
	
   
	public void name() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Adarsh");
		
	}
	public void country() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("country")).sendKeys("India");
		
	}
	public void city() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("city")).sendKeys("Kolhapur");
		
	}
	public void card() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("card")).sendKeys("12345678");
		
	}
	public void month()  {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		driver.findElement(By.id("month")).sendKeys("octomber");
	}
	public void year() {
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		driver.findElement(By.id("year")).sendKeys("2021");
		}
	
	public void purchase() {
		//WebDriverWait wait = new WebDriverWait(driver,20);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("///div[@id='orderModal']/div/div/div[2]")));
		WebElement Button=driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]"));
		executor.executeScript("arguments[0].click();", Button);
		
	}
	public void invalidcard(){
		driver.findElement(By.id("card")).sendKeys("abcd");
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
		System.out.println("Invalid Card Number");
		
	}
		public void invalidcountry(){
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
			driver.findElement(By.id("country")).sendKeys("1234");
			System.out.println("Invalid Card country");
    }
		public void invalidcity(){
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS );
			driver.findElement(By.id("city")).sendKeys("1234");
			System.out.println("Invalid city");
    }

		public void getpopup_for_details() throws InterruptedException {
			// TODO Auto-generated method stub
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[2]/form"));
			 Thread.sleep(1000);
		}
	
	
}
