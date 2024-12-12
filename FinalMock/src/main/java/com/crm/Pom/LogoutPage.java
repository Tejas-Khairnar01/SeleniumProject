package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

	public LogoutPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className = "ico-logout")
	private WebElement logout_icon;
	public WebElement logout()
	{
		return logout_icon;
	}
	
}