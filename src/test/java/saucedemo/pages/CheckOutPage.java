package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class CheckOutPage extends BaseClass {
	
	@FindBy(xpath="//*[@id=\"first-name\"]")WebElement firstname;
	@FindBy(xpath="//*[@id=\"last-name\"]")WebElement lastname;
	@FindBy(xpath="//*[@id=\"postal-code\"]")WebElement zipcode;
	@FindBy(xpath="//*[@id=\"continue\"]")WebElement continue_button;
	@FindBy(xpath="//*[@id=\"finish\"]")WebElement finish_button;
	@FindBy(xpath="//*[text()=\"Thank you for your order!\"]")WebElement message;
	
	public CheckOutPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
	public void enterInformation(String fname,String lname,String zcode) {
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		zipcode.sendKeys(zcode);
	}
	public void clickContinueButton() {
		continue_button.click();
	}
	public void clickFinishButton() {
		finish_button.click();
	}
	public void verifyDisplayMessage() {
		boolean expected=message.isDisplayed();
		Assert.assertTrue(expected);
	}
}
