package saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import base.BaseClass;

public class CartPage extends BaseClass{
	
	@FindBy(xpath="//*[text()=\"Sauce Labs Backpack\"]")WebElement first_product;
	@FindBy(xpath="//*[text()=\"Sauce Labs Bike Light\"]")WebElement second_product;
	@FindBy(xpath="//*[@id=\"checkout\"]")WebElement checkout;
	
	
	public CartPage(WebDriver d) {
		driver=d;
		PageFactory.initElements(driver, this);
	}
public void clickCheckOutButton() {
	checkout.click();
}
public void verifyFirstProductIsDisplayed() {
	boolean expected=first_product.isDisplayed();
	Assert.assertTrue(expected);
}
public void verifySecondProductIsDispalyed() {
	boolean expected=second_product.isDisplayed();
	Assert.assertTrue(expected);
}
}
