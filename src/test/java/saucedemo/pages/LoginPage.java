package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(xpath="//*[@id=\"user-name\"]")WebElement username;
	@FindBy(xpath="//*[@id=\"password\"]")WebElement password;
	@FindBy(xpath="//*[@id=\"login-button\"]")WebElement login_button;
	
	public LoginPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	public void login(String uname,String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		login_button.click();
	}
}
