package com.crm.Pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TwitterAccount {
	public TwitterAccount(WebDriver driver) {
		PageFactory.initElements( driver,this);

	}

	@FindBy(linkText = "Twitter")
	private WebElement twitter;
	public WebElement twitter()
	{
		return twitter;
	}

	@FindBy(xpath = "//span[text()='Create account']")
	private WebElement create_account;
	public WebElement create_account()
	{
		return create_account;
	}

	@FindBy(xpath = "//input[@name='name']")
	private WebElement name;
	public WebElement name()
	{
		return name;
	}

	@FindBy(xpath = "//input[@name='email'] ")
	private WebElement email;
	public WebElement email()
	{
		return email;
	}

	@FindBy(id = "SELECTOR_1")
	private WebElement month;
	public WebElement month()
	{
		return month;
	}

	@FindBy(id = "SELECTOR_2")
	private WebElement day;
	public WebElement day()
	{
		return day;
	}

	@FindBy(id = "SELECTOR_3")
	private WebElement year;
	public WebElement year()
	{
		return year;
	}

}