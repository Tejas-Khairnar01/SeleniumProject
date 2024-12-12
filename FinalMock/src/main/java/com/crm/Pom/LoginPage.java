package com.crm.Pom;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
		
	}
	
	@FindBy(className = "ico-login")
	private WebElement login_link;
	
	@FindBy(id = "Email")
	private WebElement email;
	
	@FindBy(name = "Password")
	private WebElement password;
	
	@FindBy(css = "input[id='RememberMe']")
	private WebElement remember_me;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement login_button;
	
	public void login() throws IOException 
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
		prop.load(fis);
		String un = prop.getProperty("email");
		String pswd = prop.getProperty("password");
		
		login_link.click();
		email.sendKeys(un);
		password.sendKeys(pswd);
		remember_me.click();
		login_button.click();
	}
	
}