package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmBookingPage {		
		
		@FindBy(xpath = "/html/body/div[10]/div[7]/div/button")
		WebElement okBtn;

		public void validateConfirmBooking() {
			okBtn.click();
			
		}

	}

