package com.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	//by locators: or Object Repository 
	private WebDriver driver;
	private By emailid = By.xpath("//input[@id='Email']");
	private By password = By.xpath("//input[@class='password']");
	private By login = By.xpath("//button[@class='button-1 login-button']");
	private By logout = By.xpath("//div[@id='navbarText']/ul/li[3]/a[text()='Logout']");
	
	//constructor of the calss:
	
	public LoginPage( WebDriver driver) {
		this.driver = driver;
	}
	
	// page actions:the feature(behavior) of the page in form of method
	
	public String get_login_page_Title() {
		return driver.getTitle();
	
	}
	
	
	public void enter_EmailID( String Emailid) {
		driver.findElement(emailid).sendKeys(Emailid);
	}
	
	
	public void enter_Password(String pwd) {
		driver.findElement(password).sendKeys(pwd);
		
	}
	
	public void click_on_login_button() {
		driver.findElement(login).click();
	}
	
	public String get_home_page_Title() {
		
		String title= driver.getTitle();
		System.out.println(title);
		return title;
		
	}
	public void click_on_logout_button() {
		driver.findElement(logout).click();
	}
	
	public void close_browser() {
		driver.close();
	}
}
	
