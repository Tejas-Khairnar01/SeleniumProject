package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookAccount {
	public FacebookAccount(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(linkText = "Facebook")
	private WebElement facebook;
	public WebElement facebook() {
		return facebook;
		
	}
	
	@FindBy(xpath = "//span[text()='Create new account']")
	private WebElement createAccount;
	public WebElement createAccount() {
		return createAccount;
		
	}
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	public WebElement firstname() {
		return firstname;
		
	}
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastname;
	public WebElement lastname() {
		return lastname;
		
	}
	
	@FindBy(id = "day")
	private WebElement day;
	public WebElement day() {
		return day;
		
	}
	
	@FindBy(id = "month")
	private WebElement month;
	public WebElement month() {
		return month;
		
	}
	@FindBy(id = "year")
	private WebElement year;
	public WebElement year() {
		return year;
		
	}
	
	@FindBy(xpath = "//input[@value='2']")
	private WebElement gender;
	public WebElement gender() {
		return gender;
		
	}
	
	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement mob_no;
	public WebElement mob_no() {
		return mob_no;
		
	}
	
	@FindBy(xpath = "//input[@data-type='password']")
	private WebElement psw;
	public WebElement psw() {
		return psw;
		
	}
	
	@FindBy(id = "u_0_n_OW")
	private WebElement sign_out;
	public WebElement sign_out() {
		return sign_out;
		
	}
}